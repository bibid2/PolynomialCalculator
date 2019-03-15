package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Pol.*;

public class TestPolinom {

	//9x + 12x^3 + 3x^8    coef/putere
	Monom m1= new Monom(9,1);
	Monom m2= new Monom(12,3);
	Monom m3= new Monom(3,8);
	Polinom polinomTest= new Polinom();
	
	@Test
	public void TestString()
	{
		polinomTest.addMonom(m1);
		polinomTest.addMonom(m2);
		polinomTest.addMonom(m3);
		assertEquals("9.0x + 12.0x^3 + 3.0x^8", polinomTest.toString());
	}
	
	
}
