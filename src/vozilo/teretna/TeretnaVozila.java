package vozilo.teretna;

import java.time.LocalDate;

import vozilo.MotornoVozilo;

public class TeretnaVozila extends MotornoVozilo {

	private Integer nosivost;
	private Integer zapremina;
	
	public TeretnaVozila(String marka, Integer brojPutnika, Integer nosivost, Integer zapremina, Double cena, LocalDate datumRegistracije) {
		super(marka, brojPutnika, cena, datumRegistracije);
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

@Override
public String minPotrebnaKategorija() {
	return new String("C"); //ILI return "C";
}

@Override
public Boolean starsnoOgranicenje() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Integer brojDanaDoIstekaRegistracije() {
	return (getDatumRegistracije().plusMonths(6).getDayOfYear() - LocalDate.now().getDayOfYear())/2;
}
	
	
}
