package headfirst.decorator.sternback;

public class DunkleRoestung extends Getraenk {
	public DunkleRoestung() {
		beschreibung = "Dunkle R�stung";
	}
 
	public double preis() {
		return .99;
	}
}

