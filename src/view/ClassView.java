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
	private windowFour intermedia;
	private FinalWindow quarta;
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
	 * @StartWindow: schermata iniziale
	 * @seconda: shermata di selezione della scuderia
	 * @terza: schermata di selezione del pilota
	 * @intermedia: schermata di selezione del tracciato
	 * @quarta: schermata in cui viene visualizzata la classifica e il vincitore
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
		intermedia = new windowFour();
		this.setResizable(false);
		this.setVisible(true);
	}

	/**
	 * Impostamento degli acrionlister
	 * @param c: Classe controller
	 */
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

	public FinalWindow getQuarta() {
		return quarta;
	}
	
	/**
	 * avvio seconda schermata
	 */
	public void launchWindowstwo() {
		
		StartWindow.setVisible(false);

        this.setMinimumSize(new Dimension(800, 400));
		setContentPane(seconda);
		
	}

	/**
	 * avvio @terza schermata
	 */
	public void launchWindowsthree() {
		
		seconda.setVisible(false);
        this.setMinimumSize(new Dimension(500, 400));
		this.setBounds(100, 100, 500, 300);
		setContentPane(terza);
	}

	/**
	 * avvio @intermedia schermata
	 */
	public void launchWindowsFour() {
		
		terza.setVisible(false);
		setContentPane(getIntermedia());
	}

	/**
	 * avvio @quarta schermata
	 */
	public void launchWindowsFinal(String[] x) {
		
		getIntermedia().setVisible(false);
		quarta = new FinalWindow(x);
        this.setMinimumSize(new Dimension(500, 475));
		this.setBounds(100, 100, 500, 300);
		quarta.setLblwinner(x[0].split(" ")[2].toLowerCase());
		setContentPane(quarta);
	}



	public windowFour getIntermedia() {
		return intermedia;
	}
	
}
