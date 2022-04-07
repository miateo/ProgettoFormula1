package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ClassController;

import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JProgressBar;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class ClassView extends JFrame{

	private JPanel StartWindow;
	private JProgressBar progressBar;
	private JLabel lblNameGame;
	private JButton btnStartGame;
	private JButton btnGoWindowTwo;

	private static ImgLibrary map = null;
	private static ImgLibrary getMap() {
		if(map==null) {
			map = new ImgLibrary();
		}
		return map;
	}
	


	/**
	 * Create the frame.
	 */
	public ClassView() {
		setTitle("Formula 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		StartWindow = new JPanel();
		StartWindow.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(StartWindow);
		StartWindow.setLayout(null);
		
		progressBar = new JProgressBar(0,100);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		progressBar.setForeground(Color.RED);
		progressBar.setBounds(103, 185, 200, 20);
		progressBar.setValue(0);
		StartWindow.add(progressBar);
		
		lblNameGame = new JLabel("Formula 1");
		lblNameGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameGame.setFont(new Font("Impact", Font.BOLD, 30));
		lblNameGame.setBounds(103, 43, 228, 53);
		StartWindow.add(lblNameGame);
		
		btnStartGame = new JButton("Play");
		btnStartGame.setBounds(178, 144, 83, 29);
		StartWindow.add(btnStartGame);
		
		btnGoWindowTwo = new JButton("Continue");
		btnGoWindowTwo.setBounds(178, 144, 83, 29);
		StartWindow.add(btnGoWindowTwo);
		btnGoWindowTwo.setVisible(false);
		
		this.setVisible(true);
	}

	public void setAscoltatore(ClassController c) {
	btnStartGame.addActionListener(c);	
	}
	
	public JButton getBtnStartGame() {
		return btnStartGame;
	}
	public JProgressBar getProgressBar() {
		return progressBar;
	}
	public JButton getBtnGoWindowTwo() {
		return btnGoWindowTwo;
	}
	
	public void caricamento() {
		int progresso = 1 ;
		while(progresso<=100)
		{
			progressBar.setValue(progresso);
			progresso++;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

}
