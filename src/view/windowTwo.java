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
		
		lblCar = new JLabel("New label");
		lblCar.setBounds(148, 48, 658, 195);
		add(lblCar);
		
		listaScuderie = new JList();
		listaScuderie.setModel(new AbstractListModel() {
			String[] values = new String[] {"Ferrari", "Mercedes", "Redbull", "AlfaRomeo", "Haas", "Alpine", "AlphaTauri", "Mclaren", "Williams", "AstonMartin"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		listaScuderie.setBounds(10, 75, 100, 186);
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
			this.repaint();
			break;
		case 1:
					
				break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
					
				break;
		case 8:
			
			break;
		case 9:
			
			break;
		}
	}
}
