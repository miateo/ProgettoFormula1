package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.ClassModel;
import view.ClassView;
import view.windowTwo;

public class ClassController implements ActionListener, ListSelectionListener{
	private ClassModel model;
	private ClassView view;
	
	public ClassController(ClassModel model, ClassView view) {
		this.model = model;
		this.view = view;
		view.setAscoltatore(this);
		view.getSeconda().setAscoltatoreW2(this);
		view.getTerza().setAscoltatoreW3(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == view.getBtnStartGame()) {
			view.getBtnStartGame().setVisible(false);
			view.launchWindowstwo();
		}
		
		if(e.getSource() == view.getSeconda().getBtnAdvance())
		{
			view.launchWindowsthree();
			view.getTerza().setLblPiloti(model.getNscuderia());
//			System.out.print(model.getScuderia());
		}
		
		if(e.getSource() == view.getTerza().getBtnAdvance())
		{
			if(view.getTerza().getButtonGroup().getSelection() == view.getTerza().getBtnPilota1().getModel())
			{
				System.out.println(view.getTerza().getPilota1().getText());
				model.setPilota(view.getTerza().getPilota1().getText());
			}else {
				System.out.println(view.getTerza().getPilota2().getText());
				model.setPilota(view.getTerza().getPilota2().getText());
			}
			
			Macchina m[] = new Macchina[20];
			Semaphore s = new Semaphore(0);
			Classifica c = new Classifica(s);
			String[] classifica = new String[20];
			int i = 0;
			
			m[1] = new Macchina(c, "Charles Leclerc");
			m[2] = new Macchina(c, "Carlos Sainz");
			m[3] = new Macchina(c, "Lando Norris");
			m[4] = new Macchina(c, "Daniel Ricciardo");
			m[5] = new Macchina(c, "Yuki Tsunoda");
			m[6] = new Macchina(c, "Pierre Gasly");
			m[7] = new Macchina(c, "Max Verstappen");
			m[8] = new Macchina(c, "Sergio Perez");
			m[9] = new Macchina(c, "Lance Stroll");
			m[10] = new Macchina(c, "Sebastian Vettel");
			m[11] = new Macchina(c, "Valteri Bottas");
			m[12] = new Macchina(c, "Guanyu Zhou");
			m[13] = new Macchina(c, "Alexander Albon");
			m[14] = new Macchina(c, "Nicolas Latifi");
			m[15] = new Macchina(c, "Esteban Ocon");
			m[16] = new Macchina(c, "Fernando Alonso");
			m[17] = new Macchina(c, "Mick Schumacher");
			m[18] = new Macchina(c, "Kevin Magnussen");
			m[19] = new Macchina(c, "Lewis Hamilton");
			m[0] = new Macchina(c, "George Russel");
			
			while(c.isEmpty()) {
				classifica[i++] = c.Dequeue();
			}
			
			try {
				s.acquire();
				model.setClassifica(classifica);
				//bisgona fare una pila e pushare tutto dentro per poi pullarlo fuori
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			for(int i1 = 0; i1 < classifica.length;i1++) {
				int j = 1;
				System.out.println(""+j+classifica[i1]);
				j++;
			}
			view.launchWindowsFour();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(view.getSeconda().getListaScuderie().getSelectedValue() == "Ferrari") {
			model.setScuderia("Ferrari");
			view.getSeconda().setIconCar(0);
			model.setNscuderia(0);
		}
		if(view.getSeconda().getListaScuderie().getSelectedValue() == "Mercedes") {
			model.setScuderia("Mercedes");
			view.getSeconda().setIconCar(1);
			model.setNscuderia(1);
		}
		if(view.getSeconda().getListaScuderie().getSelectedValue() == "Redbull") {
			model.setScuderia("Redbull");
			view.getSeconda().setIconCar(2);
			model.setNscuderia(2);
		}
		if(view.getSeconda().getListaScuderie().getSelectedValue() == "AlfaRomeo") {
			model.setScuderia("AlfaRomeo");
			view.getSeconda().setIconCar(3);
			model.setNscuderia(3);
		}
		if(view.getSeconda().getListaScuderie().getSelectedValue() == "Haas") {
			model.setScuderia("Haas");
			view.getSeconda().setIconCar(4);
			model.setNscuderia(4);
		}
		if(view.getSeconda().getListaScuderie().getSelectedValue() == "Alpine") {
			model.setScuderia("Alpine");
			view.getSeconda().setIconCar(5);
			model.setNscuderia(5);
		}
		if(view.getSeconda().getListaScuderie().getSelectedValue() == "AlphaTauri") {
			model.setScuderia("AlphaTauri");
			view.getSeconda().setIconCar(6);
			model.setNscuderia(6);
		}
		if(view.getSeconda().getListaScuderie().getSelectedValue() == "Mclaren") {
			model.setScuderia("Mclaren");
			view.getSeconda().setIconCar(7);
			model.setNscuderia(7);
		}
		if(view.getSeconda().getListaScuderie().getSelectedValue() == "Williams") {
			model.setScuderia("Williams");
			view.getSeconda().setIconCar(8);
			model.setNscuderia(8);
		}
		if(view.getSeconda().getListaScuderie().getSelectedValue() == "AstonMartin") {
			model.setScuderia("AstonMartin");
			view.getSeconda().setIconCar(9);
			model.setNscuderia(9);
		}
	}
}
