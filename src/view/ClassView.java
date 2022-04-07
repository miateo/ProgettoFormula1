package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class ClassView extends JFrame {

	private JPanel StartWindow;
	private JProgressBar progressBar;
	private JLabel lblNameGame;
	private JButton btnStartGame;

	/**
	 * Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassView frame = new ClassView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClassView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		StartWindow = new JPanel();
		StartWindow.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(StartWindow);
		StartWindow.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setVisible(false);
		progressBar.setValue(3);
		progressBar.setToolTipText("");
		progressBar.setBounds(103, 185, 228, 20);
		StartWindow.add(progressBar);
		
		lblNameGame = new JLabel("Formula 1");
		lblNameGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameGame.setFont(new Font("Impact", Font.BOLD, 30));
		lblNameGame.setBounds(103, 43, 228, 53);
		StartWindow.add(lblNameGame);
		
		btnStartGame = new JButton("Play");
		btnStartGame.setBounds(178, 144, 83, 29);
		StartWindow.add(btnStartGame);
		
		this.setVisible(true);
	}

	public JButton getBtnStartGame() {
		return btnStartGame;
	}
	public JProgressBar getProgressBar() {
		return progressBar;
	}
	public void progressBar() {
		int progresso = 0;
		while(progresso <= 100) {
			progressBar.setValue(progresso);
			progresso++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
