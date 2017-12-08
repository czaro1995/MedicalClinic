import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class PacjentTest {
	Pacjent pacjent = new Pacjent();
	
	@Test
	public void testSetNumerTelefonu() {
		Assert.assertTrue(pacjent.setNumerTelefonu("500500500"));
		Assert.assertFalse(pacjent.setNumerTelefonu("5a5500500"));
		Assert.assertFalse(pacjent.setNumerTelefonu("50050050"));
		Assert.assertFalse(pacjent.setNumerTelefonu("5005005005"));
	}

	@Test
	public void testSetImie() {
		Assert.assertFalse(pacjent.setImie("adrian"));
		Assert.assertFalse(pacjent.setImie("Adri4n"));
		Assert.assertFalse(pacjent.setImie("Ad"));
		Assert.assertFalse(pacjent.setImie("Adriaaaaaaaaaaaaaaaaaaaaaan"));
		Assert.assertTrue(pacjent.setImie("Adrian"));
	}
	@Test
	public void testSetNazwisko() {
		Assert.assertTrue(pacjent.setNazwisko("Staszewski"));
		Assert.assertFalse(pacjent.setNazwisko("st"));
		Assert.assertFalse(pacjent.setNazwisko("Staszewskiiiiiiiiiiiiiiiiiii"));
		Assert.assertFalse(pacjent.setNazwisko("St4szewski"));
		Assert.assertFalse(pacjent.setNazwisko("staszewski"));
	}
	@Test
	public void testSetHaslo() {
		Assert.assertFalse(pacjent.setHaslo("Staszewski1!  "));
                Assert.assertFalse(pacjent.setHaslo("Staszewski"));
                Assert.assertFalse(pacjent.setHaslo("Staszewski1"));
                Assert.assertFalse(pacjent.setHaslo("staszewski1@"));
                Assert.assertFalse(pacjent.setHaslo("STASZEWSKI1%"));
                Assert.assertFalse(pacjent.setHaslo("STA!"));
                Assert.assertTrue(pacjent.setHaslo("sTASZEWSKI1$"));
                Assert.assertTrue(pacjent.setHaslo("Staszewski1*"));
	}
	
	@Test
	public void testGetWizyta() {
		Wizyta w2 = null;
		Wizyta w3 = null;
		Wizyta wizyta = new Wizyta();
		Wizyta wizyta2 = new Wizyta();
		Wizyta wizyta3 = new Wizyta();
		pacjent.zarezerwujWizyte(wizyta);
		pacjent.zarezerwujWizyte(wizyta2);
		for(Wizyta w : pacjent.getKartaPacjenta().getWizyty()) {
			if(w == wizyta) {
				w2 = w;
			}
			if(w == wizyta2) {
				w3 = w;
			}
		}
		Assert.assertTrue(w2 == wizyta);
		Assert.assertTrue(w3 == wizyta2);
		Assert.assertFalse(w2 == wizyta3);
	}

}
