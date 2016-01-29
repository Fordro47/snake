package control;

public class Screen {
	public static int SCREEN_WIDTH;
	public static int SCREEN_HEIGHT;
	
	public static int getScreenWidth(){
		return SCREEN_WIDTH;
	}
	public static int getScreenHeight(){
		return SCREEN_HEIGHT;
	}
	public static void setScreenWidth(int newWidth){
		SCREEN_WIDTH = newWidth;
	}
	public static void setScreenHeight(int newHeight){
		SCREEN_HEIGHT = newHeight;
	}
}
