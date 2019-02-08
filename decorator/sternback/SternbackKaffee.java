package headfirst.decorator.sternback;

public class SternbackKaffee {
 
	public static void main(String args[]) {
		Getraenk getr�nk = new Espresso();
		System.out.println(getr�nk.getBeschreibung() 
				+ " " + getr�nk.preis() + " �");
 
		Getraenk getr�nk2 = new DunkleRoestung();
		getr�nk2 = new Schoko(getr�nk2);
		getr�nk2 = new Schoko(getr�nk2);
		getr�nk2 = new Milchschaum(getr�nk2);
		System.out.println(getr�nk2.getBeschreibung() 
				+ " " + getr�nk2.preis() + " �");
 
		Getraenk getr�nk3 = new HausMischung();
		getr�nk3 = new Soja(getr�nk3);
		getr�nk3 = new Schoko(getr�nk3);
		getr�nk3 = new Milchschaum(getr�nk3);
		System.out.println(getr�nk3.getBeschreibung() 
				+ " " + getr�nk3.preis() + " �");
	}
}
