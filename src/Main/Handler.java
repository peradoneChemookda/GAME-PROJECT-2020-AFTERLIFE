package Main;

import java.awt.Graphics;

import Dialogs.Dialog;
import Display.Display;
import GFX.GameCamera;
import Input.KeyManager;
import World.World;

public class Handler {
	
	// CLASSES
	private Game game;
	private Display display;
	private KeyManager keyManager;
	private GameCamera gameCamera;
	private World currentWorld;
	private Graphics g; 

	// VARIABLE
	boolean dialogStatus = false;
	boolean dialogStatusState = false;
	boolean move = true;
	
	// MOVE
	public void setMove(boolean move){
		this.move = move;
	}
	public boolean getMove() {
		return move;
	}
	
	// SET METHOD
	public void setGame(Game game) {
		this.game = game;
	}
	
	public void setDisplay(Display display) {
		this.display = display;
	}
	
	public void setKeyManager(KeyManager keyManager) {
		this.keyManager = keyManager;
	}
	
	public void setGameCamera(GameCamera gameCamera) {
		this.gameCamera = gameCamera;
	}
	
	public void setCurrentWorld(World currentWorld) {
		this.currentWorld = currentWorld;
	}
	
	public void setGraphics(Graphics g) {
		this.g = g;
	}

	// GET METHOD
	public Game getGame() {
		return game;
	}

	public Display getDisplay() {
		return display;
	}
	
	public KeyManager getKeyManager() {
		return keyManager;
	}
	
	public GameCamera getGameCamera() {
		return gameCamera;
	}
	
	public World getCurrentWorld() {
		return currentWorld;
	}
	
	public Graphics getGraphics() {
		return g;
	}
	
	public void setDialogStatus(boolean status) {
		this.dialogStatus = status;
	}
	
	public boolean getDialogStatus() {
		return dialogStatus;
	}

	public boolean getDialogStatusState() {
		return dialogStatusState;
	}

	public void setDialogStatusState(boolean dialogStatusState) {
		this.dialogStatusState = dialogStatusState;
	}
	
	
	
}

