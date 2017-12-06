import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
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
		Assert.assertTrue(pacjent.setHaslo("Staszewski1"));
		Assert.assertFalse(pacjent.setHaslo("st"));
		Assert.assertFalse(pacjent.setHaslo("staszewski1"));
		Assert.assertFalse(pacjent.setHaslo("STASZEWSKI"));
	}

}
