package States;

import Dialogs.Dialog;
import GFX.Asset;
import Main.Handler;
import World.GymRoom;
import World.MathRoom;
import World.World;

public class GymRoomState extends State{
	
	private World gymRoom;
	private Dialog dialog;

	public GymRoomState(Handler handler) {
		super(handler);
		gymRoom = new GymRoom(handler,200,300);
		dialog = new Dialog(handler);
		dialog.setDialogStatusState(true);
	}
	
	public World getWorld() {
		return gymRoom;
	}

	@Override
	public void update() {
		gymRoom.update();
		
	}

	@Override
	public void render() {
		gymRoom.render();
		handler.getGraphics().drawImage(Asset.p_friendGroup_idle, (int) (400 - handler.getGameCamera().getxOffset()), 280, null);
		handler.getGraphics().drawImage(Asset.c_friendGroup_idle, (int) (800 - handler.getGameCamera().getxOffset()), 280, null);
		handler.getGraphics().drawImage(Asset.crush_idle, (int) (900 - handler.getGameCamera().getxOffset()), 280, null);
		handler.getGraphics().drawImage(Asset.teacher2, (int) (1000 - handler.getGameCamera().getxOffset()), 280, null);
		if(dialog.getDialogStatusState()) {
			handler.getGraphics().drawImage(dialog.getDialogBoxState(), 0, 0, 1920, 300, null);
		}
	}
	
}
