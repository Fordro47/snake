package control;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class CreateGrid extends JFrame{

	private int width, height;
	private int numTiles;
	private int tileDimensions;
	private int numTileWidth, numTileHeight;
	private Tile[][] tileGrid;
	private JPanel gamePanel;
	
	public CreateGrid(){
		
	}
	public CreateGrid(JPanel gp){
		gamePanel = gp;
		tileDimensions = 10;
		width = Screen.getScreenWidth();
		height = Screen.getScreenHeight();
		
		numTileWidth = (int) Math.floor(width/tileDimensions);
		numTileHeight = (int) Math.floor(height/tileDimensions);
		numTiles = numTileWidth * numTileHeight;
		
		tileGrid = new Tile[numTileWidth][numTileHeight];
		gamePanel.setLayout(new GridLayout(numTileWidth, numTileHeight));
		
		for(int x = 0; x < numTileWidth; x++){
			for(int y = 0; y < numTileHeight; y++){
				tileGrid[x][y] = new Tile(x, y, tileDimensions);
				gamePanel.add(tileGrid[x][y]);
				
				setForeground(Color.GREEN);
			}
		}
		
		System.out.println("Generating Grid");
		//generateGrid();
		
		
		//gamePanel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gamePanel.setVisible(true);
	}
	
//	public static JPanel returnPanel(){
//
//		//return gamePanel;
//
//		
//		
//	}
	
	
}
