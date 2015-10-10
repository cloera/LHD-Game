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
	
	/***
	 * Getter for X coordinate
	 * @return X
	 */
	public int getX();
	
	/***
	 * Getter for Y coordinate
	 * @return Y
	 */
	public int getY();
	
	/***
	 * Setter for X coordinate
	 * @param xCoor
	 */
	public void setX(int xCoor);
	
	/***
	 * Setter for Y coordinate
	 * @param yCoor
	 */
	public void setY(int yCoor);
	
}
