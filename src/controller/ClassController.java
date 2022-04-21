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
		}
		
		if(e.getSource() == view.getTerza().getBtnAdvance())
		{
			view.launchWindowsFour();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		System.out.println("entratot");
		if(e.getSource() == view.getSeconda().getListaScuderie().getModel().getElementAt(0)) {
			view.getSeconda().setIconCar(0);
			System.out.println("ferari");
		}
		if(e.getSource() == view.getSeconda().getListaScuderie().getModel().getElementAt(1)) {
			view.getSeconda().setIconCar(1);
		}
		if(e.getSource() == view.getSeconda().getListaScuderie().getModel().getElementAt(2)) {
			view.getSeconda().setIconCar(2);
		}
		if(e.getSource() == view.getSeconda().getListaScuderie().getModel().getElementAt(3)) {
			view.getSeconda().setIconCar(3);
		}
		if(e.getSource() == view.getSeconda().getListaScuderie().getModel().getElementAt(4)) {
			view.getSeconda().setIconCar(4);
		}
		if(e.getSource() == view.getSeconda().getListaScuderie().getModel().getElementAt(5)) {
			view.getSeconda().setIconCar(5);
		}
		if(e.getSource() == view.getSeconda().getListaScuderie().getModel().getElementAt(6)) {
			view.getSeconda().setIconCar(6);
		}
		if(e.getSource() == view.getSeconda().getListaScuderie().getModel().getElementAt(7)) {
			view.getSeconda().setIconCar(7);
		}
		if(e.getSource() == view.getSeconda().getListaScuderie().getModel().getElementAt(8)) {
			view.getSeconda().setIconCar(8);
		}
		if(e.getSource() == view.getSeconda().getListaScuderie().getModel().getElementAt(9)) {
			view.getSeconda().setIconCar(9);
		}
	}
}
