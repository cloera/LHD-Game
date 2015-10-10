package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow implements KeyListener, ActionListener {
	// Constant Members
	
	private JFrame contentPane = new JFrame("LHD-Game");
	private JPanel screen = new JPanel();
	//private Graphics2D player = new Graphics2D(10,10,10,10);
	private double x, y;
	private double velX = 0, velY = 0;
	
	public GameWindow(){
		contentPane.setLayout(new GridBagLayout());
		
		// Only set Size if layout is NOT GridBag
		contentPane.setSize(400, 400);
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setVisible(true);
		contentPane.setFocusable(true);
		contentPane.addKeyListener(this);
		startGame();
	}
	
	public void paintPlayer(Graphics g){
		contentPane.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		Shape circle = new Ellipse2D.Double(x, y, 40, 40);
		g2.setColor(Color.BLUE);
		g2.fill(circle);
	}
	
	
	public void startGame(){
		player = new JButton("");
		player.setBackground(Color.BLUE);
		screen.add(player);
		contentPane.add(screen);
	}

    public void actionPerformed(ActionEvent e) {
    	contentPane.repaint();
        x += velX;
        y += velY;
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
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
