package Entities.StaticEntities;

import Entities.Entity;
import Main.Handler;

public abstract class StaticEntity extends Entity{

	// CONSTRUCTOR
	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}

}
