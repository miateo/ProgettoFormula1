package view;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImgLibrary {
	private HashMap<String, ImageIcon> library;
	
	public ImgLibrary() {
		try {
			library = new HashMap();
			library.put("albon",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Albon.png"))));
			library.put("latifi",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Latifi.png"))));
			library.put("sainz",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Sainz.png"))));
			library.put("leclerc",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Leclerc.png"))));
			library.put("alonso",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Alonso.png"))));
			library.put("ocon",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Ocon.png"))));
			library.put("gasly",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Gasly.png"))));
			library.put("tsunoda",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Tsunoda.png"))));
			library.put("verstappen",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Verstappen.png"))));
			library.put("perez",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Perez.png"))));
			library.put("russel",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Russel.png"))));
			library.put("hamilton",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Hamilton.png"))));
			library.put("zhou",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Zhou.png"))));
			library.put("bottas",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Bottas.png"))));
			library.put("magnussen",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Magnussen.png"))));
			library.put("schumacher",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Schumacher.png"))));
			library.put("norris",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Norris.png"))));
			library.put("riciardo",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Riciardo.png"))));
			library.put("stroll",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Stroll.png"))));
			library.put("vettel",new ImageIcon(ImageIO.read(new File("assets/imgPiloti/Vettel.png"))));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("img not found.");
		}
	}
	
	public ImageIcon getImg(String nome)
	{
		return library.get(nome);
	}
}
