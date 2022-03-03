package GFX;

import java.awt.image.BufferedImage;

public class Asset {

	// WIDTH & HEIGHT PER TILE
	private static final int width = 32, height = 32;
	private static final int player_width = 70 * 5, player_height = 120 * 5;
	private static final int player_friend_width = 50 * 5, player_friend_height = 120 * 5;

	// --------------------- ENTITIES -----------------------
	public static BufferedImage dirt, grass, stone, tree;
	// PLAYER
	public static BufferedImage player_idle, player_before_idle;
	public static BufferedImage[] player_left, player_right, player_run_left, player_run_right;
	public static BufferedImage[] player_before_left, player_before_right, player_before_run_left,
			player_before_run_right;
	// PLAYER FRIEND 1
	public static BufferedImage p_friend1_idle;
	// PLAYER FRIEND 2
	public static BufferedImage p_friend2_idle;
	// PLAYER FRIEND 3
	public static BufferedImage p_friend3_idle;
	// PLAYER FRIEND GROUP
	public static BufferedImage p_friendGroup_idle;
	
	// CRUSH
	public static BufferedImage crush_idle;
	// CRUSH FRIEND GROUP
	public static BufferedImage c_friendGroup_idle;
	// TEACHER
	public static BufferedImage teacher1;
	public static BufferedImage teacher2;
	public static BufferedImage teacher3;

	// WORLD
	public static BufferedImage outerSchool, innerSchool, mathRoom, gymRoom, innerSchool2, computerRoom;

	// CUTSCENES 1
	public static BufferedImage cutscene_1_1_1, cutscene_1_1_2, cutscene_1_1_3, cutscene_1_1_4, cutscene_1_2_1,
			cutscene_1_2_2, cutscene_1_3_1, cutscene_1_3_2, cutscene_1_4_1, cutscene_1_4_2, cutscene_1_4_3,
			cutscene_1_4_4, cutscene_1_4_5, cutscene_1_5_1, cutscene_1_5_2, cutscene_1_6_1, cutscene_1_7_1,
			cutscene_1_7_2, cutscene_1_8_1, cutscene_1_8_2, cutscene_1_9_1, cutscene_1_9_2, cutscene_1_9_3,
			cutscene_1_10_1, cutscene_1_10_2, cutscene_1_11_1;

	// CUTSCENES 2
	public static BufferedImage cutscene_2_1_1, cutscene_2_1_2, cutscene_2_2_1, cutscene_2_2_2, cutscene_2_2_3,
			cutscene_2_2_4, cutscene_2_3_1, cutscene_2_3_2, cutscene_2_3_3, cutscene_2_3_4, cutscene_2_4_1,
			cutscene_2_4_2, cutscene_2_4_3, cutscene_2_4_4, cutscene_2_4_5, cutscene_2_5_1, cutscene_2_5_2,
			cutscene_2_5_3, cutscene_2_5_4, cutscene_2_5_5, cutscene_2_5_6, cutscene_2_5_7, cutscene_2_5_8,
			cutscene_2_5_9, cutscene_2_5_10, cutscene_2_5_11, cutscene_2_5_12, cutscene_2_5_13, cutscene_2_5_14,
			cutscene_2_6_1, cutscene_2_6_2, cutscene_2_6_3, cutscene_2_6_4, cutscene_2_6_5, cutscene_2_7_1,
			cutscene_2_7_2, cutscene_2_7_3, cutscene_2_7_4, cutscene_2_8_1, cutscene_2_8_2, cutscene_2_8_3,
			cutscene_2_8_4, cutscene_2_8_5, cutscene_2_9_1, cutscene_2_9_2, cutscene_2_10_1, cutscene_2_10_2,
			cutscene_2_10_3, cutscene_2_11_1, cutscene_2_11_2, cutscene_2_11_3, cutscene_2_12_1, cutscene_2_12_2,
			cutscene_2_13_1, cutscene_2_13_2, cutscene_2_13_3, cutscene_2_13_4, cutscene_2_14_1;

	// DIALOGS
	public static BufferedImage dialog_1_1_1, dialog_1_1_2, dialog_1_1_3, dialog_1_1_4, dialog_1_2_1, dialog_1_2_2,
			dialog_1_2_3, dialog_1_2_4, dialog_1_2_5, dialog_1_2_6, dialog_1_2_7, dialog_1_2_8, dialog_1_2_9,
			dialog_1_2_10, dialog_1_2_11, dialog_1_2_12, dialog_1_2_13, dialog_1_2_14, dialog_1_2_15, dialog_1_2_16,
			dialog_1_2_17, dialog_1_3_1, dialog_1_3_2, dialog_1_3_3, dialog_1_3_4, dialog_1_3_5, dialog_1_3_6,
			dialog_1_3_7, dialog_1_3_8, dialog_1_3_9, dialog_1_3_10, dialog_1_4_1, dialog_1_4_2, dialog_1_4_3,
			dialog_1_4_4, dialog_1_4_5, dialog_1_4_6, dialog_1_4_7, dialog_1_4_8, dialog_1_4_9, dialog_1_4_10,
			dialog_1_4_11, dialog_1_4_12, dialog_1_4_13, dialog_1_5_1, dialog_1_5_2, dialog_1_5_3, dialog_1_5_4,
			dialog_1_6_1, dialog_1_6_2, dialog_1_6_3, dialog_1_6_4, dialog_1_6_5, dialog_1_6_6, dialog_1_6_7,
			dialog_1_6_8, dialog_1_6_9, dialog_1_6_10, dialog_1_6_11, dialog_1_6_12, dialog_1_6_13, dialog_1_6_14,
			dialog_1_6_15, dialog_1_6_16, dialog_1_6_17, dialog_1_6_18, dialog_1_6_19, dialog_1_6_20, dialog_1_6_21,
			dialog_1_6_22, dialog_1_6_23, dialog_1_6_24, dialog_1_6_25, dialog_2_1_1, dialog_2_2_1, dialog_2_2_2,
			dialog_2_2_3, dialog_2_2_4, dialog_2_2_5, dialog_2_3_1, dialog_2_3_2, dialog_2_3_3, dialog_2_3_4,
			dialog_2_3_5, dialog_2_3_6, dialog_2_3_7, dialog_2_3_8, dialog_2_3_9, dialog_2_3_10, dialog_2_3_11,
			dialog_2_3_12, dialog_2_3_13, dialog_2_3_14, dialog_2_3_15, dialog_2_3_16, dialog_2_3_17, dialog_2_3_18,
			dialog_2_3_19, dialog_2_3_20, dialog_2_3_21, dialog_2_3_22, dialog_2_3_23, dialog_2_3_24, dialog_2_3_25,
			dialog_2_3_26;

	// INITIAL ASSET LOADING
	public static void init() {
		SpriteSheet playerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/player_anim-Sheet-500.png"));
		SpriteSheet playerBeforeSheet = new SpriteSheet(
				ImageLoader.loadImage("/textures/player_anim_before-Sheet.png"));
		SpriteSheet player_friend_1_Sheet = new SpriteSheet(
				ImageLoader.loadImage("/textures/player_friend1_anim-Sheet.png"));
		SpriteSheet player_friend_2_Sheet = new SpriteSheet(
				ImageLoader.loadImage("/textures/player_friend2_anim-Sheet.png"));
		SpriteSheet player_friend_3_Sheet = new SpriteSheet(
				ImageLoader.loadImage("/textures/player_friend3_anim-Sheet.png"));
		SpriteSheet player_friend_group_Sheet = new SpriteSheet(
				ImageLoader.loadImage("/textures/player_friend_group-Sheet.png"));

		// ------ ANIMATION INSTANCIATE ---------

		player_right = new BufferedImage[8];
		player_left = new BufferedImage[8];
		player_run_left = new BufferedImage[8];
		player_run_right = new BufferedImage[8];

		player_before_right = new BufferedImage[8];
		player_before_left = new BufferedImage[8];
		player_before_run_left = new BufferedImage[8];
		player_before_run_right = new BufferedImage[8];
		
		crush_idle = ImageLoader.loadImage("/textures/crush_anim_dialog.png");
		c_friendGroup_idle = ImageLoader.loadImage("/textures/crush_friend_group_dialog.png");

		// ------------------- CROP ALL ASSETS HERE ------------------------------ //
		// PLAYER (BEFORE)
		player_before_idle = playerBeforeSheet.crop(0, 0, player_width, player_height);
		player_before_right[0] = playerBeforeSheet.crop(0, player_height, player_width, player_height);
		player_before_right[1] = playerBeforeSheet.crop(player_width * 1, player_height, player_width, player_height);
		player_before_right[2] = playerBeforeSheet.crop(player_width * 2, player_height, player_width, player_height);
		player_before_right[3] = playerBeforeSheet.crop(player_width * 3, player_height, player_width, player_height);
		player_before_right[4] = playerBeforeSheet.crop(player_width * 4, player_height, player_width, player_height);
		player_before_right[5] = playerBeforeSheet.crop(player_width * 5, player_height, player_width, player_height);
		player_before_right[6] = playerBeforeSheet.crop(player_width * 6, player_height, player_width, player_height);
		player_before_right[7] = playerBeforeSheet.crop(player_width * 7, player_height, player_width, player_height);

		player_before_left[0] = playerBeforeSheet.crop(0, player_height * 2, player_width, player_height);
		player_before_left[1] = playerBeforeSheet.crop(player_width * 1, player_height * 2, player_width,
				player_height);
		player_before_left[2] = playerBeforeSheet.crop(player_width * 2, player_height * 2, player_width,
				player_height);
		player_before_left[3] = playerBeforeSheet.crop(player_width * 3, player_height * 2, player_width,
				player_height);
		player_before_left[4] = playerBeforeSheet.crop(player_width * 4, player_height * 2, player_width,
				player_height);
		player_before_left[5] = playerBeforeSheet.crop(player_width * 5, player_height * 2, player_width,
				player_height);
		player_before_left[6] = playerBeforeSheet.crop(player_width * 6, player_height * 2, player_width,
				player_height);
		player_before_left[7] = playerBeforeSheet.crop(player_width * 7, player_height * 2, player_width,
				player_height);

		player_before_run_right[0] = playerBeforeSheet.crop(0, player_height * 3, player_width, player_height);
		player_before_run_right[1] = playerBeforeSheet.crop(player_width * 1, player_height * 3, player_width,
				player_height);
		player_before_run_right[2] = playerBeforeSheet.crop(player_width * 2, player_height * 3, player_width,
				player_height);
		player_before_run_right[3] = playerBeforeSheet.crop(player_width * 3, player_height * 3, player_width,
				player_height);
		player_before_run_right[4] = playerBeforeSheet.crop(player_width * 4, player_height * 3, player_width,
				player_height);
		player_before_run_right[5] = playerBeforeSheet.crop(player_width * 5, player_height * 3, player_width,
				player_height);
		player_before_run_right[6] = playerBeforeSheet.crop(player_width * 6, player_height * 3, player_width,
				player_height);
		player_before_run_right[7] = playerBeforeSheet.crop(player_width * 7, player_height * 3, player_width,
				player_height);

		player_before_run_left[0] = playerBeforeSheet.crop(0, player_height * 4, player_width, player_height);
		player_before_run_left[1] = playerBeforeSheet.crop(player_width * 1, player_height * 4, player_width,
				player_height);
		player_before_run_left[2] = playerBeforeSheet.crop(player_width * 2, player_height * 4, player_width,
				player_height);
		player_before_run_left[3] = playerBeforeSheet.crop(player_width * 3, player_height * 4, player_width,
				player_height);
		player_before_run_left[4] = playerBeforeSheet.crop(player_width * 4, player_height * 4, player_width,
				player_height);
		player_before_run_left[5] = playerBeforeSheet.crop(player_width * 5, player_height * 4, player_width,
				player_height);
		player_before_run_left[6] = playerBeforeSheet.crop(player_width * 6, player_height * 4, player_width,
				player_height);
		player_before_run_left[7] = playerBeforeSheet.crop(player_width * 7, player_height * 4, player_width,
				player_height);

		// PLAYER (AFTER)
		player_idle = playerSheet.crop(0, 0, player_width, player_height);
		player_right[0] = playerSheet.crop(0, player_height, player_width, player_height);
		player_right[1] = playerSheet.crop(player_width * 1, player_height, player_width, player_height);
		player_right[2] = playerSheet.crop(player_width * 2, player_height, player_width, player_height);
		player_right[3] = playerSheet.crop(player_width * 3, player_height, player_width, player_height);
		player_right[4] = playerSheet.crop(player_width * 4, player_height, player_width, player_height);
		player_right[5] = playerSheet.crop(player_width * 5, player_height, player_width, player_height);
		player_right[6] = playerSheet.crop(player_width * 6, player_height, player_width, player_height);
		player_right[7] = playerSheet.crop(player_width * 7, player_height, player_width, player_height);

		player_left[0] = playerSheet.crop(0, player_height * 2, player_width, player_height);
		player_left[1] = playerSheet.crop(player_width * 1, player_height * 2, player_width, player_height);
		player_left[2] = playerSheet.crop(player_width * 2, player_height * 2, player_width, player_height);
		player_left[3] = playerSheet.crop(player_width * 3, player_height * 2, player_width, player_height);
		player_left[4] = playerSheet.crop(player_width * 4, player_height * 2, player_width, player_height);
		player_left[5] = playerSheet.crop(player_width * 5, player_height * 2, player_width, player_height);
		player_left[6] = playerSheet.crop(player_width * 6, player_height * 2, player_width, player_height);
		player_left[7] = playerSheet.crop(player_width * 7, player_height * 2, player_width, player_height);

		player_run_right[0] = playerSheet.crop(0, player_height * 3, player_width, player_height);
		player_run_right[1] = playerSheet.crop(player_width * 1, player_height * 3, player_width, player_height);
		player_run_right[2] = playerSheet.crop(player_width * 2, player_height * 3, player_width, player_height);
		player_run_right[3] = playerSheet.crop(player_width * 3, player_height * 3, player_width, player_height);
		player_run_right[4] = playerSheet.crop(player_width * 4, player_height * 3, player_width, player_height);
		player_run_right[5] = playerSheet.crop(player_width * 5, player_height * 3, player_width, player_height);
		player_run_right[6] = playerSheet.crop(player_width * 6, player_height * 3, player_width, player_height);
		player_run_right[7] = playerSheet.crop(player_width * 7, player_height * 3, player_width, player_height);

		player_run_left[0] = playerSheet.crop(0, player_height * 4, player_width, player_height);
		player_run_left[1] = playerSheet.crop(player_width * 1, player_height * 4, player_width, player_height);
		player_run_left[2] = playerSheet.crop(player_width * 2, player_height * 4, player_width, player_height);
		player_run_left[3] = playerSheet.crop(player_width * 3, player_height * 4, player_width, player_height);
		player_run_left[4] = playerSheet.crop(player_width * 4, player_height * 4, player_width, player_height);
		player_run_left[5] = playerSheet.crop(player_width * 5, player_height * 4, player_width, player_height);
		player_run_left[6] = playerSheet.crop(player_width * 6, player_height * 4, player_width, player_height);
		player_run_left[7] = playerSheet.crop(player_width * 7, player_height * 4, player_width, player_height);

		// PLAYER FRIEND 1
		p_friend1_idle = player_friend_1_Sheet.crop(0, 0, player_friend_width, player_friend_height);
		// PLAYER FRIEND 2
		p_friend2_idle = player_friend_2_Sheet.crop(0, 0, player_friend_width, player_friend_height);
		// PLAYER FRIEND 3
		p_friend3_idle = player_friend_3_Sheet.crop(0, 0, player_friend_width, player_friend_height);
		// PLAYER FRIEND GROUP
		p_friendGroup_idle = player_friend_group_Sheet.crop(0, 0, 112 * 5, 120 * 5);
		
		// TEACHER
		teacher1 = ImageLoader.loadImage("/textures/teacher_1.png");
		teacher2 = ImageLoader.loadImage("/textures/teacher_2.png");
		teacher3 = ImageLoader.loadImage("/textures/teacher_3.png");

		// ---------------------- CUTSCENES ---------------------------
		// CUTSCENES 1
		cutscene_1_1_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_1_1.jpg");
		cutscene_1_1_2 = ImageLoader.loadImage("/cutscenes/cutscene_1_1_2.jpg");
		cutscene_1_1_3 = ImageLoader.loadImage("/cutscenes/cutscene_1_1_3.jpg");
		cutscene_1_1_4 = ImageLoader.loadImage("/cutscenes/cutscene_1_1_4.jpg");
		cutscene_1_2_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_2_1.jpg");
		cutscene_1_2_2 = ImageLoader.loadImage("/cutscenes/cutscene_1_2_2.jpg");
		cutscene_1_3_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_3_1.jpg");
		cutscene_1_3_2 = ImageLoader.loadImage("/cutscenes/cutscene_1_3_2.jpg");
		cutscene_1_4_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_4_1.jpg");
		cutscene_1_4_2 = ImageLoader.loadImage("/cutscenes/cutscene_1_4_2.jpg");
		cutscene_1_4_3 = ImageLoader.loadImage("/cutscenes/cutscene_1_4_3.jpg");
		cutscene_1_4_4 = ImageLoader.loadImage("/cutscenes/cutscene_1_4_4.jpg");
		cutscene_1_4_5 = ImageLoader.loadImage("/cutscenes/cutscene_1_4_5.jpg");
		cutscene_1_5_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_5_1.jpg");
		cutscene_1_5_2 = ImageLoader.loadImage("/cutscenes/cutscene_1_5_2.jpg");
		cutscene_1_6_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_6_1.jpg");
		cutscene_1_7_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_7_1.jpg");
		cutscene_1_7_2 = ImageLoader.loadImage("/cutscenes/cutscene_1_7_2.jpg");
		cutscene_1_8_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_8_1.jpg");
		cutscene_1_8_2 = ImageLoader.loadImage("/cutscenes/cutscene_1_8_2.jpg");
		cutscene_1_9_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_9_1.jpg");
		cutscene_1_9_2 = ImageLoader.loadImage("/cutscenes/cutscene_1_9_2.jpg");
		cutscene_1_9_3 = ImageLoader.loadImage("/cutscenes/cutscene_1_9_3.jpg");
		cutscene_1_10_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_10_1.jpg");
		cutscene_1_10_2 = ImageLoader.loadImage("/cutscenes/cutscene_1_10_2.jpg");
		cutscene_1_11_1 = ImageLoader.loadImage("/cutscenes/cutscene_1_11_1.jpg");
		// CUTSCENES 2
		cutscene_2_1_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_1_1.jpg");
		cutscene_2_1_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_1_2.jpg");
		cutscene_2_2_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_2_1.jpg");
		cutscene_2_2_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_2_2.jpg");
		cutscene_2_2_3 = ImageLoader.loadImage("/cutscenes/cutscene_2_2_3.jpg");
		cutscene_2_2_4 = ImageLoader.loadImage("/cutscenes/cutscene_2_2_4.jpg");
		cutscene_2_3_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_3_1.jpg");
		cutscene_2_3_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_3_2.jpg");
		cutscene_2_3_3 = ImageLoader.loadImage("/cutscenes/cutscene_2_3_3.jpg");
		cutscene_2_3_4 = ImageLoader.loadImage("/cutscenes/cutscene_2_3_4.jpg");
		cutscene_2_4_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_4_1.jpg");
		cutscene_2_4_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_4_2.jpg");
		cutscene_2_4_3 = ImageLoader.loadImage("/cutscenes/cutscene_2_4_3.jpg");
		cutscene_2_4_4 = ImageLoader.loadImage("/cutscenes/cutscene_2_4_4.jpg");
		cutscene_2_4_5 = ImageLoader.loadImage("/cutscenes/cutscene_2_4_5.jpg");
		cutscene_2_5_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_1.jpg");
		cutscene_2_5_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_2.jpg");
		cutscene_2_5_3 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_3.jpg");
		cutscene_2_5_4 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_4.jpg");
		cutscene_2_5_5 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_5.jpg");
		cutscene_2_5_6 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_6.jpg");
		cutscene_2_5_7 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_7.jpg");
		cutscene_2_5_8 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_8.jpg");
		cutscene_2_5_9 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_9.jpg");
		cutscene_2_5_10 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_10.jpg");
		cutscene_2_5_11 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_11.jpg");
		cutscene_2_5_12 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_12.jpg");
		cutscene_2_5_13 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_13.jpg");
		cutscene_2_5_14 = ImageLoader.loadImage("/cutscenes/cutscene_2_5_14.jpg");
		cutscene_2_6_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_6_1.jpg");
		cutscene_2_6_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_6_2.jpg");
		cutscene_2_6_3 = ImageLoader.loadImage("/cutscenes/cutscene_2_6_3.jpg");
		cutscene_2_6_4 = ImageLoader.loadImage("/cutscenes/cutscene_2_6_4.jpg");
		cutscene_2_6_5 = ImageLoader.loadImage("/cutscenes/cutscene_2_6_5.jpg");
		cutscene_2_7_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_7_1.jpg");
		cutscene_2_7_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_7_2.jpg");
		cutscene_2_7_3 = ImageLoader.loadImage("/cutscenes/cutscene_2_7_3.jpg");
		cutscene_2_7_4 = ImageLoader.loadImage("/cutscenes/cutscene_2_7_4.jpg");
		cutscene_2_8_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_8_1.jpg");
		cutscene_2_8_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_8_2.jpg");
		cutscene_2_8_3 = ImageLoader.loadImage("/cutscenes/cutscene_2_8_3.jpg");
		cutscene_2_8_4 = ImageLoader.loadImage("/cutscenes/cutscene_2_8_4.jpg");
		cutscene_2_8_5 = ImageLoader.loadImage("/cutscenes/cutscene_2_8_5.jpg");
		cutscene_2_9_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_9_1.jpg");
		cutscene_2_9_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_9_2.jpg");
		cutscene_2_10_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_10_1.jpg");
		cutscene_2_10_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_10_2.jpg");
		cutscene_2_10_3 = ImageLoader.loadImage("/cutscenes/cutscene_2_10_3.jpg");
		cutscene_2_11_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_11_1.jpg");
		cutscene_2_11_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_11_2.jpg");
		cutscene_2_11_3 = ImageLoader.loadImage("/cutscenes/cutscene_2_11_3.jpg");
		cutscene_2_12_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_12_1.jpg");
		cutscene_2_12_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_12_2.jpg");
		cutscene_2_13_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_13_1.jpg");
		cutscene_2_13_2 = ImageLoader.loadImage("/cutscenes/cutscene_2_13_2.jpg");
		cutscene_2_13_3 = ImageLoader.loadImage("/cutscenes/cutscene_2_13_3.jpg");
		cutscene_2_13_4 = ImageLoader.loadImage("/cutscenes/cutscene_2_13_4.jpg");
		cutscene_2_14_1 = ImageLoader.loadImage("/cutscenes/cutscene_2_14_1.jpg");

		// ------------------------ DIALOG ---------------------------------
		// CUTSCENE 1
		// 1
		dialog_1_1_1 = ImageLoader.loadImage("/textures/cutscene1/1/Cutscene1_1_1.png");
		dialog_1_1_2 = ImageLoader.loadImage("/textures/cutscene1/1/Cutscene1_1_2.png");
		dialog_1_1_3 = ImageLoader.loadImage("/textures/cutscene1/1/Cutscene1_1_3.png");
		dialog_1_1_4 = ImageLoader.loadImage("/textures/cutscene1/1/Cutscene1_1_4.png");
		// 2
		dialog_1_2_1 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_1.png");
		dialog_1_2_2 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_2.png");
		dialog_1_2_3 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_3.png");
		dialog_1_2_4 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_4.png");
		dialog_1_2_5 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_5.png");
		dialog_1_2_6 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_6.png");
		dialog_1_2_7 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_7.png");
		dialog_1_2_8 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_8.png");
		dialog_1_2_9 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_9.png");
		dialog_1_2_10 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_10.png");
		dialog_1_2_11 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_11.png");
		dialog_1_2_12 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_12.png");
		dialog_1_2_13 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_13.png");
		dialog_1_2_14 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_14.png");
		dialog_1_2_15 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_15.png");
		dialog_1_2_16 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_16.png");
		dialog_1_2_17 = ImageLoader.loadImage("/textures/cutscene1/2/Cutscene1_2_17.png");
		// 3
		dialog_1_3_1 = ImageLoader.loadImage("/textures/cutscene1/3/Cutscene1_3_1.png");
		dialog_1_3_2 = ImageLoader.loadImage("/textures/cutscene1/3/Cutscene1_3_2.png");
		dialog_1_3_3 = ImageLoader.loadImage("/textures/cutscene1/3/Cutscene1_3_3.png");
		dialog_1_3_4 = ImageLoader.loadImage("/textures/cutscene1/3/Cutscene1_3_4.png");
		dialog_1_3_5 = ImageLoader.loadImage("/textures/cutscene1/3/Cutscene1_3_5.png");
		dialog_1_3_6 = ImageLoader.loadImage("/textures/cutscene1/3/Cutscene1_3_6.png");
		dialog_1_3_7 = ImageLoader.loadImage("/textures/cutscene1/3/Cutscene1_3_7.png");
		dialog_1_3_8 = ImageLoader.loadImage("/textures/cutscene1/3/Cutscene1_3_8.png");
		dialog_1_3_9 = ImageLoader.loadImage("/textures/cutscene1/3/Cutscene1_3_9.png");
		dialog_1_3_10 = ImageLoader.loadImage("/textures/cutscene1/3/Cutscene1_3_10.png");
		// 4
		dialog_1_4_1 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_1.png");
		dialog_1_4_2 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_2.png");
		dialog_1_4_3 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_3.png");
		dialog_1_4_4 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_4.png");
		dialog_1_4_5 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_5T.png");
		dialog_1_4_6 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_6T.png");
		dialog_1_4_5 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_5F.png");
		dialog_1_4_6 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_6F.png");
		dialog_1_4_7 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_7.png");
		dialog_1_4_8 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_8.png");
		dialog_1_4_9 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_9.png");
		dialog_1_4_10 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_10.png");
		dialog_1_4_11 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_11.png");
		dialog_1_4_12 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_12.png");
		dialog_1_4_13 = ImageLoader.loadImage("/textures/cutscene1/4/Cutscene1_4_13.png");
		// 5
		dialog_1_5_1 = ImageLoader.loadImage("/textures/cutscene1/5/Cutscene1_5_1.png");
		dialog_1_5_2 = ImageLoader.loadImage("/textures/cutscene1/5/Cutscene1_5_2.png");
		dialog_1_5_3 = ImageLoader.loadImage("/textures/cutscene1/5/Cutscene1_5_3.png");
		dialog_1_5_4 = ImageLoader.loadImage("/textures/cutscene1/5/Cutscene1_5_4.png");
		// 6
		dialog_1_6_1 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_1.png");
		dialog_1_6_2 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_2.png");
		dialog_1_6_3 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_3.png");
		dialog_1_6_4 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_4.png");
		dialog_1_6_5 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_5.png");
		dialog_1_6_6 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_6.png");
		dialog_1_6_7 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_7.png");
		dialog_1_6_8 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_8.png");
		dialog_1_6_9 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_9.png");
		dialog_1_6_10 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_10.png");
		dialog_1_6_11 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_11.png");
		dialog_1_6_12 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_12.png");
		dialog_1_6_13 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_13.png");
		dialog_1_6_14 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_14.png");
		dialog_1_6_15 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_15.png");
		dialog_1_6_16 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_16.png");
		dialog_1_6_17 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_17.png");
		dialog_1_6_18 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_18.png");
		dialog_1_6_19 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_19.png");
		dialog_1_6_20 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_20.png");
		dialog_1_6_21 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_21.png");
		dialog_1_6_22 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_22.png");
		dialog_1_6_23 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_23.png");
		dialog_1_6_24 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_24.png");
		dialog_1_6_25 = ImageLoader.loadImage("/textures/cutscene1/6/Cutscene1_6_25.png");

		// CUTSCENE 2
		// 1
		dialog_2_1_1 = ImageLoader.loadImage("/textures/cutscene2/1/Cutscene2_1_1.png");
		// 2
		dialog_2_2_1 = ImageLoader.loadImage("/textures/cutscene2/2/Cutscene2_2_1.png");
		dialog_2_2_2 = ImageLoader.loadImage("/textures/cutscene2/2/Cutscene2_2_2.png");
		dialog_2_2_3 = ImageLoader.loadImage("/textures/cutscene2/2/Cutscene2_2_3.png");
		dialog_2_2_4 = ImageLoader.loadImage("/textures/cutscene2/2/Cutscene2_2_4.png");
		dialog_2_2_5 = ImageLoader.loadImage("/textures/cutscene2/2/Cutscene2_2_5.png");
		// 3
		dialog_2_3_1 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_1.png");
		dialog_2_3_2 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_2.png");
		dialog_2_3_3 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_3.png");
		dialog_2_3_4 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_4.png");
		dialog_2_3_5 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_5.png");
		dialog_2_3_6 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_6.png");
		dialog_2_3_7 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_7.png");
		dialog_2_3_8 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_8.png");
		dialog_2_3_9 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_9.png");
		dialog_2_3_10 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_10.png");
		dialog_2_3_11 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_11.png");
		dialog_2_3_12 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_12.png");
		dialog_2_3_13 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_13.png");
		dialog_2_3_14 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_14.png");
		dialog_2_3_15 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_15.png");
		dialog_2_3_16 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_16.png");
		dialog_2_3_17 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_17.png");
		dialog_2_3_18 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_18.png");
		dialog_2_3_19 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_19.png");
		dialog_2_3_20 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_20.png");
		dialog_2_3_21 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_21.png");
		dialog_2_3_22 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_22.png");
		dialog_2_3_23 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_23.png");
		dialog_2_3_24 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_24.png");
		dialog_2_3_25 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_25.png");
		dialog_2_3_26 = ImageLoader.loadImage("/textures/cutscene2/3/Cutscene2_3_26.png");

		// --------------------------------- WORLD -------------------------------------
		outerSchool = ImageLoader.loadImage("/worlds/outerSchool.png");
		innerSchool = ImageLoader.loadImage("/worlds/innerSchool.png");
		mathRoom = ImageLoader.loadImage("/worlds/mathSchool.png");
		gymRoom = ImageLoader.loadImage("/worlds/gymSchool.png");
		innerSchool2 = ImageLoader.loadImage("/worlds/innerSchool2.png");
		computerRoom = ImageLoader.loadImage("/worlds/computerSchool.png");

	}

}
