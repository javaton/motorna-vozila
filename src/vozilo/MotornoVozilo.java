package vozilo;

public class MotornoVozilo {

	private String marka;
	private Integer brojPutnika;
	
	public MotornoVozilo(String marka, Integer brojPutnika) {
		super();
		this.marka = marka;
		this.brojPutnika = brojPutnika;
	}
	
	public void stampajInformacije() {
		System.out.println("Marka vozila je " + getMarka()
						+ ", broj putnika je " + brojPutnika);
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public Integer getBrojPutnika() {
		return brojPutnika;
	}

	public void setBrojPutnika(Integer brojPutnika) {
		this.brojPutnika = brojPutnika;
	}
	
	
	
	
}
