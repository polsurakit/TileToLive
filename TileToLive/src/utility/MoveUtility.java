package utility;

import java.awt.Dimension;
import java.awt.Toolkit;

public class MoveUtility {
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public static double width = screenSize.getWidth();
	public static double height = screenSize.getHeight();

}
