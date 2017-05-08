import java.util.Date;

public class Bankkonto {
	private Kontoinhaber kontoinhaber;
	private String iban;
	private double guthaben;
	private double dispo;

	public Bankkonto(Kontoinhaber kontoinhaber, String iban, double guthaben, double dispo) {
		this.kontoinhaber = kontoinhaber;
		this.iban = iban;
		this.guthaben = guthaben;
		this.dispo = dispo;
	}

	public Bankkonto(String name, String vorname, Date gebDatum, Adresse adresse, String iban, double guthaben, double dispo) {
		this.kontoinhaber = new Kontoinhaber(name, vorname, gebDatum, adresse);
		this.iban = iban;
		this.guthaben = guthaben;
		this.dispo = dispo;
	}

	public Kontoinhaber getKontoinhaber() {
		return kontoinhaber;
	}

	public void ueberweise(double wieviel, Bankkonto wohin) {
		this.guthaben = this.guthaben - wieviel;
		wohin.guthaben = wohin.guthaben + wieviel;
	}

	@Override
	public String toString() {
		String s = kontoinhaber + "\n";
		s += "IBAN: " + iban + "\n";
		s += "Guthaben: " + guthaben + "\n";
		s += "Dispo: " + dispo + "\n";
		return s;
	}
}
