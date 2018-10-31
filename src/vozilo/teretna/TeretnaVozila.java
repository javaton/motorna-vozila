package vozilo.teretna;

import vozilo.MotornoVozilo;

public class TeretnaVozila extends MotornoVozilo {

	private Integer nosivost;
	private Integer zapremina;
	
	public TeretnaVozila(String marka, Integer brojPutnika, Integer nosivost, Integer zapremina, Double cena) {
		super(marka, brojPutnika, cena);
		this.nosivost = nosivost;
		this.zapremina = zapremina;
	}
	
	@Override
	public void stampajInformacije() {
		// TODO Auto-generated method stub
		super.stampajInformacije();
		System.out.println("Teretno vozilo ima nosivost " + nosivost);
	}
	public Integer getNosivost() {
		return nosivost;
	}
	public void setNosivost(Integer nosivost) {
		this.nosivost = nosivost;
	}
	public Integer getZapremina() {
		return zapremina;
	}
	public void setZapremina(Integer zapremina) {
		this.zapremina = zapremina;
	}
@Override
public Double prodajnaCena() {
	return getCena();
}
	
	
}
