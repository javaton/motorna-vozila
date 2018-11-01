package vozilo;

import java.time.LocalDate;

public abstract class MotornoVozilo implements KategorijaZaUpravljanje, Registracija {

	private String marka;
	private Integer brojPutnika;
	private Double cena;
	private LocalDate datumRegistracije;
	
	public MotornoVozilo(String marka, Integer brojPutnika, Double cena, LocalDate datumRegistracije) {
		super();
		this.marka = marka;
		this.brojPutnika = brojPutnika;
		this.cena = cena;
		this.datumRegistracije = datumRegistracije;
	}
	
	public abstract Double prodajnaCena();
	
	public void stampajInformacije() {
		System.out.println("Marka vozila je " + getMarka()
						+ ", broj putnika je " + brojPutnika
						+ ", prodajna cena je " + prodajnaCena()
						+ ", datum registracije " + datumRegistracije);
	}
	
	@Override
	public LocalDate datumRegistracije() {
		return getDatumRegistracije();
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

	public Double getCena() {
		return cena;
	}

	public void setCena(Double cena) {
		this.cena = cena;
	}

	public LocalDate getDatumRegistracije() {
		return datumRegistracije;
	}

	public void setDatumRegistracije(LocalDate datumRegistracije) {
		this.datumRegistracije = datumRegistracije;
	}
		
	
	
}
