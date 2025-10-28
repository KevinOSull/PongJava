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
	
	
	
	private void checkBounds(int windowHeight) {
		if(this.yCoordinate < 0) {
			this.yCoordinate = 0;
		}
		
		if(this.yCoordinate + paddleHeight > windowHeight) {
			this.yCoordinate = windowHeight - paddleHeight;
		}
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
