package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ClassModel;
import view.ClassView;

public class ClassController implements ActionListener{
	private ClassModel model;
	private ClassView view;
	
	public ClassController(ClassModel model, ClassView view) {
		this.model = model;
		this.view = view;
		view.setAscoltatore(this);;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == view.getBtnStartGame()) {
			/*view.getBtnStartGame().setVisible(false);
			view.getProgressBar().setVisible(true);*/
			view.getC().start();
			/*if(view.getProgressBar().getValue() == 100) {
				view.getProgressBar().setVisible(false);
				view.getBtnGoWindowTwo().setVisible(true);
			}*/
		}
	}
}
