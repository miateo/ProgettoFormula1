package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ClassController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Dimension;

public class ClassView extends JFrame{

	private JPanel StartWindow;
	private windowTwo seconda;
	private windowThree terza;
	private windowFour quarta;
	private JLabel lblTitolo;
	private JButton btnStartGame;

	private static ImgLibrary map = null;
	protected static ImgLibrary getMap() {
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
		this.setResizable(false);
		this.setVisible(true);
	}

	public void setAscoltatore(ClassController c) {
		btnStartGame.addActionListener(c);	
	}
	
	public JButton getBtnStartGame() {
		return btnStartGame;
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
	
	public void launchWindowstwo() {
		
		StartWindow.setVisible(false);

        this.setMinimumSize(new Dimension(800, 400));
		setContentPane(seconda);
		
	}
	
	public void launchWindowsthree() {
		
		seconda.setVisible(false);
        this.setMinimumSize(new Dimension(500, 400));
		this.setBounds(100, 100, 500, 300);
		setContentPane(terza);
	}
	
	public void launchWindowsFour() {
		
		terza.setVisible(false);
		setContentPane(quarta);
	}
	
}
