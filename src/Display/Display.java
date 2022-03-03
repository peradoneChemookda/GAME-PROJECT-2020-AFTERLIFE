package Display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import Main.Handler;

public class Display {

	// VARIABLE
	private JFrame frame;
	private Canvas canvas;
	private String title;
	private int width, height;
	
	// CLASSES
	private Handler handler;

	// CONSTRUCTOR
	public Display(Handler handler,String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		this.handler = handler;
		
		createDisplay();
	}

	// CREATE DISPLAY
	private void createDisplay() {
		// SETUP FRAME
		frame = new JFrame(title);
		frame.setUndecorated(true);
		frame.setAlwaysOnTop(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.addKeyListener(handler.getKeyManager());
		
		// SETUP CANVAS
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
		
	}

	// GETTER METHODS
	public Canvas getCanvas() {
		return canvas;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
