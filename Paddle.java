public class Paddle {
	
	private int xCoordinate;
	private int yCoordinate;
	private int paddleWidth;
	private int paddleHeight;
	
	public Paddle(int xCoordinate,int yCoordinate,int paddleWidth,int paddleHeight) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.paddleWidth = paddleWidth;
		this.paddleHeight = paddleHeight;
	}
	
	private void drawPaddle() {
		
	}
	// Ensures that the paddle does not go out of bounds
	private void checkBounds() {
		
	}
	
	public int getXcoordinate() {
		return this.xCoordinate;
	}
	
	public int getYcoordinate() {
		return this.yCoordinate;
	}
	
	public int getPaddleWidth() {
		return this.paddleWidth;
	}
	
	public int getPaddleHeight() {
		return this.paddleHeight;
	}


	
	

}