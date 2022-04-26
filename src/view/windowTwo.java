package view;

import javax.swing.JPanel;

import controller.ClassController;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.List;

public class windowTwo extends JPanel {

	private JButton btnAdvance;
	private JTextField txtSelezionaLaTua;
	private JList listaScuderie;
	private JLabel lblCar;

	public windowTwo() {
		
		setLayout(null);
		
		btnAdvance = new JButton("continua");
		btnAdvance.setBounds(330, 251, 85, 21);
		add(btnAdvance);
		
		lblCar = new JLabel();
		lblCar.setBounds(148, 48, 658, 195);
		lblCar.setIcon(ClassView.getMap().getImg("ferrari"));
		add(lblCar);
		
		String[] scuderie = new String[] {"Ferrari", "Mercedes", "Redbull", "AlfaRomeo", "Haas", "Alpine", "AlphaTauri", "Mclaren", "Williams", "AstonMartin"};
		listaScuderie = new JList(scuderie);
		listaScuderie.setBounds(10, 75, 100, 186);
		listaScuderie.setSelectedIndex(0);
		add(listaScuderie);
		
		txtSelezionaLaTua = new JTextField();
		txtSelezionaLaTua.setBorder(null);
		txtSelezionaLaTua.setForeground(Color.BLACK);
		txtSelezionaLaTua.setText("Seleziona la tua scuderia");
		txtSelezionaLaTua.setEditable(false);
		txtSelezionaLaTua.setBounds(10, 48, 234, 19);
		add(txtSelezionaLaTua);
		txtSelezionaLaTua.setColumns(1);
		
	}
	
	public JList getListaScuderie() {
		return listaScuderie;
	}

	public void setAscoltatoreW2(ClassController c) {
		btnAdvance.addActionListener(c);
		listaScuderie.addListSelectionListener(c);
	}

	public JButton getBtnAdvance() {
		return btnAdvance;
	}
	
	public void setIconCar(int pos) {
		switch(pos) {
		case 0:
			lblCar.setIcon(ClassView.getMap().getImg("ferrari"));
			break;
		case 1:
			lblCar.setIcon(ClassView.getMap().getImg("mercedes"));
			break;
		case 2:
			lblCar.setIcon(ClassView.getMap().getImg("redbull"));
			break;
		case 3:
			lblCar.setIcon(ClassView.getMap().getImg("alfaromeo"));
			break;
		case 4:
			lblCar.setIcon(ClassView.getMap().getImg("haas"));
			break;
		case 5:
			lblCar.setIcon(ClassView.getMap().getImg("alpine"));
			break;
		case 6:
			lblCar.setIcon(ClassView.getMap().getImg("alphatauri"));
			break;
		case 7:
			lblCar.setIcon(ClassView.getMap().getImg("mclaren"));
			break;
		case 8:
			lblCar.setIcon(ClassView.getMap().getImg("williams"));
			break;
		case 9:
			lblCar.setIcon(ClassView.getMap().getImg("astonmartin"));
			break;
		}
		this.repaint();
	}
}
