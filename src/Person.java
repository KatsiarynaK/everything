
public class Person {
	protected String name;
	protected String vorname;

	String gibMirName() {
		return name;
	}
	public void heirate(String neuerName) {
		this.name = neuerName;
	}
}
