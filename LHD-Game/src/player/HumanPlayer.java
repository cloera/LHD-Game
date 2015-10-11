package player;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import obstacles.Obstacles;

/**
 * HumanPlayer object class that implements Player interface.
 * Controlled by human user.
 * 
 * @author Christian Loera, Ricardo Arroyo
 *
 */
public class HumanPlayer implements Player {
	public enum Direction {	UP, DOWN, LEFT, RIGHT};
	
	private int x = 0;
	private int y = 0;
	private Image playerIcon = new ImageIcon("Assests/Images/Duck.png").getImage(); 
	private ArrayList<Obstacles> inventory = new ArrayList<Obstacles>();
	private Direction lastDirectionUsed;
	
	HumanPlayer(){
		// Unimplemented
	}
	
	@Override
	public void pickUpObject() {
		//TODO
	}
	
	@Override
	public void move(int x, int y) {
		//TODO
	}
	
	public Image getIcon() {
		return playerIcon;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Direction getLastDirectionUsed(){
		return lastDirectionUsed;
	}
	
	public void setX(int xCoor) {
		x = xCoor;
	}
	
	public void setY(int yCoor) {
		y = yCoor;
	}

	public void setXandY(int xCoor, int yCoor){
		x = xCoor;
		y = yCoor;
	}
	
	public void setLastDirectionUsed(Direction direction){
		lastDirectionUsed = direction;
	}


	
}
