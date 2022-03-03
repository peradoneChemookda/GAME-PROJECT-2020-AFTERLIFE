package Dialogs;

import java.awt.image.BufferedImage;

import Entities.Entity;
import GFX.Asset;
import Main.Handler;
import States.State;

public class Dialog {
	private int index = -1;
	private int index_s = 0;
	private long lastTime, timer;
	private Handler handler;
	private Entity currentEntity;

	// ----------------------- TEXT DIALOG BOX ----------------------------------
	//
	private BufferedImage[] dialog1_cutscene1 = { Asset.dialog_1_1_1, Asset.dialog_1_1_2, Asset.dialog_1_1_3,
			Asset.dialog_1_1_4 };

	private BufferedImage[] dialog2_cutscene1 = { Asset.dialog_1_2_1, Asset.dialog_1_2_2, Asset.dialog_1_2_3,
			Asset.dialog_1_2_4, Asset.dialog_1_2_5, Asset.dialog_1_2_6, Asset.dialog_1_2_7, Asset.dialog_1_2_8,
			Asset.dialog_1_2_9, Asset.dialog_1_2_10, Asset.dialog_1_2_11, Asset.dialog_1_2_12, Asset.dialog_1_2_13,
			Asset.dialog_1_2_14, Asset.dialog_1_2_15, Asset.dialog_1_2_16, Asset.dialog_1_2_17 };

	private BufferedImage[] dialog3_cutscene1 = { null, Asset.dialog_1_3_1, Asset.dialog_1_3_2, Asset.dialog_1_3_3,
			Asset.dialog_1_3_4, Asset.dialog_1_3_5, Asset.dialog_1_3_6, Asset.dialog_1_3_7, Asset.dialog_1_3_8,
			Asset.dialog_1_3_9, Asset.dialog_1_3_10 };

	private BufferedImage[] dialog4_cutscene1 = { null, Asset.dialog_1_4_1, Asset.dialog_1_4_2, Asset.dialog_1_4_3,
			Asset.dialog_1_4_4, Asset.dialog_1_4_5, Asset.dialog_1_4_6, Asset.dialog_1_4_7, Asset.dialog_1_4_8,
			Asset.dialog_1_4_9, Asset.dialog_1_4_10, Asset.dialog_1_4_11, Asset.dialog_1_4_12, Asset.dialog_1_4_13 };

	private BufferedImage[] dialog5_cutscene1 = { null, Asset.dialog_1_5_1, Asset.dialog_1_5_2, Asset.dialog_1_5_3,
			Asset.dialog_1_5_4 };

	private BufferedImage[] dialog6_cutscene1 = { null, Asset.dialog_1_6_1, Asset.dialog_1_6_2, Asset.dialog_1_6_3,
			Asset.dialog_1_6_4, Asset.dialog_1_6_5, Asset.dialog_1_6_6, Asset.dialog_1_6_7, Asset.dialog_1_6_8,
			Asset.dialog_1_6_9, Asset.dialog_1_6_10, Asset.dialog_1_6_11, Asset.dialog_1_6_12, Asset.dialog_1_6_13,
			Asset.dialog_1_6_14, Asset.dialog_1_6_15, Asset.dialog_1_6_16, Asset.dialog_1_6_17, Asset.dialog_1_6_18,
			Asset.dialog_1_6_19, Asset.dialog_1_6_20, Asset.dialog_1_6_21, Asset.dialog_1_6_22, Asset.dialog_1_6_23,
			Asset.dialog_1_6_24, Asset.dialog_1_6_25 };

	private BufferedImage[] dialog1_cutscene2 = { Asset.dialog_2_1_1 };

	private BufferedImage[] dialog2_cutscene2 = { null , Asset.dialog_2_2_1, Asset.dialog_2_2_2, Asset.dialog_2_2_3,
			Asset.dialog_2_2_4, Asset.dialog_2_2_5 };

	private BufferedImage[] dialog3_cutscene2 = { null , Asset.dialog_2_3_1, Asset.dialog_2_3_2, Asset.dialog_2_3_3,
			Asset.dialog_2_3_4, Asset.dialog_2_3_5, Asset.dialog_2_3_6, Asset.dialog_2_3_7, Asset.dialog_2_3_8,
			Asset.dialog_2_3_9, Asset.dialog_2_3_10, Asset.dialog_2_3_11, Asset.dialog_2_3_12, Asset.dialog_2_3_13,
			Asset.dialog_2_3_14, Asset.dialog_2_3_15, Asset.dialog_2_3_16, Asset.dialog_2_3_17, Asset.dialog_2_3_18,
			Asset.dialog_2_3_19, Asset.dialog_2_3_20, Asset.dialog_2_3_21, Asset.dialog_2_3_22, Asset.dialog_2_3_23,
			Asset.dialog_2_3_24, Asset.dialog_2_3_25, Asset.dialog_2_3_26 };

	// VARIABLE
	boolean dialogStatus = false;
	boolean dialogStatusState = false;

	// CONSTRUCTOR
	public Dialog(Handler handler) {
		this.handler = handler;
		timer = 0;
		lastTime = System.currentTimeMillis();
	}

	public Dialog(Handler handler, Entity e) {
		this.handler = handler;
		timer = 0;
		lastTime = System.currentTimeMillis();
		this.currentEntity = e;
	}

	// ENTITIES
	public void setDialogStatus(boolean status) {
		this.dialogStatus = status;
	}

	public boolean getDialogStatus() {
		return dialogStatus;
	}

	// STATE
	public boolean getDialogStatusState() {
		return dialogStatusState;
	}

	public void setDialogStatusState(boolean dialogStatusState) {
		this.dialogStatusState = dialogStatusState;
	}

	// ----------------------------- ENTITIES -------------------------------
	public BufferedImage getDialogBox() {

		// CUTSCENE 1 DIALOG 2
		if (currentEntity.getClass().getName() == "Entities.StaticEntities.PlayerFriendGroup"
				&& State.getCurrentState() == handler.getGame().gameState) {
			if (handler.getKeyManager().interact) {

				timer += System.currentTimeMillis() - lastTime;
				lastTime = System.currentTimeMillis();
				if (timer > 250) {
					index++;
					timer = 0;
					if (index >= dialog2_cutscene1.length) {
						index = -1;
						setDialogStatus(false);
						handler.setMove(true);
						return null;
					}
				}
			}

			if (State.getCurrentState() == handler.getGame().gameState && index >= 0) {
				return dialog2_cutscene1[index];
			} else {
				setDialogStatus(false);
				handler.setMove(true);
				index = -1;
				return null;
			}
		}

		// CUTSCENE 2 DIALOG 2
		else if (currentEntity.getClass().getName() == "Entities.StaticEntities.PlayerFriendGroup"
				&& State.getCurrentState() == handler.getGame().innerSchool2) {
			System.out.println("dddd");
			if (handler.getKeyManager().interact) {

				timer += System.currentTimeMillis() - lastTime;
				lastTime = System.currentTimeMillis();
				if (timer > 250) {
					index++;
					timer = 0;
					if (index >= dialog2_cutscene2.length) {
						index = -1;
						setDialogStatus(false);
						handler.setMove(true);
						return null;
					}
				}
			}

			if (State.getCurrentState() == handler.getGame().innerSchool2 && index >= 0) {
				return dialog2_cutscene2[index];
			} else {
				setDialogStatus(false);
				handler.setMove(true);
				index = -1;
				return null;
			}
		}

		else {
			setDialogStatus(false);
			handler.setMove(true);
			index = -1;
			return null;
		}

	}

	// -------------------------- STATE -------------------------------

	public BufferedImage getDialogBoxState() {

		// CUTSCENE 1 DIALOG 1
		if (State.getCurrentState() == handler.getGame().gameState) {
			if (handler.getKeyManager().interact) {

				timer += System.currentTimeMillis() - lastTime;
				lastTime = System.currentTimeMillis();
				if (timer > 250) {
					index_s++;
					// System.out.println(index);
					timer = 0;
					if (index_s >= dialog1_cutscene1.length) {
						index_s = 0;
						setDialogStatusState(false);
						handler.setMove(true);
						return null;
					}
				}
			}

			if (State.getCurrentState() == handler.getGame().gameState && index_s >= 0
					&& index_s != dialog1_cutscene1.length) {
				// System.out.println(index_s);
				return dialog1_cutscene1[index_s];
			} else {
				setDialogStatusState(false);
				handler.setMove(true);
				index_s = 0;
				return null;
			}
		}

		// CUTSCENE 1 DIALOG 3
		if (State.getCurrentState() == handler.getGame().mathRoomState) {
			if (handler.getKeyManager().interact) {

				timer += System.currentTimeMillis() - lastTime;
				lastTime = System.currentTimeMillis();
				if (timer > 250) {
					index_s++;
					// System.out.println(index);
					timer = 0;
					if (index_s >= dialog3_cutscene1.length) {
						index_s = 0;
						setDialogStatusState(false);
						// handler.setMove(true);
						handler.setCurrentWorld(handler.getGame().mathRoomBeforeState.getWorld());
						State.setCurrentState(handler.getGame().mathRoomBeforeState);
						handler.getGame().setAlpha(1);
						return null;
					}
				}
			}

			if (State.getCurrentState() == handler.getGame().mathRoomState && index_s >= 0
					&& index_s != dialog3_cutscene1.length) {
				// System.out.println(index_s);
				return dialog3_cutscene1[index_s];
			} else {
				setDialogStatusState(false);
				// handler.setMove(true);
				index_s = 0;
				handler.setCurrentWorld(handler.getGame().mathRoomBeforeState.getWorld());
				State.setCurrentState(handler.getGame().mathRoomBeforeState);
				handler.getGame().setAlpha(1);
				return null;
			}
		}

		// CUTSCENE 1 DIALOG 4
		if (State.getCurrentState() == handler.getGame().mathRoomBeforeState) {
			if (handler.getKeyManager().interact) {

				timer += System.currentTimeMillis() - lastTime;
				lastTime = System.currentTimeMillis();
				if (timer > 250) {
					index_s++;
					// System.out.println(index);
					timer = 0;
					if (index_s >= dialog4_cutscene1.length) {
						index_s = 0;
						setDialogStatusState(false);
						handler.setMove(true);
						// System.out.println(handler.getMove());
						return null;
					}
				}
			}

			if (State.getCurrentState() == handler.getGame().mathRoomBeforeState && index_s >= 0
					&& index_s != dialog4_cutscene1.length) {
				// System.out.println(index_s);
				return dialog4_cutscene1[index_s];
			} else {
				setDialogStatusState(false);
				handler.setMove(true);
				index_s = 0;
				return null;
			}
		}

		// CUTSCENE 1 DIALOG 5
		if (State.getCurrentState() == handler.getGame().gymRoomState) {
			if (handler.getKeyManager().interact) {

				timer += System.currentTimeMillis() - lastTime;
				lastTime = System.currentTimeMillis();
				if (timer > 250) {
					index_s++;
					// System.out.println(index);
					timer = 0;
					if (index_s >= dialog5_cutscene1.length) {
						index_s = 0;
						setDialogStatusState(false);
						// handler.setMove(true);
						handler.setCurrentWorld(handler.getGame().gymRoomAfterState.getWorld());
						State.setCurrentState(handler.getGame().gymRoomAfterState);
						handler.getGame().setAlpha(1);
						// System.out.println(handler.getMove());
						return null;
					}
				}
			}

			if (State.getCurrentState() == handler.getGame().gymRoomState && index_s >= 0
					&& index_s != dialog5_cutscene1.length) {
				// System.out.println(index_s);
				return dialog5_cutscene1[index_s];
			} else {
				setDialogStatusState(false);
				// handler.setMove(true);
				index_s = 0;
				handler.setCurrentWorld(handler.getGame().gymRoomAfterState.getWorld());
				State.setCurrentState(handler.getGame().gymRoomAfterState);
				handler.getGame().setAlpha(1);
				return null;
			}
		}

		// CUTSCENE 1 DIALOG 6
		if (State.getCurrentState() == handler.getGame().gymRoomAfterState) {
			if (handler.getKeyManager().interact) {

				timer += System.currentTimeMillis() - lastTime;
				lastTime = System.currentTimeMillis();
				if (timer > 250) {
					index_s++;
					// System.out.println(index);
					timer = 0;
					if (index_s >= dialog6_cutscene1.length) {
						index_s = 0;
						setDialogStatusState(false);
						handler.setMove(true);
						// System.out.println(handler.getMove());
						handler.setCurrentWorld(handler.getGame().gymRoomAfterState2.getWorld());
						State.setCurrentState(handler.getGame().gymRoomAfterState2);
						handler.getGame().setAlpha(1);
						return null;
					}
				}
			}

			if (State.getCurrentState() == handler.getGame().gymRoomAfterState && index_s >= 0
					&& index_s != dialog6_cutscene1.length) {
				// System.out.println(index_s);
				return dialog6_cutscene1[index_s];
			} else {
				setDialogStatusState(false);
				handler.setMove(true);
				index_s = 0;
				handler.setCurrentWorld(handler.getGame().gymRoomAfterState2.getWorld());
				State.setCurrentState(handler.getGame().gymRoomAfterState2);
				handler.getGame().setAlpha(1);
				return null;
			}
		}

		// CUTSCENE 2 DIALOG 1
		if (State.getCurrentState() == handler.getGame().outerSchool2) {
			if (handler.getKeyManager().interact) {

				timer += System.currentTimeMillis() - lastTime;
				lastTime = System.currentTimeMillis();
				if (timer > 250) {
					index_s++;
					// System.out.println(index);
					timer = 0;
					if (index_s >= dialog1_cutscene2.length) {
						setDialogStatusState(false);
						handler.setMove(true);
						index_s = 0;
						return null;
					}
				}
			}

			if (State.getCurrentState() == handler.getGame().outerSchool2 && index_s >= 0
					&& index_s != dialog1_cutscene2.length) {
				// System.out.println(index_s);
				return dialog1_cutscene2[index_s];
			} else {
				setDialogStatusState(false);
				handler.setMove(true);
				index_s = 0;
				return null;
			}
		}

		// CUTSCENE 2 DIALOG 3
		if (State.getCurrentState() == handler.getGame().computerRoomState) {
			if (handler.getKeyManager().interact) {

				timer += System.currentTimeMillis() - lastTime;
				lastTime = System.currentTimeMillis();
				if (timer > 250) {
					index_s++;
					// System.out.println(index);
					timer = 0;
					if (index_s >= dialog3_cutscene2.length) {
						setDialogStatusState(false);
						handler.setMove(true);
						index_s = 0;
						return null;
					}
				}
			}

			if (State.getCurrentState() == handler.getGame().computerRoomState && index_s >= 0
					&& index_s != dialog3_cutscene2.length) {
				// System.out.println(index_s);
				return dialog3_cutscene2[index_s];
			} else {
				setDialogStatusState(false);
				handler.setMove(true);
				index_s = 0;
				return null;
			}
		}

		else {
			setDialogStatusState(false);
			handler.setMove(true);
			index_s = 0;
			return null;
		}

	}

}
