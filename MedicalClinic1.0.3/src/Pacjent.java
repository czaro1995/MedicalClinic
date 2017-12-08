import java.util.regex.Pattern;

public class Pacjent {
	private String imie;
	private String nazwisko;
	private KartaPacjenta kartaPacjenta;
	private String login;
	private String haslo;
	private String numerTelefonu;
	private Pattern patternImie = Pattern.compile("[A-Z][a-z]{2,9}+");
	private Pattern patternNazwisko = Pattern.compile("[A-Z][a-z]{2,14}+");
        private Pattern patternHaslo = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+\\-\\=])(?=.*[A-Z])(?!.*\\s).{8,}$");
	private Pattern patternNumerTelefonu = Pattern.compile("[0-9]{9,9}");
	
	public Pacjent() {
		this.kartaPacjenta = new KartaPacjenta();
	}
	
	public String getNumerTelefonu() {
		return numerTelefonu;
	}

	public boolean setNumerTelefonu(String numerTelefonu) {
		boolean check = false;
		if(patternNumerTelefonu.matcher(numerTelefonu).matches()) {
			this.numerTelefonu = numerTelefonu;
			check = true;
		}
		return check;
	}

	public String getImie() {
		return imie;
	}
	public boolean setImie(String imie) {
		boolean check = false;
		if(patternImie.matcher(imie).matches()) {
			this.imie = imie;
			check = true;
		}
		return check;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public boolean setNazwisko(String nazwisko) {
		boolean check = false;
		if(patternNazwisko.matcher(nazwisko).matches()) {
			this.nazwisko = nazwisko;
			check = true;
		}
		return check;
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
	public void setLogin() {
		if(imie != null || nazwisko != null) {
			this.login = imie.toLowerCase() + "." + nazwisko.toLowerCase();
		} else {
			System.out.println("imie lub nazwisko nie jest uzupelnione");
		}
		
	}
	public String getHaslo() {
		return haslo;
	}
	public boolean setHaslo(String haslo) {
		boolean check = false;
		if(patternHaslo.matcher(haslo).matches()) {
			this.haslo = haslo;
			check = true;
		}
		return check;
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
