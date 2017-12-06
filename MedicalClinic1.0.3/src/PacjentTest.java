
public class PacjentTest {

	public static void main(String[] args) {
		Pacjent pacjent = new Pacjent();
		
		//test wprowadzenia imienia dla obiektu pacjent
		System.out.println("test ustawienia imienia prawidlowego - Adrian");
		System.out.println(pacjent.setImie("Adrian"));
		System.out.println("test ustawienia imienia z cyfra - Ad3rian");
		System.out.println(pacjent.setImie("Ad3rian"));
		System.out.println("test ustawienia imienia zbyt dlugiego - Adriaaaaaaaaaan");
		System.out.println(pacjent.setImie("Adriaaaaaaaaaan"));
		System.out.println("test ustawienia imienia zbyt krotkiego - Ad");
		System.out.println(pacjent.setImie("Ad"));
		
		//test wprowadzania nazwiska dla obiektu pacjent
		System.out.println("test ustawienia nazwiska prawidlowego - Staszewski");
		System.out.println(pacjent.setNazwisko("Staszewski"));
		System.out.println("test ustawienia nazwiska z cyfra - St4szewski");
		System.out.println(pacjent.setNazwisko("St4szewski"));
		System.out.println("test ustawienia nazwiska zbyt dlugiego - Staszeeeeeeeeeeeeeeeeewski");
		System.out.println(pacjent.setNazwisko("Staszeeeeeeeeeeeeeeeeewski"));
		System.out.println("test ustawienia nazwiska zbyt krotkiego - St");
		System.out.println(pacjent.setNazwisko("St"));
		System.out.println("test ustawienia nazwiska ze znakiem niedozwolonym - Staszewski!");
		System.out.println(pacjent.setNazwisko("Staszewski!"));
		
		//test wprowadzania hasla dla obiektu pacjent
		System.out.println("test ustawienia hasla prawidlowego - Staszewski1");
		System.out.println(pacjent.setHaslo("Staszewski1"));
		System.out.println("test ustawienia hasla bez cyfry - Staszewski");
		System.out.println(pacjent.setHaslo("Staszewski"));
		System.out.println("test ustawienia hasla bez wielkiej litery - staszewski");
		System.out.println(pacjent.setHaslo("staszewski"));
		System.out.println("test ustawienia hasla bez malej litery - STASZEWSKI");
		System.out.println(pacjent.setHaslo("STASZEWSKI"));
		System.out.println("test ustawienia hasla zbyt krotkiego - Adrian1");
		System.out.println(pacjent.setHaslo("Adrian1"));
	}

}
