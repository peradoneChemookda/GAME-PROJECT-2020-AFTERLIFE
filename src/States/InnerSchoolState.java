package States;

import Dialogs.Dialog;
import Main.Handler;
import World.InnerSchool;
import World.World;

public class InnerSchoolState extends State {
	
	private World innerSchool;

	public InnerSchoolState(Handler handler) {
		super(handler);
		innerSchool = new InnerSchool(handler,200,300);
	}
	
	public World getWorld() {
		return innerSchool;
	}

	@Override
	public void update() {
		innerSchool.update();
		
	}

	@Override
	public void render() {
		innerSchool.render();
	}

}
