package model;

public class ClassModel {
	
	private String scuderia;
	private int nscuderia;
	private String pilota;
	private String classifica[];

	public ClassModel() {
		scuderia = "Ferrari";
		nscuderia = 0;
		setClassifica(new String[20]);
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

	public void setClassifica(String classifica[]) {
		this.classifica = classifica;
	}
	
	
	public String[] getClassifica() {
		return classifica;
	}
}
