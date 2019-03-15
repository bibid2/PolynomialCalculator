package Test;

import static org.junit.Assert.assertEquals;
import Pol.*;
import org.junit.Test;
public class TestOperatii {
	
	@Test
	public void testAdunare() {
		Operatii op = new Operatii();
		Polinom p1 = new Polinom("3x^3 + x");
		Polinom p2 = new Polinom("2x^2 + 4x^3");
		Polinom suma = op.adunare(p1, p2);

		assertEquals("1.0x + 2.0x^2 + 7.0x^3", suma.toString());
	}
	
	@Test
	public void testScadere() {
		Operatii op = new Operatii();
		Polinom p1 = new Polinom("3x^3 + x");
		Polinom p2 = new Polinom("2x^2 + 4x^3");
		Polinom diferenta = op.scadere(p1, p2);

		assertEquals("1.0x + -2.0x^2 + -1.0x^3", diferenta.toString());
	}
	
	@Test
	public void testInmultire() {
		Operatii op = new Operatii();
		Polinom p1 = new Polinom("x");
		Polinom p2 = new Polinom("2x^2 + 4x^3");
		Polinom produs = op.inmultire(p1, p2);

		assertEquals("2.0x^3 + 4.0x^4", produs.toString());
	}
	
	@Test
	public void testDerivare() {
		Operatii op = new Operatii();
		Polinom p1 = new Polinom("3x^3 + x");
		Polinom derivata = op.derivare(p1);

		assertEquals("9.0x^2 + 1.0", derivata.toString());
	}
	
	@Test
	public void testIntegrare() {
		Operatii op = new Operatii();
		Polinom p2 = new Polinom("3x^2");
		Polinom integrata = op.integrare(p2);

		assertEquals("1.0x^3", integrata.toString());
	}

}
