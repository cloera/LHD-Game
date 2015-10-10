package player;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import obstacles.Obstacles;

/***
 * EnemyPlayer object class implements Player interface.
 * Controlled by computer user.
 * 
 * @author Christian Loera, Ricardo Arroyo
 *
 */
public class EnemyPlayer implements Player{
	private int x = 50;
	private int y = 50;
	private Image playerIcon = new ImageIcon("Assests/Images/Dog.png").getImage(); 
	private ArrayList<Obstacles> inventory = new ArrayList<Obstacles>();
	
	EnemyPlayer(){
		//unimplemented
	}
	
	@Override
	public void pickUpObject() {
		//TODO
	}
	
	@Override
	public void move(int x, int y) {
		//TODO
	}
	
	public Image getIcon(){
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
