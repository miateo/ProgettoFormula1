package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class windowThree extends JPanel {

	JLabel lblNewLabel;
	public windowThree() {
		setLayout(null);
		
		lblNewLabel = new JLabel("Terza finestra");
		lblNewLabel.setBounds(208, 6, 131, 16);
		add(lblNewLabel);
	}
}
