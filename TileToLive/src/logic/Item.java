package logic;

public abstract class Item implements IRenderableObject {
	
	private double x, y;
	private boolean isCollect;
	
	public Item(double x, double y){
		this.x = x;
		this.y = y;
		isCollect = false;
	}
	
	public void update(){
		
	}
	
	public abstract void active();

	public boolean isCollect() {
		return isCollect;
	}

	public void setCollect(boolean isCollect) {
		this.isCollect = isCollect;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	
}
