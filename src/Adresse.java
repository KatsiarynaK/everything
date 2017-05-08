public class Adresse {
	private String strasse;
	private String hausnr;
	private int plz;
	private String ort;

	public Adresse(String strasse, String hausnr, int plz, String ort) {
		this.strasse = strasse;
		this.hausnr = hausnr;
		this.plz = plz;
		this.ort = ort;
		// comment
	}

	
	@Override
	public String toString() {
		return "Adresse:\n\t" + this.strasse + " " + hausnr + "\n\t" + plz + " " + ort;
	}
}
