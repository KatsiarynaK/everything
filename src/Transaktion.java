public class Transaktion {
	public Transaktion(Bankkonto von, Bankkonto zu, double betrag) {
		super();
		this.von = von;
		this.zu = zu;
		this.betrag = betrag;
		von.ueberweise(betrag, zu);
	}

	private Bankkonto von;
	private Bankkonto zu;
	private double betrag;

	@Override
	public String toString() {
		return "TRANSAKTION: Ueberweisung in Hoehe von " + betrag + " von \n" + von + "zu\n" + zu;
	}
}
