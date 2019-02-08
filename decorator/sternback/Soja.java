package headfirst.decorator.sternback;

public class Soja extends ZutatDekorierer {
	Getraenk getr�nk;

	public Soja(Getraenk getr�nk) {
		this.getr�nk = getr�nk;
	}

	public String getBeschreibung() {
		return getr�nk.getBeschreibung() + ", Soja";
	}

	public double preis() {
		return .15 + getr�nk.preis();
	}
}
