package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class FinalWindow extends JPanel {

	private JLabel lblwinner;

	/**
	 * Metodo costruttore dell'ultima finestra
	 * @param classifica l'array di piloti in ordine di arrivo
	 */
	public FinalWindow(String[] classifica) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CLASSIFICA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 112, 16);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("VINCITORE");
		lblNewLabel_2.setBounds(308, 10, 132, 16);
		add(lblNewLabel_2);
		
		JList ListClass = new JList(classifica);
		ListClass.setEnabled(false);
		ListClass.setBounds(20, 36, 202, 365);
		add(ListClass);
		
		lblwinner = new JLabel("pilota");
		lblwinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblwinner.setBounds(234, 36, 206, 206);
		add(lblwinner);
		
		JLabel lblNewLabel_1 = new JLabel(classifica[0]);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(244, 252, 187, 16);
		add(lblNewLabel_1);
	}

	public void setLblwinner(String x) {
		lblwinner.setIcon(ClassView.getMap().getImg(x));
	}
	
}
