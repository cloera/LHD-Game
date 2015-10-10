package player;

public class PlayerFactory {

	private static HumanPlayer humanInstance = new HumanPlayer();
	private static EnemyPlayer enemyInstance = new EnemyPlayer();
	private PlayerFactory(){}
	
	public static Player getHumanPlayer(){
		return humanInstance;
	}

	public static Player getEnemyPlayer(){
		return enemyInstance;
	}
	
}
