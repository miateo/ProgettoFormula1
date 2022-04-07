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
	private ImageIcon schumacher;
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
			latifi = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Latifi.png")));
			sainz = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Sainz.png")));
			leclerc = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Leclerc.png")));
			vettel = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Vettel.png")));
			stroll = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Stroll.png")));
			riciardo = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Riciardo.png")));
			norris = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Norris.png")));
			magnussen = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Magnussen.png")));
			schumacher = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Schumacher.png")));
			ocon = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Ocon.png")));
			alonso = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Alonso.png")));
			zhou = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Zhou.png")));
			bottas = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Bottas.png")));
			russel = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Russel.png")));
			hamilton = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Hamilton.png")));
			verstappen = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Verstappen.png")));
			perez = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Perez.png")));
			tsunoda = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Tsunoda.png")));
			gasly = new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Gasly.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("img not found.");
		}

	}


	public ImageIcon getAlbon() {
		return albon;
	}


	public ImageIcon getLatifi() {
		return latifi;
	}


	public ImageIcon getSainz() {
		return sainz;
	}


	public ImageIcon getLeclerc() {
		return leclerc;
	}


	public ImageIcon getVettel() {
		return vettel;
	}


	public ImageIcon getStroll() {
		return stroll;
	}


	public ImageIcon getRiciardo() {
		return riciardo;
	}


	public ImageIcon getNorris() {
		return norris;
	}


	public ImageIcon getMagnussen() {
		return magnussen;
	}


	public ImageIcon getSchumuacher() {
		return schumacher;
	}


	public ImageIcon getOcon() {
		return ocon;
	}


	public ImageIcon getAlonso() {
		return alonso;
	}


	public ImageIcon getZhou() {
		return zhou;
	}


	public ImageIcon getBottas() {
		return bottas;
	}


	public ImageIcon getRussel() {
		return russel;
	}


	public ImageIcon getHamilton() {
		return hamilton;
	}


	public ImageIcon getVerstappen() {
		return verstappen;
	}


	public ImageIcon getPerez() {
		return perez;
	}


	public ImageIcon getTsunoda() {
		return tsunoda;
	}


	public ImageIcon getGasly() {
		return gasly;
	}
	
}
