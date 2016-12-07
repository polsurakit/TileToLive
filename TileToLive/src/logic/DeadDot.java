package logic;



import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

public class DeadDot implements IRenderableObject {

	private boolean isDead, isIced;
	private double x, y;
	private int z;
	private double moveSpeed;
	private double accelerationX, accelerationY;
	
	public DeadDot(double x, double y){
		this.x = x;
		this.y = y;
		isDead = false;
		moveSpeed = 0d;
		accelerationX = 0d;
		accelerationY = 0d;
		RenderableHolder.instance.getIRendObject().add(this);
	}
	
	public void update(){
		
	}
	
	public void move(){
		
	}
	
	public void draw(GraphicsContext gc){
		gc.setFill(Color.RED);
		gc.fillOval(x+5, y+5, 10, 10);
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
}
