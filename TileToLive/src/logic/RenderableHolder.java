package logic;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;

public class RenderableHolder {
	
	public List<Image> arrowImage;
	public Image dotImage;
	public List<Image> itemImage;
	public List<IRenderableObject> iRendObject;
	public static RenderableHolder instance = new RenderableHolder();
	
	static {
		loadResource();
	}
	
	public RenderableHolder(){
		iRendObject = new ArrayList<>();
	}
	
	public static void loadResource(){
		
	}
	
	public List<IRenderableObject> getIRendObject(){
		return iRendObject;
	}
	
}
