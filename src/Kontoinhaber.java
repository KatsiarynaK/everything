import java.util.Date;

public class Kontoinhaber extends Person {
	private Date gebDatum;
	private Adresse adresse;

	public Adresse getAdresse() {
		return adresse;
	}

	public void heiratet(String neuerName) {
		this.name = neuerName;
	}

	public Kontoinhaber(String name, String vorname, Date gebDatum, Adresse adresse) {
		this.name = name;
		this.vorname = vorname;
		this.gebDatum = gebDatum;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Kontoinhaber: " + vorname + " " + name + "\n\t" + gebDatum + "\n" + adresse;
	}
}