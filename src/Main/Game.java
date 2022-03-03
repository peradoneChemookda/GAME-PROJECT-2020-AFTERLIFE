package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Audio.SoundGame;
import Dialogs.Dialog;
import Display.Display;
import GFX.Asset;
import GFX.GameCamera;
import Input.KeyManager;
import States.ComputerRoomState;
import States.GameState;
import States.GymRoomAfterState;
import States.GymRoomAfterState2;
import States.GymRoomState;
import States.InnerSchoolState;
import States.InnerSchoolState2;
import States.MathRoomBeforeState;
import States.MathRoomState;
import States.MenuState;
import States.OuterSchoolState2;
import States.State;
import States.Scenes.Cutscene_1;
import States.Scenes.Cutscene_2;

public class Game implements Runnable {
	// VARIABLE
	private String title;
	private int width, height;
	private Boolean running = false;
	private Thread thread;
	private BufferStrategy bs;
	private Graphics g;
	private float alpha = 1f;
	//private boolean changeState = false;
	
	// ClASSES
	private Handler handler;
	private Display display;
	private KeyManager keyManager;
	private GameCamera gameCamera;
	
	// ADD STATES (CAN USE FROM ANY WHERE IN PROJECT)
	// --------------------------- //
	// MAIN STATES
	public State gameState;
	public State menuState;
	public State innerSchoolState;
	public State mathRoomState;
	public State mathRoomBeforeState;
	public State gymRoomState;
	public State gymRoomAfterState;
	public State gymRoomAfterState2;
	public State outerSchool2;
	public State innerSchool2;
	public State computerRoomState;
	// --------------------------- //
	// CUTSCENE STATES
	public State cutscene_1;
	public State cutscene_2;
	// --------------------------- //

	// CONSTRUCTOR
	public Game(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;

		start();
	}

	// SYNCHRONIZED METHODS
	private synchronized void start() {
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	private synchronized void stop() {
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		init();
		int fps = 60;
		double timePerFrame = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();

		// FPS TEST
		int frames = 0;
		long timer = 0;

		while (running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerFrame;

			// FPS TEST
			timer += now - lastTime;
			
			lastTime = now;

			if (delta >= 1) {
				update();
				render();
				frames++;
				delta--;
			}

			// FPS TEST
			if (timer >= 1000000000) {
				System.out.println(frames + " PER SECOND");
				frames = 0;
				timer = 0;
			}
		}

		stop();
	}

	// INITIAL METHOD
	private void init() {
		handler = new Handler();
		keyManager = new KeyManager();
		handler.setGame(this);
		handler.setKeyManager(keyManager);
		display = new Display(handler,title, width, height);
		handler.setDisplay(display);
		gameCamera = new GameCamera(handler,0);
		handler.setGameCamera(gameCamera);
		SoundGame.init();
		SoundGame.volume = SoundGame.Volume.LOW;
		Asset.init();
		
		// INSTACE STATE
		menuState = new MenuState(handler);
		innerSchoolState = new InnerSchoolState(handler);
		mathRoomState = new MathRoomState(handler);
		mathRoomBeforeState = new MathRoomBeforeState(handler);
		gymRoomState = new GymRoomState(handler);
		gymRoomAfterState = new GymRoomAfterState(handler);
		gymRoomAfterState2 = new GymRoomAfterState2(handler);
		outerSchool2 = new OuterSchoolState2(handler);
		innerSchool2 = new InnerSchoolState2(handler);
		computerRoomState = new ComputerRoomState(handler);
		gameState = new GameState(handler);
		cutscene_1 = new Cutscene_1(handler);
		cutscene_2 = new Cutscene_2(handler);
		
		State.setCurrentState(cutscene_1);
		SoundGame.CUT1.play();
	}

	// UPDATE PER FRAME
	private void update() {
		keyManager.update();
		
		if(State.getCurrentState() != null)
			State.getCurrentState().update();
	}

	// RENDER STATE GRAPHIC AFTER UPDATE
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		handler.setGraphics(g);
		// CLEAR SCREEN
		g.clearRect(0, 0, width, height);
		// DRAW GRAPHICS
		if(State.getCurrentState() != null) {
			State.getCurrentState().render();
			// FADE SCENE
			if(State.getCurrentState() != cutscene_1) {
				
				fadeOut();
			} 
		}
		// SHOW GRAPHICS FROM BUFFER
		bs.show();
		// FREE DATA
		g.dispose();
	}
	
	// FADE OUT
	public void fadeOut() {
		if(alpha >= 0) {
			handler.getGraphics().setColor(new Color(0,0,0,alpha));
			handler.getGraphics().fillRect(0, 0, handler.getDisplay().getWidth(), handler.getDisplay().getHeight());
			alpha -= 0.005f;
			
		} 
	}
	
	// FADE IN
	public void fadeIn() {
		if(alpha <= 1) {
			alpha += 0.01f;
			try {
				handler.getGraphics().setColor(new Color(0,0,0,alpha));
			} catch (Exception e) {
				handler.getGraphics().setColor(new Color(0,0,0,1));
				alpha = 1f;
			}
			handler.getGraphics().fillRect(0, 0, handler.getDisplay().getWidth(), handler.getDisplay().getHeight());
		} 
	}
	
//	public void setStateStatus(boolean status) {
//		changeState = status;
//	}
//	
//	public boolean getStateStatus() {
//		return changeState;
//	}
	
	public float getAlpha() {
		return alpha;
	}
	
	public void setAlpha(float alpha) {
		this.alpha = alpha;
	}

}
