package control;

import java.awt.Color;

import javax.swing.JPanel;

public class Tile extends JPanel{
	
	public int x_pos;
	public int y_pos;
	public int tile_width;
	public int tile_height;
	public boolean isEmpty;
	public int tileDimensions;
	private Color tile_color;
	
	public Tile(){
		
	}
	public Tile(int x, int y, int tileDimensions){
		x_pos = x * tileDimensions;
		y_pos = y * tileDimensions;
		tile_width = tileDimensions;
		tile_height = tileDimensions;
		this.tileDimensions = tileDimensions;
		isEmpty = true;		
		tile_color = Color.CYAN;
		
		System.out.println("tiles" + x + " " + y);
	}
	public int getX(){
		return x_pos;
	}
	public int getY(){
		return y_pos;
	}
	public int getWidth(){
		return tile_width;
	}
	public int getHeight(){
		return tile_height;
	}
	public Color getColor(){
		return tile_color;
	}
	public void setX(int newX){
		x_pos = newX;
	}
	public void setY(int newY){
		y_pos = newY;
	}
	public void setWidth(int newWidth){
		tile_width = newWidth;
	}
	public void setHeight(int newHeight){
		tile_height = newHeight;
	}
	public void setColor(Color col){
		tile_color = col;
	}
}
