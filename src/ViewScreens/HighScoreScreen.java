package ViewScreens;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import control.Screen;

public class HighScoreScreen extends JFrame implements ActionListener{
	
		private JPanel scorePanel, titlePanel, buttonPanel, playerPanel;
		private JLabel pageName, firstPlayer, firstScore;
		private JButton backButton;
	
		public HighScoreScreen(){
			setLayout(new BorderLayout());
			setSize(Screen.getScreenWidth(), Screen.getScreenHeight());
			init();
			
			add(titlePanel, BorderLayout.NORTH);
			add(playerPanel, BorderLayout.WEST);
			add(scorePanel, BorderLayout.EAST);
			add(buttonPanel, BorderLayout.SOUTH);
			
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setVisible(true);
			
		}
		public void init(){
			
			titlePanel = new JPanel();
			pageName = new JLabel("High Scores");
			titlePanel.add(pageName);
			
			playerPanel = new JPanel();
			firstPlayer = new JLabel(getPlayerName(1));
			playerPanel.add(firstPlayer);
			
			scorePanel = new JPanel();
			firstScore = new JLabel(getPlayerScore(1));
			playerPanel.add(firstScore);
			
			buttonPanel = new JPanel();
			backButton = new JButton("Back");
			backButton.addActionListener(this);
			buttonPanel.add(backButton);
			
		}
		public String getPlayerName(int playerRank){
			if(playerRank == 1){
				return "Andrew";
			}
			else{
				return "NONE";
			}
		}
		public String getPlayerScore(int playerRank){
			if(playerRank == 1){
				return "12222";
			}
			else{
				return "NONE";
			}
		}
		
		
//		public static void main(String[] args)
//		{
//			javax.swing.JFrame frame = new javax.swing.JFrame();
//			frame.getContentPane().setLayout(new java.awt.CardLayout());
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frame.pack();
//			frame.setVisible(true);
//		}
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton src = (JButton) e.getSource();
			if(src == backButton){
				//go back to the start page
				new StartScreen();
				System.out.println("The player returned to the start screen");
				dispose();
			}
			
		}
}
