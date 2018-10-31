import javax.swing.SingleSelectionModel;

import util.Formater;
import vozilo.MotornoVozilo;
import vozilo.putnicko.PutnickoVozilo;

public class Aplikacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotornoVozilo punto = new PutnickoVozilo("FIAT", 4, true, 3);
//		punto = null; //Stavljeno zbod demostracije greske null pointer exception
		punto.stampajInformacije();
	//Pronalazenje greske null 
		System.out.println("Ocekujem DA dobijam " + Formater.format(true) );
		System.out.println("Ocekujem NE dobijam " + Formater.format(false) );
		System.out.println("Ocekujem NE dobijam " + Formater.format(null) );

	}

}
