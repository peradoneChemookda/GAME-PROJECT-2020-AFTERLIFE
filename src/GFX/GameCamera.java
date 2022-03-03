package GFX;

import Entities.Entity;
import Main.Handler;
import Tiles.Tile;

public class GameCamera {

	// CLASSES
	private Handler handler;

	// VARIABLE
	private float xOffset;

	// CONSTRUCTOR
	public GameCamera(Handler handler, float xOffset) {
		this.handler = handler;
		this.xOffset = xOffset;
	}

	// SET CAMERA CENTER ON PLAYER
	public void centerOnPlayer(Entity e) {
		// OFFSET OF X FROM CENTER OF SCREEN
		xOffset = e.getX() - handler.getDisplay().getWidth() / 2 + e.getWidth() - 170;
		checkBlankSpace();
	}

	// NOT SHOW BLANK TILE
	public void checkBlankSpace() {
		// IF OFFSET OF X < 0 SNAP CAMERA TO LEFT
		if (xOffset < 0) {
			xOffset = 0;
		// IF OFFSET OF X > 0 SNAP CAMERA TO RIGHT
		} else if (xOffset > handler.getCurrentWorld().getWidth() * Tile.TILEWIDTH - handler.getDisplay().getWidth()) {
			xOffset = handler.getCurrentWorld().getWidth() * Tile.TILEWIDTH - handler.getDisplay().getWidth();
		}
		
	}

	// GET METHODS
	public float getxOffset() {
		return xOffset;
	}

}
