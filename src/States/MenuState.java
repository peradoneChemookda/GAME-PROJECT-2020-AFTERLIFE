package States;

import java.awt.Graphics;
import java.awt.Image;

import GFX.Asset;
import Main.Handler;
import World.World;

public class MenuState extends State{
	public MenuState(Handler handler) {
		super(handler);
	}

	@Override
	public void update() {
		
	}

	@Override
	public void render() {
		//handler.getGraphics().drawImage(Asset.cutscene_1_1, 0, 0, null);
	}

	@Override
	public World getWorld() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
