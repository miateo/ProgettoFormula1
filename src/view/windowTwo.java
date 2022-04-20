package view;

import javax.swing.JPanel;

import controller.ClassController;

import javax.swing.JButton;
import javax.swing.JLabel;

public class windowTwo extends JPanel {

	private JButton btnAdvance;

	public windowTwo() {
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seconda finestra");
		lblNewLabel.setBounds(97, 74, 131, 16);
		add(lblNewLabel);
		
		btnAdvance = new JButton("continua");
		btnAdvance.setBounds(330, 251, 85, 21);
		add(btnAdvance);
		
	}
	
	public void setAscoltatoreW2(ClassController c) {
		btnAdvance.addActionListener(c);	
	}

	public JButton getBtnAdvance() {
		return btnAdvance;
	}
	
	
}
