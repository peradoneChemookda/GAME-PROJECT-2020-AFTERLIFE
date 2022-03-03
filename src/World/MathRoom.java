package World;

import Entities.EntityManager;
import Entities.Creature.PlayerBefore;
import Entities.StaticEntities.ComeGymRoom;
import Entities.StaticEntities.ComeInSchool;
import Entities.StaticEntities.PlayerFriendGroup;
import GFX.Asset;
import Main.Handler;

public class MathRoom extends World{

	public MathRoom(Handler handler, int spawnX, int spawnY) {
		super(handler);

		// ADD ENTITY TO WORLD
		// --------------------------------------------------------------------- //
		entityManager = new EntityManager(handler, new PlayerBefore(handler, 0, 0, 5.0f));
		//entityManager.addEntity(new PlayerFriendGroup(handler, 1300, 280));
		entityManager.addEntity(new ComeGymRoom(handler,1500,300));
		entityManager.addEntity(entityManager.getBeforePlayer());
		// --------------------------------------------------------------------- //

		// LOAD WORLD
		super.spawnX = spawnX;
		super.spawnY = spawnY;
		loadWorld(Asset.mathRoom);

//		// SET CURRENT WORLD
//		handler.setCurrentWorld(this);

		// SET SPAWN POINT
		entityManager.getBeforePlayer().setX(spawnX);
		entityManager.getBeforePlayer().setY(spawnY);

	}
	
}
