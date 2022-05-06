package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FinalWindow extends JPanel {

	/**
	 * Create the panel.
	 */
	public FinalWindow() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VINCITORE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(149, 35, 112, 16);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(46, 71, 132, 152);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("{name}");
		lblNewLabel_2.setBounds(219, 71, 132, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("{BOT}");
		lblNewLabel_3.setBounds(219, 99, 61, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("{Scuderia}");
		lblNewLabel_4.setBounds(318, 99, 61, 16);
		add(lblNewLabel_4);

	}

}
