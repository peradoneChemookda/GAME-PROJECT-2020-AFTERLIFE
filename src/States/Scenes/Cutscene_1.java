package States.Scenes;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import Audio.SoundGame;
import GFX.Asset;
import Main.Handler;
import States.State;
import World.World;

public class Cutscene_1 extends State {
	private  BufferedImage[] cutscene_1 = { Asset.cutscene_1_1_1, Asset.cutscene_1_1_2, Asset.cutscene_1_1_3,
			Asset.cutscene_1_1_4, Asset.cutscene_1_2_1, Asset.cutscene_1_2_2, Asset.cutscene_1_3_1,
			Asset.cutscene_1_3_2, Asset.cutscene_1_4_1, Asset.cutscene_1_4_2, Asset.cutscene_1_4_3,
			Asset.cutscene_1_4_4, Asset.cutscene_1_4_5, Asset.cutscene_1_5_1, Asset.cutscene_1_5_2,
			Asset.cutscene_1_6_1, Asset.cutscene_1_7_1, Asset.cutscene_1_7_2, Asset.cutscene_1_8_1,
			Asset.cutscene_1_8_2, Asset.cutscene_1_9_1, Asset.cutscene_1_9_2, Asset.cutscene_1_9_3,
			Asset.cutscene_1_10_1, Asset.cutscene_1_10_2, Asset.cutscene_1_11_1 };
	private int index = 0;
	private long timer = 0, lastTime = System.currentTimeMillis();
	private float alpha = 1f;
	private boolean changeScene = false;

	public Cutscene_1(Handler handler) {
		super(handler);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		if (timer <= 1000) {
			timer += System.currentTimeMillis() - lastTime;
			lastTime = System.currentTimeMillis();
		}

		if (handler.getKeyManager().next || changeScene == true) {
			if (timer >= 1000) {
				changeScene = true;
				if (alpha == 1f) {
					index++;
					changeScene = false;
					timer = 0;
					lastTime = System.currentTimeMillis();
					if (index >= cutscene_1.length) {
						index = 0;
						State.setCurrentState(handler.getGame().gameState);
						SoundGame.CUT1.stop();
						SoundGame.GAMEPLAY.play();
					}
				}
			}
		}
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		handler.getGraphics().drawImage(cutscene_1[index], 0, 0, null);
		if (changeScene == true) {
			fadeIn();
		} else {
			fadeOut();
		}
	}

	// FADE OUT
	public void fadeOut() {
		if (alpha >= 0) {
			handler.getGraphics().setColor(new Color(0, 0, 0, alpha));
			handler.getGraphics().fillRect(0, 0, handler.getDisplay().getWidth(), handler.getDisplay().getHeight());
			alpha -= 0.05f;
		}
	}

	// FADE IN
	public void fadeIn() {
		if (alpha <= 1) {
			alpha += 0.05f;
			handler.getGraphics().setColor(new Color(0, 0, 0, alpha));
			handler.getGraphics().fillRect(0, 0, handler.getDisplay().getWidth(), handler.getDisplay().getHeight());
		}
	}

	@Override
	public World getWorld() {
		// TODO Auto-generated method stub
		return null;
	}
}
