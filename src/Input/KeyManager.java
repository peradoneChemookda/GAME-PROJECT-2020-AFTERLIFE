package Input;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{

	// VARIABLE
	private boolean[] keys;
	public boolean left,right,interact,run,next;
	
	// CONSTRUCTOR
	public KeyManager() {
		keys = new boolean[256];
	}

	public void update() {
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		interact = keys[KeyEvent.VK_E];
		run = keys[KeyEvent.VK_SHIFT];
		next = keys[KeyEvent.VK_SPACE];
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	// KEY PRESSED
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		System.out.println("Pressed!");
	}

	// KEY RELEASED
	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}
	
	
}
