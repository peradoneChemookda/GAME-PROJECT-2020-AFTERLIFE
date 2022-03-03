package World;

import Entities.EntityManager;
import Entities.Creature.Player;
import Entities.StaticEntities.PlayerFriendGroup;
import GFX.Asset;
import Main.Handler;

public class ComputerRoom extends World{

	public ComputerRoom(Handler handler, int spawnX, int spawnY) {
		super(handler);

		// ADD ENTITY TO WORLD
		// --------------------------------------------------------------------- //
		entityManager = new EntityManager(handler, new Player(handler, 0, 0, 5.0f));
		entityManager.addEntity(entityManager.getPlayer());
		// --------------------------------------------------------------------- //

		// LOAD WORLD
		super.spawnX = spawnX;
		super.spawnY = spawnY;
		loadWorld(Asset.computerRoom);

		// SET SPAWN POINT
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);

	}
	
}
