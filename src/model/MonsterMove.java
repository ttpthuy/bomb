package model;

public class MonsterMove implements MoveBehavior {
	private MovealeObject monster;

	public MonsterMove(MovealeObject monster) {
		this.monster = monster;
	}

	@Override
	public void move() {
		switch (monster.direction) {
		case N:
			monster.position.decreateY(monster.speed);
			break;
		case S:
			monster.position.increateY(monster.speed);
			break;
		case E:
			monster.position.increateX(monster.speed);
			break;
		case W:
			monster.position.decreateX(monster.speed);
			break;
		default:
			break;
		}		
	}

}
