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

public class ClassView extends JFrame {

	private JPanel StartWindow;

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
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setToolTipText("");
		progressBar.setBounds(103, 185, 228, 20);
		StartWindow.add(progressBar);
		
		this.setVisible(true);
	}

}
