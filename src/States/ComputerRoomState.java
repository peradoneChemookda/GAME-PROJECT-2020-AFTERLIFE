package States;

import Dialogs.Dialog;
import GFX.Asset;
import Main.Handler;
import World.ComputerRoom;
import World.MathRoom;
import World.World;

public class ComputerRoomState extends State{

	private World computerRoom;
	private Dialog dialog;

	public ComputerRoomState(Handler handler) {
		super(handler);
		computerRoom = new ComputerRoom(handler,200,300);
		dialog = new Dialog(handler);
		dialog.setDialogStatusState(true);
	}
	
	public World getWorld() {
		return computerRoom;
	}

	@Override
	public void update() {
		computerRoom.update();
		
	}

	@Override
	public void render() {
		computerRoom.render();
		handler.getGraphics().drawImage(Asset.p_friendGroup_idle, (int) (400 - handler.getGameCamera().getxOffset()), 280, null);
		handler.getGraphics().drawImage(Asset.c_friendGroup_idle, (int) (800 - handler.getGameCamera().getxOffset()), 280, null);
		handler.getGraphics().drawImage(Asset.crush_idle, (int) (900 - handler.getGameCamera().getxOffset()), 280, null);
		handler.getGraphics().drawImage(Asset.teacher3, (int) (1000 - handler.getGameCamera().getxOffset()), 280, null);
		if(dialog.getDialogStatusState()) {
			handler.getGraphics().drawImage(dialog.getDialogBoxState(), 0, 0, 1920, 300, null);
		}
	}

	
}
