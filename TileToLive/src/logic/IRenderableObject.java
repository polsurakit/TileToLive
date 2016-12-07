package logic;

import javafx.scene.canvas.GraphicsContext;

public interface IRenderableObject {
	
	public void draw(GraphicsContext gc);
	public int getZ();
}
