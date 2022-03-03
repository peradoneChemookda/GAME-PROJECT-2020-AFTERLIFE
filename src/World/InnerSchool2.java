package World;

import Entities.EntityManager;
import Entities.Creature.Player;
import Entities.Creature.PlayerBefore;
import Entities.StaticEntities.ComeComputerRoom;
import Entities.StaticEntities.ComeMathRoom;
import Entities.StaticEntities.PlayerFriendGroup;
import GFX.Asset;
import Main.Handler;

public class InnerSchool2 extends World{
	
	public InnerSchool2(Handler handler, int spawnX, int spawnY) {
		super(handler);

		// ADD ENTITY TO WORLD
		// --------------------------------------------------------------------- //
		entityManager = new EntityManager(handler, new Player(handler, 0, 0, 5.0f));
		entityManager.addEntity(new ComeComputerRoom(handler,500,300));
		entityManager.addEntity(new PlayerFriendGroup(handler, 800, 280));
		entityManager.addEntity(entityManager.getPlayer());
		// --------------------------------------------------------------------- //

		// LOAD WORLD
		super.spawnX = spawnX;
		super.spawnY = spawnY;
		loadWorld(Asset.innerSchool2);

		// SET SPAWN POINT
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);

	}
	
}
