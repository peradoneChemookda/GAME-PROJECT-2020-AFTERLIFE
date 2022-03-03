package World;

import Dialogs.Dialog;
import Entities.EntityManager;
import Entities.Creature.Player;
import Entities.Creature.PlayerBefore;
import Entities.StaticEntities.ComeInSchool;
import Entities.StaticEntities.EndDialogCutscene1;
import GFX.Asset;
import Main.Handler;

public class OuterSchool2 extends World{
	
	public OuterSchool2(Handler handler, int spawnX, int spawnY) {
		super(handler);

		// ADD ENTITY TO WORLD
		// --------------------------------------------------------------------- //
		entityManager = new EntityManager(handler, new Player(handler, 0, 0, 5.0f));
		entityManager.addEntity(new ComeInSchool(handler, 2000, 300));
		entityManager.addEntity(entityManager.getPlayer());
		// --------------------------------------------------------------------- //

		// LOAD WORLD
		super.spawnX = spawnX;
		super.spawnY = spawnY;
		loadWorld(Asset.outerSchool);

//		// SET CURRENT WORLD
//		handler.setCurrentWorld(this);

		// SET SPAWN POINT
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);

	}
	
}
