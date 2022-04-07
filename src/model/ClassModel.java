package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ClassModel {
	private ImageIcon albon;
	private ImageIcon latifi;
	private ImageIcon sainz;
	private ImageIcon leclerc;
	private ImageIcon vettel;
	private ImageIcon stroll;
	private ImageIcon riciardo;
	private ImageIcon norris;
	private ImageIcon magnussen;
	private ImageIcon schumuacher;
	private ImageIcon ocon;
	private ImageIcon alonso;
	private ImageIcon zhou;
	private ImageIcon bottas;
	private ImageIcon russel;
	private ImageIcon hamilton;
	private ImageIcon verstappen;
	private ImageIcon perez;
	private ImageIcon tsunoda;
	private ImageIcon gasly;
	
	
	public ClassModel() {
		try {
			albon = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Albon.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("img not found.");
		}

	}
}
