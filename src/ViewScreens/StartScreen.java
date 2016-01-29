/**
 * 
 */
package ViewScreens;

/**
 * @author Andrew Ford
 *
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import control.Screen;

public class StartScreen extends JFrame implements ActionListener{
	
	private JPanel titlePanel, buttonPanel;
	private JLabel gameName;
	private JButton startButton, scoreButton, optionsButton;
	
	
	public StartScreen(){
		setTitle("Snake");
		setLayout(new BorderLayout());
		
		init();
		Screen.setScreenHeight(800);
		Screen.setScreenWidth(1000);
		
		setSize(Screen.getScreenWidth(), Screen.getScreenHeight());
	
		add(titlePanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void init() {
		titlePanel = new JPanel();
		titlePanel.setBackground(Color.BLACK);
		
		gameName = new JLabel("SNAKE");
		gameName.setForeground(Color.GREEN);
		titlePanel.add(gameName);
		
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		
		startButton = new JButton("Start");
		scoreButton = new JButton("High Scores");
		optionsButton = new JButton("Options");
		
		startButton.addActionListener(this);
		scoreButton.addActionListener(this);
		optionsButton.addActionListener(this);
		
		buttonPanel.add(startButton);
		buttonPanel.add(scoreButton);
		buttonPanel.add(optionsButton);
	}

	public void actionPerformed(ActionEvent ae) {
		JButton src = (JButton) ae.getSource();
		
		if(src == startButton){
			System.out.println("Start button Pressed");
			//Start Game
			new SnakeGameScreen();
			dispose();
		}
		else if(src == scoreButton){
			System.out.println("Score button pressed");
			//Show High Scores
			new HighScoreScreen();
			dispose();
			
		}
		else if(src == optionsButton){
			System.out.println("Options Button Pressed");
			//Show Options
			//new OptionsScreen();
			dispose();
		}
		
	}
	
}