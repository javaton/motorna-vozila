package vozilo.teretna;

public class Kamion extends TeretnaVozila {


	public Kamion(String marka, Integer brojPutnika, Integer nosivost, Integer zapremina, Double cena) {
		super(marka, brojPutnika, nosivost, zapremina, cena);
		// TODO Auto-generated constructor stub
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
