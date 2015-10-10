package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import player.Player;
import player.PlayerFactory;

@SuppressWarnings("serial")
public class GameWindow extends JPanel implements KeyListener{
		public enum Turn {	PLAYER, COMPUTER	}
		
		private int x = 0;
	    private int y = 0;
	    private int velX = 0, velY = 0;

		public Player human = PlayerFactory.getHumanPlayer();
		public Player opponent = PlayerFactory.getEnemyPlayer();	    
		public Turn turn = Turn.PLAYER;
		
		public GameWindow(){
			this.setFocusable(true);
			this.addKeyListener(this);
			
		}
		
	    @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	            RenderingHints.VALUE_ANTIALIAS_ON);
	        
	        // Player's Turn
	        if(this.turn == Turn.PLAYER){
	        	int playerX = human.getX();
	        	int playerY = human.getY();
	        	g2d.fillOval(playerX, playerY, 30, 30);
	        }
	        // Computer's Turn
	        else{
	        	//g2d.fillOval(++x, ++y, 30, 30);
	        	//this.turn = Turn.PLAYER;
	        	computerTurn();
	        }
	        
	        //g2d.fillOval(x, y, 30, 30);
	    }
	    
	    private void computerTurn(){
	    	Graphics2D g2d = (Graphics2D) g;
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	            RenderingHints.VALUE_ANTIALIAS_ON);
        	g2d.fillOval(++x, ++y, 30, 30);
        	this.turn = Turn.PLAYER;
	    }
		
		@Override
		public void keyPressed(KeyEvent event) {
			// TODO Auto-generated method stub
	        int code = event.getKeyCode();
	        if (code == KeyEvent.VK_UP) {
	            velY = -2;
	            velX = 0;
	        }
	        if (code == KeyEvent.VK_DOWN) {
	            velY = 2;
	            velX = 0;
	        }
	        if (code == KeyEvent.VK_LEFT) {
	            if (x < 0) {
	                velY = 0;
	                velX = 0;
	            }else {
	            velY = 0;
	            velX = -2;
	            }
	        }
	        if (code == KeyEvent.VK_RIGHT) {
	            if (x > 760) {
	                velY = 0;
	                velX = 0;
	            }
	            velY = 0;
	            velX = 2;
	        }
	        //x += velX;
	        //y += velY;
	        
	        int tempx = human.getX() +velX;
	        int tempy = human.getY() +velY;
	        human.setX(tempx);
	        human.setY(tempy);
		}

		@Override
		public void keyReleased(KeyEvent event) {
			// TODO Auto-generated method stub
	        int code = event.getKeyCode();
	        if (code == KeyEvent.VK_UP) {
	            velY = 0;
	            velX = 0;
	        }
	        if (code == KeyEvent.VK_DOWN) {
	            velY = 0;
	            velX = 0;
	        }
	        if (code == KeyEvent.VK_LEFT) {
	            velY = 0;
	            velX = 0;
	        }
	        if (code == KeyEvent.VK_RIGHT) {
	            velY = 0;
	            velX = 0;
	        }
	        
	        // Computer players turn
	        turn = Turn.COMPUTER;
		}

		@Override
		public void keyTyped(KeyEvent event) {
			// TODO Auto-generated method stub
			
		}
}
