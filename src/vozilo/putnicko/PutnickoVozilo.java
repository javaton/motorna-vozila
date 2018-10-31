package vozilo.putnicko;

import util.Formater;
import vozilo.MotornoVozilo;

public class PutnickoVozilo extends MotornoVozilo{

	private Boolean kabriolet;
	private Integer brojVrata;
	
	public PutnickoVozilo(String marka, Integer brojPutnika, Boolean kabriolet, Integer brojVrata) {
		super(marka, brojPutnika);
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
	
	

}
