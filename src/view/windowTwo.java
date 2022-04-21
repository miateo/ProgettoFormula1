package view;

import javax.swing.JPanel;

import controller.ClassController;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;

public class windowTwo extends JPanel {

	private JButton btnAdvance;

	public windowTwo() {
		
		setLayout(null);
		
		btnAdvance = new JButton("continua");
		btnAdvance.setBounds(330, 251, 85, 21);
		add(btnAdvance);
		
		JLabel lblCar = new JLabel("New label");
		lblCar.setBounds(29, 46, 400, 125);
		lblCar.setIcon(ClassView.getMap().getImg("mclaren"));
		add(lblCar);
		
	}
	
	public void setAscoltatoreW2(ClassController c) {
		btnAdvance.addActionListener(c);	
	}

	public JButton getBtnAdvance() {
		return btnAdvance;
	}
}
