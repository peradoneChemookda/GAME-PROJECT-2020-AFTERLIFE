package States;

import Dialogs.Dialog;
import Main.Handler;
import World.OuterSchool2;
import World.World;

public class OuterSchoolState2 extends State{

	private World outerSchool2;
	private Dialog dialog;

	public OuterSchoolState2(Handler handler) {
		super(handler);
		outerSchool2 = new OuterSchool2(handler,200,300);
		dialog = new Dialog(handler);
		dialog.setDialogStatusState(true);
	}
	
	public World getWorld() {
		return outerSchool2;
	}

	@Override
	public void update() {
		outerSchool2.update();
		
	}

	@Override
	public void render() {
		outerSchool2.render();
		if(dialog.getDialogStatusState()) {
			handler.getGraphics().drawImage(dialog.getDialogBoxState(), 0, 0, 1920, 300, null);
		}
	}
	
}
