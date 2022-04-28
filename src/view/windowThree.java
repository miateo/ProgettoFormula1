package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ClassController;
import javax.swing.JTextPane;
import javax.swing.text.View;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class windowThree extends JPanel {

	private JLabel lblPilota1;
	private JLabel lblPilota2;
	private JButton btnAdvance;
	
	
	public windowThree() {
		setLayout(null);
		
		lblPilota1 = new JLabel("pilota1");
		lblPilota1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPilota1.setBounds(10, 39, 206, 206);
		add(lblPilota1);
		
		btnAdvance = new JButton("continua");
		btnAdvance.setBounds(347, 300, 85, 21);
		add(btnAdvance);
		
		JTextPane txtpnScegliIlTuo = new JTextPane();
		txtpnScegliIlTuo.setBackground(Color.WHITE);
		txtpnScegliIlTuo.setText("Scegli il tuo pilota:");
		txtpnScegliIlTuo.setEditable(false);
		txtpnScegliIlTuo.setBorder(null);
		txtpnScegliIlTuo.setBounds(10, 10, 156, 19);
		add(txtpnScegliIlTuo);
		
		lblPilota2 = new JLabel("pilota2");
		lblPilota2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPilota2.setBounds(226, 39, 206, 206);
		add(lblPilota2);
	}
	
	public void setAscoltatoreW3(ClassController c) {
		btnAdvance.addActionListener(c);	
	}
	
	public void setLblPiloti(int x) {
		switch(x) {
			case 0:
				lblPilota1.setIcon(ClassView.getMap().getImg("leclerc"));
				lblPilota2.setIcon(ClassView.getMap().getImg("sainz"));
				break;
			case 1:
				lblPilota1.setIcon(ClassView.getMap().getImg("hamilton"));
				lblPilota2.setIcon(ClassView.getMap().getImg("russel"));
				break;
			case 2:
				lblPilota1.setIcon(ClassView.getMap().getImg("verstappen"));
				lblPilota2.setIcon(ClassView.getMap().getImg("perez"));
				break;
			case 3:
				lblPilota1.setIcon(ClassView.getMap().getImg("bottas"));
				lblPilota2.setIcon(ClassView.getMap().getImg("zhou"));
				break;
			case 4:
				lblPilota1.setIcon(ClassView.getMap().getImg("magnussen"));
				lblPilota2.setIcon(ClassView.getMap().getImg("schumacher"));
				break;
			case 5:
				lblPilota1.setIcon(ClassView.getMap().getImg("ocon"));
				lblPilota2.setIcon(ClassView.getMap().getImg("alonso"));
				break;
			case 6:
				lblPilota1.setIcon(ClassView.getMap().getImg("tsunoda"));
				lblPilota2.setIcon(ClassView.getMap().getImg("gasly"));
				break;
			case 7:
				lblPilota1.setIcon(ClassView.getMap().getImg("riciardo"));
				lblPilota2.setIcon(ClassView.getMap().getImg("norris"));
				break;
			case 8:
				lblPilota1.setIcon(ClassView.getMap().getImg("latifi"));
				lblPilota2.setIcon(ClassView.getMap().getImg("albon"));
				break;
			case 9:
				lblPilota1.setIcon(ClassView.getMap().getImg("stroll"));
				lblPilota2.setIcon(ClassView.getMap().getImg("vettel"));
				break;
		}
		this.repaint();
	}

	public JButton getBtnAdvance() {
		return btnAdvance;
	}
}
