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
	private int x = 0;
	private int y = 0;
	private Image playerIcon = new ImageIcon("Assests/Images/Duck.png").getImage(); 
	private ArrayList<Obstacles> inventory = new ArrayList<Obstacles>();
	
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
	
	public void setX(int xCoor) {
		x = xCoor;
	}
	
	public void setY(int yCoor) {
		y = yCoor;
	}



	
}
