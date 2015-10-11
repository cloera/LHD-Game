package player;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import obstacles.Obstacles;
import player.HumanPlayer.Direction;

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
	
	/***
	 * Sets the Coordinate of the Object based on the Player's coordinates. (Follow player)
	 * @param targetXCoor The Target's X Coordinate
	 * @param targetYCoor The Target's Y Coordinate
	 */
	public void setTargetDirection(int targetXCoor, int targetYCoor, Direction targetDirection){
		int xBeforeChange = x;
		int yBeforeChange = y;
		
		int closestToZero = 0;
		
		for(int i = 0 ; i < 4; i++)
		{
			int tempX = xBeforeChange;
			int tempY = yBeforeChange;
			
			switch(i)
			{
				case 0:
					tempX -= 1;
					break;
				case 1:
					tempX += 1;
					break;
				case 2:
					tempY -= 1;
					break;
				case 3:
					tempY += 1;
					break;				
			}
			
			int calc = Math.abs((tempX - targetXCoor) + (tempY - targetYCoor));
			
			if(i == 0){
				closestToZero = calc;
				setX(tempX);
				setY(tempY);
			}
			else{
				if(closestToZero > calc 
						|| 
						(closestToZero == calc && ((targetDirection == Direction.UP)
												|| (targetDirection == Direction.DOWN))
						))
				{
					closestToZero = calc;
					setX(tempX);
					setY(tempY);
				}
			}
			
		} // End For
	}// End Method

}
