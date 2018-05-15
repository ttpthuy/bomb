package singleton;


import javax.swing.ImageIcon;

public class Image {
	private static Image ImageSingleton = new Image();
	private static ImageIcon wallImg;
	private static ImageIcon bombImg;
	private static ImageIcon playerLeft;
	private static ImageIcon playerRight;
	private static ImageIcon playerUp;
	private static ImageIcon playerDown;
	private static ImageIcon brickImg;
	private static ImageIcon monsterImg;
	private static ImageIcon bomberman;
	private  Image() {
		wallImg = new ImageIcon("image/brick.jpg");
		bombImg = new ImageIcon("image/bomb-1602109_640.png");
		monsterImg = new ImageIcon("image/monster.png");
		brickImg = new ImageIcon("image/wall1.jpg");
		playerLeft = new ImageIcon("image/playerLeft.png");
		playerRight = new ImageIcon("image/playerRight.png");
		playerUp = new ImageIcon("playerImage/02.gif");
		playerDown = new ImageIcon("playerImage/11.gif");
		bomberman = new ImageIcon("image/player.png");
		
	}
}
