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
	private windowTwo seconda;
	private windowThree terza;
	private windowFour quarta;
	private JProgressBar progressBar;
	private JLabel lblTitolo;
	private JButton btnStartGame;

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
		progressBar.setVisible(false);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		progressBar.setForeground(Color.RED);
		progressBar.setBounds(123, 193, 200, 20);
		progressBar.setValue(0);
		StartWindow.add(progressBar);
		
		lblTitolo = new JLabel("");
		lblTitolo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitolo.setFont(new Font("Impact", Font.BOLD, 30));
		lblTitolo.setBounds(104, 43, 220, 50);
		lblTitolo.setIcon(getMap().getImg("logo"));
		StartWindow.add(lblTitolo);
		
		btnStartGame = new JButton("Play");
		btnStartGame.setBounds(185, 152, 83, 29);
		StartWindow.add(btnStartGame);

		seconda = new windowTwo();
		terza = new windowThree();
		quarta = new windowFour();
		
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
	
	public JPanel getStartWindow() {
		return StartWindow;
	}

	public windowTwo getSeconda() {
		return seconda;
	}

	public windowThree getTerza() {
		return terza;
	}

	public windowFour getQuarta() {
		return quarta;
	}

	public class Caricamento extends Thread{
		public void run() {
			for(int i=0;i<=100;i++) {
				
				progressBar.setValue(i);
				try {
					Thread.sleep(25);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			launchWindowstwo();
		}
	}

	public Caricamento getC() {
		return new Caricamento();
	}
	
	public void launchWindowstwo() {
		
		StartWindow.setVisible(false);
		setContentPane(seconda);
		
	}
	
	public void launchWindowsthree() {
		
		seconda.setVisible(false);
		setContentPane(terza);
	}
	
	public void launchWindowsFour() {
		
		terza.setVisible(false);
		setContentPane(quarta);
	}
	
}
