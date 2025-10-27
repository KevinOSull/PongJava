public class Ball {
	
	private int xCoordinate;
	private int yCoordinate;
	private int radius;
	private int velocityY;
	private int velocityX;
	
	
	
	public Ball(int xCoordinate,int yCoordinate,int radius,int velocityY,int velocityX) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.radius = radius;
		this.velocityY = velocityY;
		this.velocityX = velocityX;
	
	}
	
	private void drawBall() {
		
	}
	
	private void updateBallPosition() {
		
	}
	
	private void resetBallPosition() {
		
	}
	
	public int getBallXcoordinate() {
		return this.xCoordinate;
	}
	
	public int getBallYcoordinate() {
		return this.yCoordinate;
	}
	
	public int getBallRadius() {
		return this.radius;
	}
	
	public int getVelocityY() {
		return this.velocityY;
	}
	
	public int getVelocityX() {
		return this.velocityX;
	}
	
	

}
