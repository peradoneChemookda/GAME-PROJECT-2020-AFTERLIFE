package Entities.StaticEntities;

import java.awt.Color;

import Dialogs.Dialog;
import GFX.Asset;
import Main.Handler;

public class PlayerFriendGroup extends StaticEntity{
	
	private Dialog dialog;

	public PlayerFriendGroup(Handler handler, float x, float y) {
		super(handler, x, y, 112 * 5, 120 * 5);
		 dialog = new Dialog(handler,this);
		
		// COLLISION BOX
		bounds.x = 70;
		bounds.y = 0;
		bounds.width = width - 30*5;
		bounds.height = height - 30*5;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		//handler.getGraphics().setColor(Color.red);
		//handler.getGraphics().fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()) , (int) (y + bounds.y), bounds.width, bounds.height);
		handler.getGraphics().drawImage(Asset.p_friendGroup_idle, (int) (x - handler.getGameCamera().getxOffset()), (int) y, width, height, null);
		// DIALOG
		if(dialog.getDialogStatus()) {
			handler.getGraphics().drawImage(dialog.getDialogBox(), 0, 0, 1920, 300, null);
		}
	}
	
	public Dialog getDialog() {
		return dialog;
	}

	@Override
	public Boolean isSolid() {
		return false;
	}

	@Override
	public Boolean isChangeState() {
		return false;
	}

	@Override
	public Boolean isNpc() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public String getDialogEvent() {
		return "";
	}
	
	
}
