package gui;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class GameWindow {
	private static JFrame Window = new JFrame("LHD-Game");
	private static GameWindow instance = new GameWindow();
	
	private GameWindow(){
		Window.setLayout(new GridBagLayout());
		
		// Only set Size if layout is NOT GridBag
		Window.setSize(675, 450);
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.setVisible(true);
	}
	
	public static GameWindow getInstance(){
		return instance;
	}
	
	
}
