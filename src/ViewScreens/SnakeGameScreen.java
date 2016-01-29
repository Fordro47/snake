package ViewScreens;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import control.CreateGrid;
import control.Screen;

public class SnakeGameScreen extends JFrame implements ActionListener {

	private JPanel infoPanel, gamePanel;
	private JButton quitButton;
	private JLabel scoreLabel, score;
	
	
	public SnakeGameScreen(){
		
		setLayout(new BorderLayout());
		setSize(Screen.getScreenWidth(), Screen.getScreenHeight());
		
		init();
		
		add(infoPanel, BorderLayout.NORTH);
		add(gamePanel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void init(){
		infoPanel = new JPanel();
		infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.X_AXIS));
		
		quitButton = new JButton("Quit");
		quitButton.addActionListener(this);
		infoPanel.add(quitButton);
		
		scoreLabel = new JLabel("Score: ");
		score = new JLabel("00000");
		
		infoPanel.add(scoreLabel);
		infoPanel.add(score);
		
		gamePanel = new JPanel();
		new CreateGrid(gamePanel);
		//gamePanel = CreateGrid.returnPanel();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton src = (JButton) e.getSource();
		if(src == quitButton){
			new StartScreen();
			System.out.println("The Player has quit the game");
			dispose();
			
		}
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
