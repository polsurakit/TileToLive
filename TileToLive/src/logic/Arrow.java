package logic;

import javafx.scene.canvas.GraphicsContext;

public class Arrow implements IRenderableObject {
	
	private boolean isDead, hasBarrier, hasSpike;
	private double x, y, directionX, directionY;
	private int z;
	private double moveSpeedX, moveSpeedY;
	private double accelerationX, accelerationY;
	private int tickDelay;
	private int currentTick;
	
	public Arrow(){
		isDead = false;
		x = 0l;
		y = 0l;
		z = Integer.MAX_VALUE;
		directionX = 0l;
		directionY = -1l;
		moveSpeedX = 0d;
		moveSpeedY = 0d;
		accelerationX = 5d;
		accelerationY = 5d;
		RenderableHolder.instance.getIRendObject().add(this);
	}
	
	public void update(){
		this.move();
		this.checkCollideDeadDot();
		this.checkCollideItem();
	}
	
	public void move(){
		if (tickDelay == currentTick){
			currentTick = 0;
			x = x + (moveSpeedX += directionX * accelerationX);
			y = y + (moveSpeedY += directionY * accelerationY);
			
		}else currentTick += 1;
	}
	
	public void checkCollideBoarder(){
		
	}
	
	public void checkCollideDeadDot(){
		for (IRenderableObject iro : RenderableHolder.instance.getIRendObject()){
			if (iro instanceof DeadDot){
				DeadDot dot = (DeadDot) iro;
				if (dot.getX()< x && x < dot.getX() + 5 && dot.getY() < y && y < dot.getY() + 5){
					isDead = true;
				}
			}
		}
	}
	
	public void checkCollideItem(){
		
	}
	
	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		
	}
	
	public int getZ(){
		return z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDirectionX() {
		return directionX;
	}

	public void setDirectionX(double directionX) {
		this.directionX = directionX;
	}

	public double getDirectionY() {
		return directionY;
	}

	public void setDirectionY(double directionY) {
		this.directionY = directionY;
	}

	public boolean isDead() {
		return isDead;
	}

	public double getMoveSpeedX() {
		return moveSpeedX;
	}


}
