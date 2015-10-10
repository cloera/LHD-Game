package driver;

import javax.swing.JFrame;

import gui.GameWindow;
import gui.GameWindow.Turn;

public class driver {

	public static void main(String[] args) {
		// Frame Setup
        JFrame frame = new JFrame("LHD-Game");
        GameWindow game = new GameWindow();
        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Game Run
        while (true) {
            game.repaint();

          /*  if(game.turn == Turn.OPPONENT)
            	game.turn = Turn.PLAYER;
            else if(game.turn == Turn.PLAYER)
                game.turn = Turn.OPPONENT;
            Thread.sleep(100);*/
        }
	}
}
