package tests.mathematique;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import exceptions.MathsException;
import mathematique.Maths;
import interfaces.IMaths;


public class MathsTest {
	private IMaths maths;
	
	@Before
	public void setUp(){
		this.maths = new Maths();
	}
	
	//-----------------
	// TESTS ADDITION
	//-----------------
	
	@Test
	public void testAdditionCasGeneralNombrePositif() {
		Assert.assertEquals(maths.addition(2, 3), 5);
	}
	
	@Test
	public void testAdditionCasNombresNegatif() {
		Assert.assertEquals(maths.addition(2, -5), -3);
	}
	
	@Test
	public void testAdditionCasDeuxNombreNull() {
		Assert.assertEquals(maths.addition(0, 0), 0 );
	}
	
	//-----------------
	// TESTS DIVISION
	//-----------------
	
	@Test(expected = MathsException.class)
	public void testDivisionParZero() {
		try {
			maths.division(4, 0);
		}catch(MathsException e) {
			Assert.assertEquals(e.getMessage(), "Division par zero impossible!");
			throw e;
		}
	}
	
}
