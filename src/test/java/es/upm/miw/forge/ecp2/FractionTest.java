package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	
	private Fraction fraction;
	
	@Before
	public void before() {
		this.fraction = new Fraction (8,4);
	}

    @Test
    public void testGetNumerator() {
        assertEquals(8,fraction.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(4,fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(2,fraction.decimal(),2);
    }
    
    @Test
	public void testIsProperFraction () {
    	Fraction f = new Fraction (2,7);
	    assertEquals(true, f.isProperFraction());
	}
	

}