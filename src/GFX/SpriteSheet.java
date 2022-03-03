package GFX;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	// VARIABLE
	private BufferedImage sheet;
	
	// CONSTRUCTOR
	public SpriteSheet(BufferedImage sheet) {
		this.sheet = sheet;
	}
	
	// CROP IMAGE FROM SHEET
	public BufferedImage crop(int x,int y,int width,int height) {
		return sheet.getSubimage(x, y, width, height);
	}
	
}
