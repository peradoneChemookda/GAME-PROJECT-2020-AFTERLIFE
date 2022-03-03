package World;

import Entities.EntityManager;
import Entities.Creature.PlayerBefore;
import Entities.StaticEntities.ComeGymRoom;
import Entities.StaticEntities.EndDialogCutscene1;
import GFX.Asset;
import Main.Handler;

public class GymRoom extends World{

	public GymRoom(Handler handler, int spawnX, int spawnY) {
		super(handler);

		// ADD ENTITY TO WORLD
		// --------------------------------------------------------------------- //
		entityManager = new EntityManager(handler, new PlayerBefore(handler, 0, 0, 5.0f));
		//entityManager.addEntity(new PlayerFriendGroup(handler, 1300, 280));
		entityManager.addEntity(new EndDialogCutscene1(handler,800,300));
		entityManager.addEntity(entityManager.getBeforePlayer());
		// --------------------------------------------------------------------- //

		// LOAD WORLD
		super.spawnX = spawnX;
		super.spawnY = spawnY;
		loadWorld(Asset.gymRoom);

//		// SET CURRENT WORLD
//		handler.setCurrentWorld(this);

		// SET SPAWN POINT
		entityManager.getBeforePlayer().setX(spawnX);
		entityManager.getBeforePlayer().setY(spawnY);

	}
	
}
