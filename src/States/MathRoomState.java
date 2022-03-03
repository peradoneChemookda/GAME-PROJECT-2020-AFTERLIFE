package States;

import Dialogs.Dialog;
import GFX.Asset;
import Main.Handler;
import World.MathRoom;
import World.World;

public class MathRoomState extends State{
	
	private World mathRoom;
	private Dialog dialog;

	public MathRoomState(Handler handler) {
		super(handler);
		mathRoom = new MathRoom(handler,200,300);
		dialog = new Dialog(handler);
		dialog.setDialogStatusState(true);
	}
	
	public World getWorld() {
		return mathRoom;
	}

	@Override
	public void update() {
		mathRoom.update();
		
	}

	@Override
	public void render() {
		mathRoom.render();
		handler.getGraphics().drawImage(Asset.p_friendGroup_idle, (int) (400 - handler.getGameCamera().getxOffset()), 280, null);
		handler.getGraphics().drawImage(Asset.c_friendGroup_idle, (int) (800 - handler.getGameCamera().getxOffset()), 280, null);
		handler.getGraphics().drawImage(Asset.crush_idle, (int) (900 - handler.getGameCamera().getxOffset()), 280, null);
		handler.getGraphics().drawImage(Asset.teacher1, (int) (1000 - handler.getGameCamera().getxOffset()), 280, null);
		if(dialog.getDialogStatusState()) {
			handler.getGraphics().drawImage(dialog.getDialogBoxState(), 0, 0, 1920, 300, null);
		}
	}

}
