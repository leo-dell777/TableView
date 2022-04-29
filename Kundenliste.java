package application;

public class Kundenliste {

	private int kundennummer = 0;
	private String name = "";
	private String vorname = "";
	private String geburtsdatum = "";
	private double betrag = 5000;
	
	
	
	public Kundenliste(int kundennummer, String name, String vorname, String geburtsdatum, double betrag) {
		//super();
		this.kundennummer = kundennummer;
		this.name = name;
		this.vorname = vorname;
		this.geburtsdatum = geburtsdatum;
		this.betrag = betrag;
	}
	
	
	
	//Getter und Setter


	public int getKundennummer() {
		return kundennummer;
	}



	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getVorname() {
		return vorname;
	}



	public void setVorname(String vorname) {
		this.vorname = vorname;
	}



	public String getGeburtsdatum() {
		return geburtsdatum;
	}



	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}



	public double getBetrag() {
		return betrag;
	}



	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}
	
	
	
	
	
	
	
}
