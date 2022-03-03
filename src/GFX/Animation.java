package GFX;

import java.awt.image.BufferedImage;

public class Animation {
	private int speed,index;
	private long lastTime,timer;
	private BufferedImage[] frames;
	
	// CONSTRUCTOR
	public Animation(int speed , BufferedImage[] frames) {
		this.speed = speed;
		this.frames = frames;
		index = 0;
		timer = 0;
		lastTime = System.currentTimeMillis();
	}
	
	// UPDATE METHOD
	public void update() {
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		if(timer > speed) {
			index++;
			timer = 0;
			if(index >= frames.length) {
				index = 0;
			}
		}
	}
	
	// GET CURRENT FRAME
	public BufferedImage getCurrentFrame() {
		return frames[index];
	}
	
	// RESET FRAME
	public void resetIndex() {
		this.index = 0;
	}
}
