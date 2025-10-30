
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class MyPanel extends JPanel implements Runnable, KeyListener{
	
	public Game myGame;
	public Ball myBall;
	public Paddle myPaddle;
	public Paddle myAiPaddle;

	private Thread gameThread;

	public boolean upPressed;
	public boolean downPressed;
	
	private static final int WINDOW_WIDTH = 1300;
	private static final int WINDOW_HEIGHT = 1300;
	
	private int posX;
	
	public MyPanel(Game g,Ball b,Paddle p,Paddle ai) {
		this.setPreferredSize(new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT));
		this.setBackground(Color.BLACK);
		myGame = g;
		myBall = b;
		myPaddle = p;
		myAiPaddle = ai;
		posX = WINDOW_WIDTH - myAiPaddle.getPaddleWidth();
	}

	public void startGame() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
		while(gameThread != null) {
			myBall.updateBallPosition(WINDOW_HEIGHT);
			myGame.updateGameLoop(upPressed,downPressed);
			repaint();
		}
	}
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		g2D.setColor(getPaddleAndBallColor());
		g2D.fillRect(myPaddle.getXcoordinate(),myPaddle.getYcoordinate(),myPaddle.getPaddleWidth(),myPaddle.getPaddleHeight());
		g2D.fillRect(posX,myAiPaddle.getYcoordinate(),myAiPaddle.getPaddleWidth(),myAiPaddle.getPaddleHeight());
		g2D.fillOval(myBall.getBallXcoordinate(),myBall.getBallYcoordinate(),myBall.getBallRadius(),myBall.getBallRadius());
		
		g2D.setColor(Color.RED);
		g2D.fillRect(WINDOW_WIDTH / 2 -4,0,8,WINDOW_HEIGHT);
		
		g2D.setColor(Color.RED);
		g2D.fillRect(0,0,WINDOW_WIDTH,8);
		
		g2D.setColor(Color.RED);
		g2D.fillRect(0,WINDOW_HEIGHT-8,WINDOW_WIDTH,8);
	}

	public void keyTyped(KeyEvent e) {
		
		
	}
	

	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		switch(key){
			case KeyEvent.VK_UP:
				upPressed = true;
				System.out.println("Key Pressed up");
				break;
			case KeyEvent.VK_DOWN:
				downPressed = true;
				System.out.println("Key Pressed down");
				break;
		}

	}

	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		switch(key){
			case KeyEvent.VK_UP:
				upPressed = false;
				System.out.println("Key Released");
				break;
			case KeyEvent.VK_DOWN:
				downPressed = false;
				System.out.println("Key Released 2");
				break;
		}

	}
	
	private Color getPaddleAndBallColor() {
		return Color.WHITE;
	}

}
