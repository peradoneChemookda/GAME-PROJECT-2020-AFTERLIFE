package Entities;

import java.awt.Graphics;
import java.util.ArrayList;

import Entities.Creature.Player;
import Entities.Creature.PlayerBefore;
import Main.Handler;

public class EntityManager {
	
	// VARIABLE
	private ArrayList<Entity> entities;
	
	// CLASSES
	private Handler handler;
	private Player player;
	private PlayerBefore playerBefore;
	
	// CONSTRUCTOR
	public EntityManager(Handler handler,Player player) {
		this.handler = handler;
		this.player = player;
		entities = new ArrayList<Entity>();
	}
	
	// CONSTRUCTOR
		public EntityManager(Handler handler,PlayerBefore playerBefore) {
			this.handler = handler;
			this.playerBefore = playerBefore;
			entities = new ArrayList<Entity>();
		}
	
	// ADD ENTITY
	public void addEntity(Entity e) {
		entities.add(e);
	}

	// UPDATE ENTITY
	public void update() {
		for(Entity e : entities) {
			e.update();
		}
	}
	
	// RENDER ENTITY
	public void render() {
		for(Entity e : entities) {
			e.render();
		}
	}
	
	// GET PLAYER
	public Player getPlayer() {
		return player;
	}
	
	// GET BEFORE PLAYER
		public PlayerBefore getBeforePlayer() {
			return playerBefore;
		}
	
	// GETTER METHOD
	public ArrayList<Entity> getEntities() {
		return entities;
	}
	
}
