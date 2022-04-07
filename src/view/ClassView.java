package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
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

	private static ImgLibrary map = null;
	private static ImgLibrary getMap() {
		if(map==null) {
			map = new ImgLibrary();
		}
		return map;
	}
	
	private JPanel StartWindow;
	
	
	private JPanel contentPane;

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

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	}

}
