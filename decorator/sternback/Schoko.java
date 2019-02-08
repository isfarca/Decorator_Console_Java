package headfirst.decorator.sternback;

public class Schoko extends ZutatDekorierer {
	Getraenk getr�nk;
 
	public Schoko(Getraenk getr�nk) {
		this.getr�nk = getr�nk;
	}
 
	public String getBeschreibung() {
		return getr�nk.getBeschreibung() + ", Schoko";
	}
 
	public double preis() {
		return .20 + getr�nk.preis();
	}
}
