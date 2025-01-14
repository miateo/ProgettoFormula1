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
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class windowThree extends JPanel {

	private JLabel lblPilota1;//Img primo pilota
	private JLabel lblPilota2;//Img secondo pilota
	private JButton btnAdvance;//bottone di avanzamento(finestra successiva)
	private JTextPane pilota1;//nome primo pilota
	private JTextPane pilota2;//nome secondo pilota
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton btnPilota2;//selezione primo pilota
	private JRadioButton btnPilota1;//selezione secondo pilota

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
		txtpnScegliIlTuo.setBackground(SystemColor.menu);
		txtpnScegliIlTuo.setText("Scegli il tuo pilota:");
		txtpnScegliIlTuo.setEditable(false);
		txtpnScegliIlTuo.setBorder(null);
		txtpnScegliIlTuo.setBounds(10, 10, 156, 19);
		add(txtpnScegliIlTuo);
		
		lblPilota2 = new JLabel("pilota2");
		lblPilota2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPilota2.setBounds(226, 39, 206, 206);
		add(lblPilota2);
		
		pilota1 = new JTextPane();
		pilota1.setFont(new Font("Tahoma", Font.BOLD, 13));
		pilota1.setBackground(SystemColor.menu);
		pilota1.setEditable(false);
		pilota1.setBounds(20, 255, 150, 19);
		add(pilota1);
		
		pilota2 = new JTextPane();
		pilota2.setFont(new Font("Tahoma", Font.BOLD, 13));
		pilota2.setEditable(false);
		pilota2.setBackground(SystemColor.menu);
		pilota2.setBounds(236, 255, 150, 19);
		add(pilota2);
		
		btnPilota1 = new JRadioButton("");
		btnPilota1.setSelected(true);
		buttonGroup.add(btnPilota1);
		btnPilota1.setBounds(67, 275, 103, 21);
		add(btnPilota1);
		
		btnPilota2 = new JRadioButton("");
		buttonGroup.add(btnPilota2);
		btnPilota2.setBounds(261, 275, 103, 21);
		add(btnPilota2);
	}
	
	
	public void setAscoltatoreW3(ClassController c) {
		btnAdvance.addActionListener(c);
	}
	
	/**
	 * selezione pilota in base alla scuderia selezionata
	 * @param x: scuderia
	 */
	public void setLblPiloti(int x) {
		switch(x) {
			case 0:
				lblPilota1.setIcon(ClassView.getMap().getImg("leclerc"));
				lblPilota2.setIcon(ClassView.getMap().getImg("sainz"));
				pilota1.setText("Charles Leclerc");
				pilota2.setText("Carlos Sainz");
				break;
			case 1:
				lblPilota1.setIcon(ClassView.getMap().getImg("hamilton"));
				lblPilota2.setIcon(ClassView.getMap().getImg("russel"));
				pilota1.setText("Lewis Hamilton");
				pilota2.setText("George Russel");
				break;
			case 2:
				lblPilota1.setIcon(ClassView.getMap().getImg("verstappen"));
				lblPilota2.setIcon(ClassView.getMap().getImg("perez"));
				pilota1.setText("Max Verstappen");
				pilota2.setText("Sergio Perez");
				break;
			case 3:
				lblPilota1.setIcon(ClassView.getMap().getImg("bottas"));
				lblPilota2.setIcon(ClassView.getMap().getImg("zhou"));
				pilota1.setText("Valteri Bottas");
				pilota2.setText("Guanyu Zhou");
				break;
			case 4:
				lblPilota1.setIcon(ClassView.getMap().getImg("magnussen"));
				lblPilota2.setIcon(ClassView.getMap().getImg("schumacher"));
				pilota1.setText("Kevin Magnussen");
				pilota2.setText("Mick Schumacher");
				break;
			case 5:
				lblPilota1.setIcon(ClassView.getMap().getImg("ocon"));
				lblPilota2.setIcon(ClassView.getMap().getImg("alonso"));
				pilota1.setText("Esteban Ocon");
				pilota2.setText("Fernando Alonso");
				break;
			case 6:
				lblPilota1.setIcon(ClassView.getMap().getImg("tsunoda"));
				lblPilota2.setIcon(ClassView.getMap().getImg("gasly"));
				pilota1.setText("Yuki Tsunoda");
				pilota2.setText("Pierre Gasly");
				break;
			case 7:
				lblPilota1.setIcon(ClassView.getMap().getImg("riciardo"));
				lblPilota2.setIcon(ClassView.getMap().getImg("norris"));
				pilota1.setText("Daniel Ricciardo");
				pilota2.setText("Lando Norris");
				break;
			case 8:
				lblPilota1.setIcon(ClassView.getMap().getImg("latifi"));
				lblPilota2.setIcon(ClassView.getMap().getImg("albon"));
				pilota1.setText("Nicolas Latifi");
				pilota2.setText("Alexander Albon");
				break;
			case 9:
				lblPilota1.setIcon(ClassView.getMap().getImg("stroll"));
				lblPilota2.setIcon(ClassView.getMap().getImg("vettel"));
				pilota1.setText("Lance Stroll");
				pilota2.setText("Sebastian Vettel");
				break;
		}
		this.repaint();
	}
	
	public JButton getBtnAdvance() {
		return btnAdvance;
	}
	
	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	public JRadioButton getBtnPilota2() {
		return btnPilota2;
	}

	public JRadioButton getBtnPilota1() {
		return btnPilota1;
	}

	public JTextPane getPilota1() {
		return pilota1;
	}

	public JTextPane getPilota2() {
		return pilota2;
	}
}
