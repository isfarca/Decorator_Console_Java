package headfirst.decorator.sternback;
 
public class Milchschaum extends ZutatDekorierer {
	Getraenk getr�nk;
 
	public Milchschaum(Getraenk getr�nk) {
		this.getr�nk = getr�nk;
	}
 
	public String getBeschreibung() {
		return getr�nk.getBeschreibung() + ", Milchschaum";
	}
 
	public double preis() {
		return .10 + getr�nk.preis();
	}
}
