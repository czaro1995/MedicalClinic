import java.util.ArrayList;
import java.util.List;

public class KartaPacjenta {
	private String grupaKrwi;
	private List<Wizyta> wizyty;
	private List<Recepta> recepty;
	private List<Skierowanie> skierowania;
	
	public KartaPacjenta() {
		wizyty = new ArrayList();
		recepty = new ArrayList();
		skierowania = new ArrayList();
	}

	public String getGrupaKrwi() {
		return grupaKrwi;
	}

	public void setGrupaKrwi(String grupaKrwi) {
		this.grupaKrwi = grupaKrwi;
	}

	public List<Wizyta> getWizyty() {
		return wizyty;
	}

	public void setWizyty(List<Wizyta> wizyty) {
		this.wizyty = wizyty;
	}

	public List<Recepta> getRecepta() {
		return recepty;
	}

	public void setRecepta(List<Recepta> recepta) {
		this.recepty = recepta;
	}

	public List<Skierowanie> getSkierowania() {
		return skierowania;
	}

	public void setSkierowania(List<Skierowanie> skierowania) {
		this.skierowania = skierowania;
	}
	
	public void dodajWizyte(Wizyta wizyta) {
		wizyty.add(wizyta);
	}
	
	public void anulujWizyte(Wizyta wizyta) {
		wizyty.remove(wizyta);
	}
}
