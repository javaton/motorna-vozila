import util.Formater;
import vozilo.MotornoVozilo;
import vozilo.putnicko.*;
import vozilo.teretna.Kamion;

public class Aplikacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MotornoVozilo vozilo = new MotornoVozilo("FIAT", 2);
		
		MotornoVozilo punto = new PutnickoVozilo("FIAT", 4, true, 3, 150D);
//		punto = null; //Stavljeno zbod demostracije greske null pointer exception
		punto.stampajInformacije();
		
		
		MotornoVozilo fap = new Kamion("FAP", 3, 2000, 2000, 100D);
		fap.stampajInformacije();
	
//		Primer kada importujemo klasu sa celom putanjim do nje
//		Ovo neradi kad se odkomentarise
//		util.Kamion k = new util.Kamion();
		
		
//	//Pronalazenje greske null 
//		System.out.println("Ocekujem DA dobijam " + Formater.format(true) );
//		System.out.println("Ocekujem NE dobijam " + Formater.format(false) );
//		System.out.println("Ocekujem NE dobijam " + Formater.format(null) );

	}

}
