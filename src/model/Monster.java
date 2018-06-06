package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;
import java.util.Vector;

import javax.swing.ImageIcon;

public class Monster extends MovealeObject implements Runnable,  Observer {
	private Thread thread;
	private int maxBomb;
	private int numberOfBombWasCreated;

	public Monster(Position position, EntityManager manager, Direction direction, int speed) {
		super(position, manager, direction, speed);
		image = new ImageIcon("image/monster.png").getImage();
		setMoveBehavior(new MonsterMove(this));
	}
	

	public Monster(Position position, EntityManager manager, Direction direction, int speed, int maxBomb,
			int numberOfBombWasCreated) {
		super(position, manager, direction, speed);
		this.maxBomb = maxBomb;
		this.numberOfBombWasCreated = numberOfBombWasCreated;
		image = new ImageIcon("image/monster.png").getImage();
		setMoveBehavior(new MonsterMove(this));
	}


	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(image, position.getX(), position.getY(), WIDTH, HEIGHT, null);
	}

//	@Override
//	public void move() {
//		switch (this.direction) {
//		case N:
//			this.position.decreateY(this.speed);
//			break;
//		case S:
//			this.position.increateY(this.speed);
//			break;
//		case E:
//			this.position.increateX(this.speed);
//			break;
//		case W:
//			this.position.decreateX(this.speed);
//			break;
//		default:
//			break;
//		}
//	}

	@Override
	public void startMove() {
		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}
	}

	@Override
	public void stopMove() {
		if (thread != null) {
			thread.stop();
			thread = null;
		}
	}

	@Override
	public void run() {
		Random r = new Random();
		int times = 0;
		while (true) {
			move();
			setDirection(Direction.values()[r.nextInt(4)]);
			
			manager.notifyChanged();
			times++;
			if (times == 9) {
				this.monsterPutBoom();
				times = 0;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

	@Override
	public void bonus() {
		// TODO Auto-generated method stub
		
	}
	public void monsterPutBoom() {
		if (numberOfBombWasCreated < maxBomb) {
			Bomb bomb = new Bomb(new Position(this.position.getX(), this.position.getY()), manager);
			manager.addEntity(bomb);

			((Observable) bomb).addObserver(this);
			numberOfBombWasCreated++;
			System.out.println(maxBomb + " Player Bomb current ");
		}
	}


	@Override
	public void update(Observable o, Object arg) {
		numberOfBombWasCreated--;		
	}

	
}
