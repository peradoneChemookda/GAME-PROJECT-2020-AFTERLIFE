package World;

import Entities.EntityManager;
import Entities.Creature.Player;
import Entities.Creature.PlayerBefore;
import Entities.StaticEntities.ComeInSchool;
import Entities.StaticEntities.PlayerFriend1;
import Entities.StaticEntities.PlayerFriendGroup;
import Entities.StaticEntities.Tree;
import GFX.Asset;
import Main.Handler;

public class OuterSchool extends World {

	public OuterSchool(Handler handler, int spawnX, int spawnY) {
		super(handler);

		// ADD ENTITY TO WORLD
		// --------------------------------------------------------------------- //
		entityManager = new EntityManager(handler, new PlayerBefore(handler, 0, 0, 5.0f));
		entityManager.addEntity(new ComeInSchool(handler, 2000, 300));
		entityManager.addEntity(new PlayerFriendGroup(handler, 1300, 280));
		entityManager.addEntity(entityManager.getBeforePlayer());
		// --------------------------------------------------------------------- //

		// LOAD WORLD
		super.spawnX = spawnX;
		super.spawnY = spawnY;
		loadWorld(Asset.outerSchool);

		// SET CURRENT WORLD
		handler.setCurrentWorld(this);

		// SET SPAWN POINT
		entityManager.getBeforePlayer().setX(spawnX);
		entityManager.getBeforePlayer().setY(spawnY);

	}

}
