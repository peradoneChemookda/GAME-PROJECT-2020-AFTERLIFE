package States;

import java.awt.Graphics;

import Dialogs.Dialog;
import Entities.EntityManager;
import Entities.Creature.Player;
import Main.Handler;
import World.OuterSchool;
import World.World;

public class GameState extends State{

	// CLASSES
	private World outerSchool;
	private Dialog dialog;

	
	// CONSTRUCTOR
	public GameState(Handler handler) {
		super(handler);
		outerSchool = new OuterSchool(handler,200,300);
		dialog = new Dialog(handler);
		dialog.setDialogStatusState(true);
		handler.setMove(false);
	}

	// UPDATE FRAME PER SECOND 
	@Override
	public void update() {
		outerSchool.update();
	}

	// RENDER GRAPHIC AFTER UPDATE
	@Override
	public void render() {
		//System.out.println(handler.getDialogStatusState());
		outerSchool.render();
		if(dialog.getDialogStatusState()) {
			handler.getGraphics().drawImage(dialog.getDialogBoxState(), 0, 0, 1920, 300, null);
		}
	}

	@Override
	public World getWorld() {
		// TODO Auto-generated method stub
		return null;
	}

}
