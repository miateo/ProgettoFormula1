package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class windowFour extends JPanel {

	JLabel lblNewLabel;
	public windowFour() {
		setLayout(null);
		
		lblNewLabel = new JLabel("quarta finestra");
		lblNewLabel.setBounds(208, 6, 131, 16);
		add(lblNewLabel);
	}
}
