package model;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Random;
import java.util.Vector;

import javax.swing.JOptionPane;

import bonus.IncreaseSpeedBonus;
import bonus.MoreBombBonus;

public class EntityManager extends Observable {
	private List<Entity> list;
	private Player player;
	private Player player2;

	public EntityManager() {
		player = new Player(new Position(50, 50), this, Direction.N, 50, 2, 0, false);
		player2 = new Player(new Position(750, 450), this, Direction.E, 50, 2, 0, false);
		this.list = new Vector<>();
	list.add(new Wall(new Position (0,0), this)) ;
	list.add(new Wall(new Position (0,50), this));
	list.add(new Wall(new Position (0,100 ),this));
	list.add(new Wall(new Position (0,150), this));
	list.add(new Wall(new Position (0,200),this));
	list.add(new Wall(new Position (0,250),this));
	list.add(new Wall(new Position (0,300),this));
	list.add(new Wall(new Position (0,350),this));
	list.add(new Wall(new Position (0,400),this));
	list.add(new Wall(new Position (0,450),this));
	list.add(new Wall(new Position (0,500),this));
//		//hang ngang south
	list.add(new Wall(new Position (50,0),this));
	list.add(new Wall(new Position (50*2,0),this));
	list.add(new Wall(new Position (50*3,0),this));
	list.add(new Wall(new Position (50*4,0),this));
	list.add(new Wall(new Position (50*5,0),this));
	list.add(new Wall(new Position (50*6,0),this));
	list.add(new Wall(new Position (50*7,0),this));
	list.add(new Wall(new Position (50*8,0),this));
	list.add(new Wall(new Position (50*9,0),this));
	list.add(new Wall(new Position (50*10,0),this));
	list.add(new Wall(new Position (50*11,0),this));
	list.add(new Wall(new Position (50*12,0),this));
	list.add(new Wall(new Position (50*13,0),this));
	list.add(new Wall(new Position (50*14,0),this));
	list.add(new Wall(new Position (50*15,0),this));
	list.add(new Wall(new Position (50*16,0),this));
//		//hang ngang north
	list.add(new Wall(new Position (50,500),this));
	list.add(new Wall(new Position (50*2,500),this));
	list.add(new Wall(new Position (50*3,500),this));
	list.add(new Wall(new Position (50*4,500),this));
	list.add(new Wall(new Position (50*5,500),this));
	list.add(new Wall(new Position (50*6,500),this));
	list.add(new Wall(new Position (50*7,500),this));
	list.add(new Wall(new Position (50*8,500),this));
	list.add(new Wall(new Position (50*9,500),this));
	list.add(new Wall(new Position (50*10,500),this));
	list.add(new Wall(new Position (50*11,500),this));
	list.add(new Wall(new Position (50*12,500),this));
	list.add(new Wall(new Position (50*13,500),this));
	list.add(new Wall(new Position (50*14,500),this));
	list.add(new Wall(new Position (50*15,500),this));
//	list.add(new Wall(new Position (50*16,500),this));
//				//hang doc west
	list.add(new Wall(new Position (800,50),this));
	list.add(new Wall(new Position (800,50*2),this));
	list.add(new Wall(new Position (800,50*3),this));
	list.add(new Wall(new Position (800,50*4),this));
	list.add(new Wall(new Position (800,50*5),this));
	list.add(new Wall(new Position (800,50*6),this));
	list.add(new Wall(new Position (800,50*7),this));
	list.add(new Wall(new Position (800,50*8),this));
	list.add(new Wall(new Position (800,50*9),this));
	list.add(new Wall(new Position (800,50*10),this));
//		//center
//		  // row 1
	list.add(new Wall(new Position (150,100),this));
	list.add(new Wall(new Position  (150,250),this));
//			//row 3
	list.add(new Wall(new Position (600,100),this));
	list.add(new Wall(new Position (600,250),this));
//		// row 2
	list.add(new Wall(new Position (350 ,100),this));
	list.add(new Wall(new Position (350 ,250),this));
//		// row 4
	list.add(new Wall(new Position (150,400),this));
	list.add(new Wall(new Position (350,400),this));
	list.add(new Wall(new Position (600,400),this));
		
		
		
		//Brick 
		list.add(new Brick(new Position(50, 450), this));
		list.add(new Brick(new Position(100, 450), this));
		list.add(new Brick(new Position(150, 450), this));
		list.add(new Brick(new Position(200, 450), this));
		list.add(new Brick(new Position(350, 350), this));
		list.add(new Brick(new Position(350, 350), this));
		list.add(new Brick(new Position(350, 350), this));
		list.add(new Brick(new Position(350, 350), this));
		list.add(new Brick(new Position(400, 350), this));
		list.add(new Brick(new Position(200, 350), this));
		list.add(new Brick(new Position(150, 350), this));
		list.add(new Brick(new Position(600,200 ), this));
		list.add(new Brick(new Position(650,200 ), this));
		list.add(new Brick(new Position(550,200 ), this));
		list.add(new Brick(new Position(350,200 ), this));
		list.add(new Brick(new Position(300,200 ), this));
		list.add(new Brick(new Position(50,300 ), this));
		list.add(new Brick(new Position(150,300 ), this));
		list.add(new Brick(new Position(150, 350), this));
		list.add(new Brick(new Position(100, 350), this));
		
		list.add(new Brick(new Position(750, 100), this));
		list.add(new Brick(new Position(300, 50), this));
		list.add(new Brick(new Position(300, 150), this));
		list.add(new Brick(new Position(350, 150), this));
		list.add(new Brick(new Position(400, 250), this));
		list.add(new Brick(new Position(650, 300), this));
		list.add(new Brick(new Position(700, 300), this));
		list.add(new Brick(new Position(700, 350), this));
		list.add(new Brick(new Position(700, 400), this));
		
		list.add(new Brick(new Position(50, 150), this));
		list.add(new Brick(new Position(100, 150), this));
		list.add(new Brick(new Position(150, 150), this));
		list.add(new Brick(new Position(150, 200), this));
		list.add(new Brick(new Position(600, 450), this));
		list.add(new Brick(new Position(650, 400), this));

		list.add(new Brick(new Position(700, 100), this));
		list.add(new Brick(new Position(650, 100), this));
		list.add(new Brick(new Position(650, 50), this));
		list.add(new Brick(new Position(600, 50), this));
		list.add(new Brick(new Position(500, 300), this));
		list.add(new Brick(new Position(500, 350), this));
		list.add(new Brick(new Position(500, 400), this));
		list.add(new Brick(new Position(550, 450), this));
		list.add(new Brick(new Position(400, 450), this));
		list.add(new Brick(new Position(300, 400), this));
		list.add(new Brick(new Position(300, 300), this));
		list.add(new Brick(new Position(250, 300), this));
		
		list.add(new Brick(new Position(450, 100), this));
		list.add(new Brick(new Position(500, 100), this));
		list.add(new Brick(new Position(400, 100), this));
		list.add(new Brick(new Position(400, 50), this));
		list.add(new Brick(new Position(300, 50), this));
		list.add(new Brick(new Position(750, 250), this));
		list.add(new Brick(new Position(750, 200), this));
		list.add(new Brick(new Position(750, 150), this));
		list.add(new Brick(new Position(150, 50), this));
		list.add(new Brick(new Position(100, 100), this));
		// Monster
		list.add(new Monster(new Position(300, 350), this, Direction.N, 30));
		list.add(new Monster(new Position(450, 150), this, Direction.N, 30));
	
		// Bonus
		list.add(new MoreBombBonus(new Position(100, 300), this, getPlayer()));
		list.add(new MoreBombBonus(new Position(750, 50), this, getPlayer()));
		list.add(new MoreBombBonus(new Position(400, 400), this, getPlayer()));
//		list.add(new IncreaseSpeedBonus(new Position(100, 100), this, getPlayer()));
		list.add(new IncreaseSpeedBonus(new Position(550, 400), this, getPlayer()));
		list.add(new IncreaseSpeedBonus(new Position(650, 250), this, getPlayer()));

	}

	public synchronized void addEntity(List<Entity> list) {
		this.list.addAll(list);
		notifyChanged();
	}

	public synchronized void addEntity(Entity e) {
		this.list.add(e);
		notifyChanged();
	}

	public void removeEntity(Entity e) {
		this.list.remove(e);
		notifyChanged();
	}

	public void removeEntity(List<Entity> list) {
		this.list.removeAll(list);
		notifyChanged();
	}

	public void removePlayer(Player player) {
		this.deleteObserver(player);
		notifyChanged();
	}

	public List<Entity> getEntityFromBound(Rectangle getbound) {
		List<Entity> res = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBounds().equals(getbound)) { 
				res.add(list.get(i));
			}
		}
		if (player.getBounds().equals(getbound)) {
			res.add(player);
		}
		return res;
	}

	public void draw(Graphics g) {
		player.draw(g);
		player2.draw(g);

		Iterator<Entity> itr = list.iterator();
		while (itr.hasNext()) {
			Entity e = itr.next();
			e.draw(g);
		}
	}

	

	public synchronized void collisionable() { // flame
		List<Entity> listCollision = new Vector<>();
		for (Entity entity : list) {
			listCollision.addAll(entity.getCollision());
			System.out.println(entity.getCollision());
		}
//		listCollision.addAll(player.getCollision());
		list.removeAll(listCollision);
		
	}
	public  boolean gameOver() {
		return player.playerCollision();
		
	}
	public void	 bonus() {
		player.bonus();
		
	}
	public void move(Direction direction) {
		player.setDirection(direction);
		player.move();
		infrontofPlayer();
//		player2.move();
		notifyChanged();
		System.out.println(player.position.getX() + "  " + player.position.getY() + " player pos");
	}
	public void move2(Direction direction) {
		player2.setDirection(direction);
//		player.move();
		player2.move();
		notifyChanged();
		System.out.println(player2.position.getX() + "  " + player2.position.getY());
	}
	
	

	public void putBoom() {
		player.putBoom();
		System.out.println(player.getMaxBomb() + " max bomb from entitymanager");
	}
	public void putBoom2() {
		player2.putBoom();
	}

	// start những thằng di chuyển
	public void startMoveableObject() {
		Iterator<Entity> itr = list.iterator();
		while (itr.hasNext()) {
			Entity entity = itr.next();
			if (entity instanceof MovealeObject)
				((MovealeObject) entity).startMove();
		}
	}

	// stop những thằng di chuyển
	public void stopMoveableObject() {
		Iterator<Entity> it = list.iterator();

		while (it.hasNext()) {
			Entity e = it.next();
			if (e instanceof MovealeObject)
				((MovealeObject) e).stopMove();

		}
		player.stopMove();
	}

	public void notifyChanged() {
		setChanged();
		notifyObservers();
	}

	public List<Entity> getList() {
		return list;
	}
	public Entity getEntityFromPosition(Position pos) {
		for (Entity entity : list) {
			if (entity.getPosition().equals(pos)) {
				System.out.println(entity + " entity front ");
				return entity;
			}
		}
		return null;
	public void infrontofPlayer() {
		Position playPos = player.getPosition();
		Direction d = player.getDirection();
		Position enPos = ;
		System.out.println(enPos.getX() + "   " + enPos.getY() + "  in font of player ");
		Entity e = getEntityFromPosition(enPos);
		System.out.println(e + " entity front of");
		if (e instanceof Wall || e instanceof Brick || e instanceof Bomb) {
			player.setSpeed(0);
			System.out.println(player.speed + "   speed when met wall or brick or bomb");
		}
	}
	
	public List<Entity> getBoundsList(Entity entity) {
		List<Entity> list = new Vector<>();
		Iterator<Entity> itr = this.list.iterator();
		while (itr.hasNext()) {
			Entity e = itr.next();
			if (e.getBounds().intersects(entity.getBounds())) {
				list.add(e);
			}
		}
		if (this.player.getBounds().intersects(entity.getBounds()))
			list.add(player) ; // sua cho nay 
		return list;

	}

	public void setList(List<Entity> list) {
		this.list = list;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}


}
