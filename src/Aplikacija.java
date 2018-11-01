import util.Formater;
import vozilo.KategorijaZaUpravljanje;
import vozilo.MotornoVozilo;
import vozilo.putnicko.*;
import vozilo.teretna.Kamion;
import vozilo.teretna.TeretnaVozila;

public class Aplikacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MotornoVozilo vozilo = new MotornoVozilo("FIAT", 2);
		
		MotornoVozilo punto = new PutnickoVozilo("FIAT", 4, true, 3, 150D);
//		punto = null; //Stavljeno zbod demostracije greske null pointer exception
		punto.stampajInformacije();
		
		
		MotornoVozilo fap = new Kamion("FAP", 3, 2000, 2000, 100D);
		fap.stampajInformacije();
		
		KategorijaZaUpravljanje ka = new PutnickoVozilo("FORD", 3, false, 3, 550D);
		System.out.println(ka.starsnoOgranicenje());
		
		Kamion k = new Kamion("FAP", 2, 200, 200, 10D);
		k.stampajInformacije();
		TeretnaVozila tv = k;
		tv.stampajInformacije();
		MotornoVozilo mv = k;
		mv.stampajInformacije();
		KategorijaZaUpravljanje kzv = k;
		System.out.println(kzv.minPotrebnaKategorija() 
				+ " " + kzv.starsnoOgranicenje() );
		
		PutnickoVozilo yugo = new PutnickoVozilo("zastava", 4, false, 3, 500D);
		System.out.println(yugo.minPotrebnaKategorija());
		
//		Primer kada importujemo klasu sa celom putanjim do nje
//		Ovo neradi kad se odkomentarise
//		util.Kamion k = new util.Kamion();
		
		
//	//Pronalazenje greske null 
//		System.out.println("Ocekujem DA dobijam " + Formater.format(true) );
//		System.out.println("Ocekujem NE dobijam " + Formater.format(false) );
//		System.out.println("Ocekujem NE dobijam " + Formater.format(null) );

	}

}
