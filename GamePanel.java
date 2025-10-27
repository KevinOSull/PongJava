import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel extends JFrame{
	private Game myGame;
	private MyPanel panel;
	
	
	GamePanel(){
		myGame = new Game();
		panel = new MyPanel(myGame,myGame.ball,myGame.playerPaddle,myGame.aiPaddlePlayer);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	
	

}
