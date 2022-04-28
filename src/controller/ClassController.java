package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			/*view.getProgressBar().setVisible(true);
			view.getC().start();*/
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
