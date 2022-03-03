package Entities.Creature;

import java.awt.Color;

import Audio.SoundGame;
import Entities.Entity;
import Main.Handler;
import States.State;

public abstract class Creature extends Entity {

	// VARIABLE
	protected float speed;
	protected float xMove;

	// CONSTRUCTOR
	public Creature(Handler handler, float x, float y, int width, int height, float speed) {
		super(handler, x, y, width, height);
		this.speed = speed;
		xMove = 0;

	}

	// MOVE ENTITY
	public void move() {
		if (handler.getMove()) {
			if (checkEntityCollisions(xMove) == "move") {
				x += xMove;
			} 
			
			else if (checkEntityCollisions(xMove) == "comeInSchool") {
				handler.getGame().setAlpha(1);
				handler.setCurrentWorld(handler.getGame().innerSchoolState.getWorld());
				State.setCurrentState(handler.getGame().innerSchoolState);
			} 
			
			else if (checkEntityCollisions(xMove) == "comeInMathRoom") {
				handler.getGame().setAlpha(1);
				handler.setCurrentWorld(handler.getGame().mathRoomState.getWorld());
				State.setCurrentState(handler.getGame().mathRoomState);
				handler.setMove(false);
			}
			
			else if (checkEntityCollisions(xMove) == "comeInGymRoom") {
				handler.getGame().setAlpha(1);
				handler.setCurrentWorld(handler.getGame().gymRoomState.getWorld());
				State.setCurrentState(handler.getGame().gymRoomState);
				handler.setMove(false);
			}
			
			else if (checkEntityCollisions(xMove) == "endDialogCutscene1") {
				handler.getGame().setAlpha(1);
				State.setCurrentState(handler.getGame().cutscene_2);
				SoundGame.GAMEPLAY.stop();
				SoundGame.CUT2.play();
			}
			
			else if (checkEntityCollisions(xMove) == "comeInSchool2") {
				handler.getGame().setAlpha(1);
				handler.setCurrentWorld(handler.getGame().innerSchool2.getWorld());
				State.setCurrentState(handler.getGame().innerSchool2);
				handler.setMove(false);
			}
			
			else if (checkEntityCollisions(xMove) == "comeInComputerRoom") {
				handler.getGame().setAlpha(1);
				handler.setCurrentWorld(handler.getGame().computerRoomState.getWorld());
				State.setCurrentState(handler.getGame().computerRoomState);
				handler.setMove(false);
			}
			
			else if (checkEntityCollisions(xMove) == "isNpc") {
			}
		}
	}
}
