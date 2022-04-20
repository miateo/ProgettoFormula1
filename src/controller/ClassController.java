package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ClassModel;
import view.ClassView;
import view.windowTwo;

public class ClassController implements ActionListener{
	private ClassModel model;
	private ClassView view;
	
	public ClassController(ClassModel model, ClassView view) {
		this.model = model;
		this.view = view;
		view.setAscoltatore(this);
		view.getSeconda().setAscoltatoreW2(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == view.getBtnStartGame()) {
			view.getBtnStartGame().setVisible(false);
			/*view.getProgressBar().setVisible(true);
			view.getC().start();*/
			view.launchWindowstwo();
			//view.launchNextWindow(, null);
		}
		if(e.getSource() == view.getSeconda().getBtnAdvance())
		{
			view.launchWindowsthree();
		}
	}
}
