package States.Scenes;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import Audio.SoundGame;
import GFX.Asset;
import Main.Handler;
import States.State;
import World.World;

public class Cutscene_2 extends State {
	private BufferedImage[] cutscene_2 = { Asset.cutscene_2_1_1, Asset.cutscene_2_1_2, Asset.cutscene_2_2_1,
			Asset.cutscene_2_2_2, Asset.cutscene_2_2_3, Asset.cutscene_2_2_4, Asset.cutscene_2_3_1,
			Asset.cutscene_2_3_2, Asset.cutscene_2_3_3, Asset.cutscene_2_3_4, Asset.cutscene_2_4_1,
			Asset.cutscene_2_4_2, Asset.cutscene_2_4_3, Asset.cutscene_2_4_4, Asset.cutscene_2_4_5,
			Asset.cutscene_2_5_1, Asset.cutscene_2_5_2, Asset.cutscene_2_5_3, Asset.cutscene_2_5_4,
			Asset.cutscene_2_5_5, Asset.cutscene_2_5_6, Asset.cutscene_2_5_7, Asset.cutscene_2_5_8,
			Asset.cutscene_2_5_9, Asset.cutscene_2_5_10, Asset.cutscene_2_5_11, Asset.cutscene_2_5_12,
			Asset.cutscene_2_5_13, Asset.cutscene_2_5_14, Asset.cutscene_2_6_1, Asset.cutscene_2_6_2,
			Asset.cutscene_2_6_3, Asset.cutscene_2_6_4, Asset.cutscene_2_6_5, Asset.cutscene_2_7_1,
			Asset.cutscene_2_7_2, Asset.cutscene_2_7_3, Asset.cutscene_2_7_4, Asset.cutscene_2_8_1,
			Asset.cutscene_2_8_2, Asset.cutscene_2_8_3, Asset.cutscene_2_8_4, Asset.cutscene_2_8_5,
			Asset.cutscene_2_9_1, Asset.cutscene_2_9_2, Asset.cutscene_2_10_1, Asset.cutscene_2_10_2,
			Asset.cutscene_2_10_3, Asset.cutscene_2_11_1, Asset.cutscene_2_11_2, Asset.cutscene_2_11_3,
			Asset.cutscene_2_12_1, Asset.cutscene_2_12_2, Asset.cutscene_2_13_1, Asset.cutscene_2_13_2,
			Asset.cutscene_2_13_3, Asset.cutscene_2_13_4, Asset.cutscene_2_14_1 };
	private int index = 0;
	private long timer = 0, lastTime = System.currentTimeMillis();
	private float alpha = 1f;
	private boolean changeScene = false;

	public Cutscene_2(Handler handler) {
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
					System.out.println(index);
					lastTime = System.currentTimeMillis();
				}

				if (index >= cutscene_2.length) {
					index = 0;
					SoundGame.CUT2.stop();
					SoundGame.GAMEPLAY.play();
					handler.setCurrentWorld(handler.getGame().outerSchool2.getWorld());
					State.setCurrentState(handler.getGame().outerSchool2);
					handler.setMove(false);
				}
			}
		}
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		handler.getGraphics().drawImage(cutscene_2[index], 0, 0, null);
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
