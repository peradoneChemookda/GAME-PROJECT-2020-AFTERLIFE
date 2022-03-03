package World;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Entities.EntityManager;
import Entities.Creature.Player;
import Entities.StaticEntities.Tree;
import GFX.Asset;
import Main.Handler;
import Tiles.Tile;
import utils.Utils;

public class World {

	// CLASSES
	private Handler handler;
	protected EntityManager entityManager;

	// VARIABLE
	private int tiles[][];
	protected int width, height;
	protected int spawnX, spawnY;
	private float x, y;
	private BufferedImage world;

	// CONSTRUCTOR
	public World(Handler handler) {
		this.handler = handler;
	}

	// LOAD WORLD
	protected void loadWorld(BufferedImage world) {
		
		this.width = world.getWidth() / Tile.TILEWIDTH;
		this.height = world.getHeight() / Tile.TILEHEIGHT;
		
		this.world = world;
	}

	// UPDATE ENTITIES
	public void update() {
		entityManager.update();
	}

	// RENDER WORLD AND ENTITIES
	public void render() {
		
		handler.getGraphics().drawImage(world, (int)(0 - handler.getGameCamera().getxOffset()), 0, null);

		// RENDER ENTITIES
		entityManager.render();
	}

	// GETTER METHODS
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

}
