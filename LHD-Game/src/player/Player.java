package player;

/***
 * An interface class that all Players must inherit.
 * 
 * @author Ricardo Arroyo, Christian Loera
 *
 */
public interface Player {

	/***
	 * Pick up an object displayed on the screen
	 */
	void pickUpObject();
	
	/***
	 * Move the Agent 
	 * @param x X Coordinate
	 * @param y Y Coordinate
	 */
	void move(int x, int y);
	
	
	
}
