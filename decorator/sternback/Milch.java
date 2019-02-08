package headfirst.decorator.sternback;

public class Milch extends ZutatDekorierer {
	Getraenk getr�nk;

	public Milch(Getraenk getr�nk) {
		this.getr�nk = getr�nk;
	}

	public String getBeschreibung() {
		return getr�nk.getBeschreibung() + ", Milch";
	}

	public double preis() {
		return .10 + getr�nk.preis();
	}
}
