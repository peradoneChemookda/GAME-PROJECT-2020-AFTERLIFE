package Entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import Dialogs.Dialog;
import Main.Handler;
import States.State;

public abstract class Entity {
	// VARIABLE
	protected float x, y;
	protected int width, height;
	protected Rectangle bounds = new Rectangle(0,0,0,0);

	// CLASSES
	protected Handler handler;

	// CONSTRUCTOR
	public Entity(Handler handler, float x, float y, int width, int height) {
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	// CHECK COLLISIONS FOR EVENT
	public String checkEntityCollisions(float xOffset){
		for(Entity e : handler.getCurrentWorld().getEntityManager().getEntities()){
			if(e.equals(this))
				continue;
			if(e.isSolid() && e.getCollisionBounds(0f).intersects(getCollisionBounds(xOffset)))
				return "solid";
			if(e.isChangeState() && e.getCollisionBounds(0f).intersects(getCollisionBounds(xOffset)) && handler.getKeyManager().interact && e.getClass().getName() == "Entities.StaticEntities.ComeInSchool" && State.currentState == handler.getGame().gameState)
				return "comeInSchool";
			if(e.isChangeState() && e.getCollisionBounds(0f).intersects(getCollisionBounds(xOffset)) && handler.getKeyManager().interact && e.getClass().getName() == "Entities.StaticEntities.ComeMathRoom")
				return "comeInMathRoom";
			if(e.isChangeState() && e.getCollisionBounds(0f).intersects(getCollisionBounds(xOffset)) && handler.getKeyManager().interact && e.getClass().getName() == "Entities.StaticEntities.ComeGymRoom")
				return "comeInGymRoom";
			if(e.isChangeState() && e.getCollisionBounds(0f).intersects(getCollisionBounds(xOffset)) && handler.getKeyManager().interact && e.getClass().getName() == "Entities.StaticEntities.EndDialogCutscene1")
				return "endDialogCutscene1";
			if(e.isChangeState() && e.getCollisionBounds(0f).intersects(getCollisionBounds(xOffset)) && handler.getKeyManager().interact && e.getClass().getName() == "Entities.StaticEntities.ComeInSchool" && State.currentState == handler.getGame().outerSchool2)
				return "comeInSchool2";
			if(e.isChangeState() && e.getCollisionBounds(0f).intersects(getCollisionBounds(xOffset)) && handler.getKeyManager().interact && e.getClass().getName() == "Entities.StaticEntities.ComeComputerRoom")
				return "comeInComputerRoom";
			if(e.isNpc() && e.getCollisionBounds(0f).intersects(getCollisionBounds(xOffset)) && handler.getKeyManager().interact) {
				e.getDialog().setDialogStatus(true);
				handler.setMove(false);
				return "isNpc";
			}
		}
		return "move";
	}
	
	public Rectangle getCollisionBounds(float xOffset) {
		return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y), bounds.width, bounds.height);
	}
	
	// SETTER METHODS
	public void setX(float x) {
		this.x = x;
	}
		
	public void setY(float y) {
		this.y = y;
	}
	
	// GETTER METHODS
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	// ABSTRACT METHODS
	public abstract void update();
	public abstract void render();
	public abstract Boolean isSolid();
	public abstract Boolean isChangeState();
	public abstract Boolean isNpc();
	public abstract String getDialogEvent();
	public abstract Dialog getDialog();

}
