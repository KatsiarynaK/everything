import java.util.Date;

public class BankSystem {

	public static void main(String[] args) {
		Adresse inf2Addr = new Adresse("Martensstr.", "3", 91058, "Erlangen");
		Adresse mensaSuedAddr = new Adresse("Erwin-Rommel-Str", "60", 91058, "Erlangen");
		System.out.println(inf2Addr.toString());
		System.out.println(mensaSuedAddr.toString());
		System.out.println("------------");
		Kontoinhaber inf2 = new Kontoinhaber("Prof. Philippsen", "Michael", new Date(System.currentTimeMillis()), inf2Addr);
		System.out.println(inf2);
		Bankkonto meins = new Bankkonto(inf2, "BKA", 200.0, 0.00);
		System.out.println(meins);
		System.out.println(meins.getKontoinhaber().getAdresse());
		Kontoinhaber meinsKI = meins.getKontoinhaber();
		System.out.println(meinsKI.getAdresse());

		Kontoinhaber du = new Kontoinhaber("Musterfrau", "Erika", new Date(System.currentTimeMillis()), mensaSuedAddr);
		Bankkonto deins = new Bankkonto(du, "Spartstrumpf", 10.0, 0.00);

		System.out.println("------------");
		System.out.println(meins);
		System.out.println(deins);
		Transaktion t = new Transaktion(meins, deins, 50);
		System.out.println(t);

		System.out.println("------------");
		Bankkonto einanderes = new Bankkonto("Dein", "Name", null, mensaSuedAddr, "Foo", 4711, 0);
		System.out.println(einanderes);

		System.out.println("------------");
		Person p = new Kontoinhaber("A", "B", null, inf2Addr);
		System.out.println(p.gibMirName());
		p = new Mitarbeiter("X", "Y");
		System.out.println(p.gibMirName());

		System.out.println("------------");
		Person[] personen = { du, p, inf2 };
		for (int i = 0; i < personen.length; i++) {
			System.out.println(personen[i].gibMirName());
		}
		for (int i = 0; i < personen.length; i++) {
			personen[i].heirate("Panem" + i);
		}
		System.out.println("------------");
		for (int i = 0; i < personen.length; i++) {
			System.out.println(personen[i].gibMirName());
		}
	}
}
