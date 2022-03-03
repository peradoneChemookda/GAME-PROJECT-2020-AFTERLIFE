package Entities.Creature;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Dialogs.Dialog;
import GFX.Animation;
import GFX.Asset;
import Main.Handler;

public class Player extends Creature {
	
	// ANIMATIONS
	private Animation animLeft , animRight , animRunLeft , animRunRight;
	
	public Player(Handler handler, float x, float y, float speed) {
		super(handler, x, y, 70 * 5, 120 * 5, speed);
		
		bounds.x = 15*4;
		bounds.y = 60;
		bounds.width = 20*5;
		bounds.height = 70*6;
		
		//ANIMATIONS INSTANCE
		animLeft = new Animation(120, Asset.player_left);
		animRight = new Animation(120, Asset.player_right);
		animRunLeft = new Animation(100 , Asset.player_run_left);
		animRunRight = new Animation(100, Asset.player_run_right);
	}

	// UPDATE PLAYER PER FRAME
	@Override
	public void update() {
		// ANIMATIONS
		animRight.update();
		animLeft.update();
		animRunRight.update();
		animRunLeft.update();
		
		// MOVEMENT
		getInput();
		move();
		handler.getGameCamera().centerOnPlayer(this);
	}

	// CHECK INPUT AXIS
	public void getInput() {
		xMove = 0;
		
		if(handler.getKeyManager().run) {
			if (handler.getKeyManager().left)
				xMove = -speed - 3;
			if (handler.getKeyManager().right)
				xMove = speed + 3;
		} else {
			if (handler.getKeyManager().left)
				xMove = -speed;
			if (handler.getKeyManager().right)
				xMove = speed;
		}
		
	}

	// RENDER PLAYER PER FRAME
	@Override
	public void render() {
		// CHECK COLLISION BOUND
//		g.setColor(Color.red);
//		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()) , (int) (y + bounds.y),bounds.width,bounds.height);
		handler.getGraphics().drawImage(getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) y, width, height, null);
	}

	// SOLID CHECK
	@Override
	public Boolean isSolid() {
		return true;
	}
	
	// GET CURRENT FRAME
	private BufferedImage getCurrentFrame() {
		if(!handler.getKeyManager().run) {
			if(xMove < 0) {
				return animLeft.getCurrentFrame();
			} else if (xMove > 0) {
				return animRight.getCurrentFrame();
			} else {
				animRight.resetIndex();
				animLeft.resetIndex();
				return Asset.player_idle;
			}
		} else  {
			if(xMove < 0) {
				return animRunLeft.getCurrentFrame();
			} else if (xMove > 0) {
				return animRunRight.getCurrentFrame();
			} else {
				animRunRight.resetIndex();
				animRunLeft.resetIndex();
				return Asset.player_idle;
			}
		} 
		
	}

	// NOT USE
	@Override
	public Boolean isChangeState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isNpc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDialogEvent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dialog getDialog() {
		// TODO Auto-generated method stub
		return null;
	}


}
