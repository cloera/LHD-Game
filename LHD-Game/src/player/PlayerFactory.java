package player;

public class PlayerFactory {

	private static HumanPlayer humanInstance = new HumanPlayer();
	private static EnemyPlayer enemyInstance = new EnemyPlayer();
	private PlayerFactory(){}
	
	public static HumanPlayer getHumanPlayer(){
		return humanInstance;
	}

	public static EnemyPlayer getEnemyPlayer(){
		return enemyInstance;
	}
	
}
