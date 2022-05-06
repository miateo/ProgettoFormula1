package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ClassController;

public class windowFour extends JPanel {
	private JButton btnMonaco;
	private JButton btnBritish;
	private JButton btnGiappone;
	private JButton btnCanda;
	private JLabel lbl;
	private JButton btnAdvance;
	
	public windowFour() {
		setLayout(null);
		
		btnCanda = new JButton("Canada");
		btnCanda.setSelected(true);
		btnCanda.setBounds(323, 24, 103, 21);
		add(btnCanda);
		
		btnBritish = new JButton("G.Bretanga");
		btnBritish.setBounds(323, 80, 103, 21);
		add(btnBritish);
		
		btnGiappone = new JButton("Giappone");
		btnGiappone.setBounds(323, 136, 103, 21);
		add(btnGiappone);
		
		btnMonaco = new JButton("Monaco");
		btnMonaco.setBounds(323, 192, 103, 21);
		add(btnMonaco);
		
		lbl = new JLabel();
		lbl.setBounds(10, 10, 116, 73);
		add(lbl);
		
		btnAdvance = new JButton("Avanza");
		btnAdvance.setBounds(323, 269, 103, 21);
		add(btnAdvance);
		insImg("canada");
		
	}

	public void setAscoltatoreW4inter(ClassController c) {
		btnAdvance.addActionListener(c);
		btnMonaco.addActionListener(c);
		btnBritish.addActionListener(c);
		btnCanda.addActionListener(c);
		btnGiappone.addActionListener(c);
	}
	
	public JButton getBtnMonaco() {
		return btnMonaco;
	}

	public JButton getBtnBritish() {
		return btnBritish;
	}

	public JButton getBtnGiappone() {
		return btnGiappone;
	}

	public JButton getBtnCanda() {
		return btnCanda;
	}

	public JButton getBtnAdvance() {
		return btnAdvance;
	}

	public void insImg(String x)
	{
		lbl.setIcon(ClassView.getMap().getImg(x));
		lbl.setBounds(10, 10, ClassView.getMap().getImg(x).getIconWidth(), ClassView.getMap().getImg(x).getIconHeight());
		this.repaint();
	}
}
