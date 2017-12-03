
public class Pacjent {
	private String imie;
	private String nazwisko;
	private KartaPacjenta kartaPacjenta;
	private String login;
	private String haslo;
	private String numerTelefonu;
	
	public Pacjent(String imie, String nazwisko, String numerTelefonu) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.kartaPacjenta = new KartaPacjenta();
		this.login = imie.toLowerCase() + "." + nazwisko.toLowerCase();
		this.haslo = "Hasl0123";
		this.numerTelefonu = numerTelefonu;
	}
	
	public String getNumerTelefonu() {
		return numerTelefonu;
	}

	public void setNumerTelefonu(String numerTelefonu) {
		this.numerTelefonu = numerTelefonu;
	}

	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public KartaPacjenta getKartaPacjenta() {
		return kartaPacjenta;
	}
	public void setKartaPacjenta(KartaPacjenta kartaPacjenta) {
		this.kartaPacjenta = kartaPacjenta;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getHaslo() {
		return haslo;
	}
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
	
	public void zarezerwujWizyte(Wizyta wizyta) {
		this.getKartaPacjenta().dodajWizyte(wizyta);
	}
	
	public void anulujWizyte(Wizyta wizyta) {
		this.getKartaPacjenta().anulujWizyte(wizyta);
	}
	
	public Wizyta pokazWszystkieUmowioneWizyty() {
		Wizyta w1 = null;
		for(Wizyta w : this.getKartaPacjenta().getWizyty()) {
			w1 = w;
		}
		return w1;
	}
	
	
	
	
	
	
	
}
