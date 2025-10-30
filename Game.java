public class Game {
	public Paddle playerPaddle;
	public Paddle aiPaddlePlayer;
	public Ball ball;
	
	
	private int playerScore = 0;
	private int computerScore = 0;
	
	private int centerY = (1300/2)-(150/2);
	
	private static final int MAX_SCORE = 3;
	private boolean isGameStarted = false;
	

	public Game() {
		aiPaddlePlayer = new Paddle(0,325,20,150);
		playerPaddle = new Paddle(0,centerY,20,150);
		ball = new Ball(650,650,30,5,5);
		
	}
	
	
	
	public void updateGameLoop(boolean upPressed,boolean downPressed) {
		if(upPressed == true){
			playerPaddle.movePaddleUp();
		}else if(downPressed == true){
			playerPaddle.movePaddleDown();
		}
	}
	
	private void checkCollisions() {
		
	}
	
	private void checkScore() {
		
	}
	
	private void resetRound() {
		
	}
	
	private void drawGame() {
		
	}
	
	


}
