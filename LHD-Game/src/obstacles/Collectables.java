package obstacles;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

/***
 *
 * 
 * @author Christian Loera, Ricardo Arroyo
 *
 */
public class Collectables {
	private int x, y;
	private Image icon = new ImageIcon("Assests/Images/BreadSmall.png").getImage(); 
	
	
	public Collectables(){
		Random rn = new Random();
		x = rn.nextInt(200) + 20;
		y = rn.nextInt(200) + 20;
	}
	
	
	public Image getIcon(){
		return icon;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void regenerateItem(){
		Random rn = new Random();
		x = rn.nextInt(200) + 20;
		y = rn.nextInt(200) + 20;
	}
	
	public static Obstacles getCollectables() {
		//TODO
		return null;
	}
	
}
