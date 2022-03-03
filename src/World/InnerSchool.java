package World;

import Entities.EntityManager;
import Entities.Creature.PlayerBefore;
import Entities.StaticEntities.ComeInSchool;
import Entities.StaticEntities.ComeMathRoom;
import Entities.StaticEntities.PlayerFriendGroup;
import GFX.Asset;
import Main.Handler;

public class InnerSchool extends World{
	
	public InnerSchool(Handler handler, int spawnX, int spawnY) {
		super(handler);

		// ADD ENTITY TO WORLD
		// --------------------------------------------------------------------- //
		entityManager = new EntityManager(handler, new PlayerBefore(handler, 0, 0, 5.0f));
		entityManager.addEntity(new ComeMathRoom(handler, 450, 300));
		entityManager.addEntity(entityManager.getBeforePlayer());
		// --------------------------------------------------------------------- //

		// LOAD WORLD
		super.spawnX = spawnX;
		super.spawnY = spawnY;
		loadWorld(Asset.innerSchool);

		// SET SPAWN POINT
		entityManager.getBeforePlayer().setX(spawnX);
		entityManager.getBeforePlayer().setY(spawnY);

	}
	
}
