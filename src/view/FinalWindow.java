package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class FinalWindow extends JPanel {

	private JLabel lblwinner;//img pilota vincente 
	private JLabel lblVincitoreTitle;
	private JLabel lblClassficaTitle;
	private JList ListClass;//classifica in ordine di arrivo
	private JLabel lblNomePilota;//nome del pilota

	
	/**
	 * Metodo costruttore dell'ultima finestra
	 * @param classifica l'array di piloti in ordine di arrivo
	 */
	public FinalWindow(String[] classifica) {
		setLayout(null);
		
		lblVincitoreTitle = new JLabel("CLASSIFICA");
		lblVincitoreTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblVincitoreTitle.setBounds(10, 10, 112, 16);
		add(lblVincitoreTitle);
		
		lblClassficaTitle = new JLabel("VINCITORE");
		lblClassficaTitle.setBounds(308, 10, 132, 16);
		add(lblClassficaTitle);
		
		ListClass = new JList(classifica);
		ListClass.setEnabled(false);
		ListClass.setBounds(20, 36, 202, 365);
		add(ListClass);
		
		lblwinner = new JLabel("pilota");
		lblwinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblwinner.setBounds(234, 36, 206, 206);
		add(lblwinner);
		
		lblNomePilota = new JLabel(classifica[0]);
		lblNomePilota.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomePilota.setBounds(244, 252, 187, 16);
		add(lblNomePilota);
	}

	public void setLblwinner(String x) {
		lblwinner.setIcon(ClassView.getMap().getImg(x));
	}
	
}
