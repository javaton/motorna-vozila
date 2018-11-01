package vozilo.putnicko;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import util.Formater;
import vozilo.MotornoVozilo;

public class PutnickoVozilo extends MotornoVozilo{

	private Boolean kabriolet;
	private Integer brojVrata;
	
	public PutnickoVozilo(String marka, Integer brojPutnika, Boolean kabriolet, Integer brojVrata, Double cena, LocalDate datumRegistracije) {
		super(marka, brojPutnika, cena, datumRegistracije);
		this.kabriolet = kabriolet;
		this.brojVrata = brojVrata;
	}

	@Override
	public void stampajInformacije() {
		// TODO Auto-generated method stub
		super.stampajInformacije();
		System.out.println("Tip vozila je putnicko, kabriolet " 
						+ Formater.format(getKabriolet()) + ", broj vrata " 
							+ getBrojVrata());
	}
	
	public Boolean getKabriolet() {
		return kabriolet;
	}

	public void setKabriolet(Boolean kabriolet) {
		this.kabriolet = kabriolet;
	}

	public Integer getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(Integer brojVrata) {
		this.brojVrata = brojVrata;
	}

	@Override
	public Double prodajnaCena() {
		// TODO Auto-generated method stub
		return getCena()  * 2;
	}

	@Override
	public String minPotrebnaKategorija() {
		return KategorijaVozackeDozvole.B.toString();
	}

	@Override
	public Boolean starsnoOgranicenje() {
		return true;
	}

	@Override
	public Integer brojDanaDoIstekaRegistracije() {
	    LocalDate istekReg = getDatumRegistracije().plusYears(1);
	    Long razlika = ChronoUnit.DAYS.between(LocalDate.now(), istekReg);
	    return razlika.intValue();
	}
	
	

}
