package model;

public class ClassModel {
	
	private String scuderia;
	private int nscuderia;
	private String pilota;

	public ClassModel() {
		scuderia = "Ferrari";
		nscuderia = 0;
	}
	
	public int getNscuderia() {
		return nscuderia;
	}

	public void setNscuderia(int nscuderia) {
		this.nscuderia = nscuderia;
	}

	public String getScuderia() {
		return scuderia;
	}

	public void setScuderia(String scuderia) {
		this.scuderia = scuderia;
	}

	public String getPilota() {
		return pilota;
	}

	public void setPilota(String pilota) {
		this.pilota = pilota;
	}

}
