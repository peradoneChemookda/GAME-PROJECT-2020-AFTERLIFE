package States;

import Dialogs.Dialog;
import Main.Handler;
import World.InnerSchool2;
import World.World;

public class InnerSchoolState2 extends State{
	
	private World innerSchool2;
	private Dialog dialog;

	public InnerSchoolState2(Handler handler) {
		super(handler);
		innerSchool2 = new InnerSchool2(handler,200,300);
		dialog = new Dialog(handler);
		dialog.setDialogStatusState(true);
	}
	
	public World getWorld() {
		return innerSchool2;
	}

	@Override
	public void update() {
		innerSchool2.update();
		
	}

	@Override
	public void render() {
		innerSchool2.render();
		if(dialog.getDialogStatusState()) {
			handler.getGraphics().drawImage(dialog.getDialogBoxState(), 0, 0, 1920, 300, null);
		}
	}
	
}
