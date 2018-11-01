package vozilo.teretna;

import java.time.LocalDate;

public class Kamion extends TeretnaVozila {


	public Kamion(String marka, Integer brojPutnika, Integer nosivost, Integer zapremina, Double cena, LocalDate datumRegistracije) {
		super(marka, brojPutnika, nosivost, zapremina, cena, datumRegistracije);
	}

	@Override
	public void stampajInformacije() {
		// TODO Auto-generated method stub
		super.stampajInformacije();
//		System.out.println("Kamion ima nosivost " + getNosivost());
	}

	@Override
	public Double prodajnaCena() {
		return super.prodajnaCena() * 1.2;
	}
}
