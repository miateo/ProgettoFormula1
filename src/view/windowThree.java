package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ClassController;

public class windowThree extends JPanel {

	JLabel lblNewLabel;
	private JButton btnAdvance;
	
	public windowThree() {
		setLayout(null);
		
		lblNewLabel = new JLabel("Terza finestra");
		lblNewLabel.setBounds(208, 6, 131, 16);
		add(lblNewLabel);
		
		btnAdvance = new JButton("continua");
		btnAdvance.setBounds(330, 251, 85, 21);
		add(btnAdvance);
	
	}
	
	public void setAscoltatoreW3(ClassController c) {
		btnAdvance.addActionListener(c);	
	}

	public JButton getBtnAdvance() {
		return btnAdvance;
	}
	
}
