package States;

import java.awt.Graphics;

import Main.Handler;
import World.World;

public abstract class State {
	
	// CURRENT STATE
	public static State currentState = null;
	
	// HANDLER
	protected Handler handler;
	
	// CONSTRUCTOR
	public State(Handler handler) {
		this.handler = handler;
	}
	
	// GETTER METHOD
	public static State getCurrentState() {
		return currentState;
	}

	// SETTER METHOD
	public static void setCurrentState(State currentState) {
		State.currentState = currentState;
	}
	
	// ABSTRACT METHOD
	public abstract void update();
	public abstract void render();
	public abstract World getWorld();
	
}	
