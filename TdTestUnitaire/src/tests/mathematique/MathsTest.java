package tests.mathematique;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
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
	public void testDivisionParZero() throws MathsException {
		try {
			maths.division(4, 0);
		}catch(MathsException e) {
			Assert.assertEquals(e.getMessage(), "Division par zero impossible");
			throw e;
		}
	}
	
	@Test
	public void testDivisionParUnNegatif() throws MathsException{
			Assert.assertEquals(maths.division(5, -2), -2.5, 0);
		}
	
	@Test 
	public void testDivisionParNombreTresGrand() throws MathsException{
		Assert.assertEquals(maths.division(10, 100000000),0.0000001, 0);
	}
	@Test 
	public void testDivisionParUnNombreReel() throws MathsException{
		Assert.assertEquals(maths.division(10, 0.5),20, 0);
	}
	
	//-----------------
	// TESTS SOUSTRACTION
	//-----------------
	
	@Test 
	public void testSoustractionCasGeneral() {
		Assert.assertEquals(maths.soustraction(5, 2), 3);
	}
	
	@Test
	public void testSoustractionParUnNegatif() {
		Assert.assertEquals(maths.soustraction(5, -2), 7);
	}
	
	@Test
	public void testSoustractionParUnNombrePlusGrand() {
		Assert.assertEquals(maths.soustraction(5, 10), -5);
	}
	
	@Test
	public void testSoustractionParZero() {
		Assert.assertEquals(maths.soustraction(5, 0), 5);
	}
	@Test 
	public void testSoustractionDeZeroParZero() {
		Assert.assertEquals(maths.soustraction(0, 0), 0);
	}
	
	//-----------------
	// TESTS MULTIPLICATION
	//-----------------
	@Test
	public void testMultiplicationCasGeneral() {
		Assert.assertEquals(maths.multiplication(2, 5), 10);
	}
	
	@Test
	public void testMultiplicationParUnNegatif() {
		Assert.assertEquals(maths.multiplication(2,-5), -10);
	}
	
	@Test
	public void testMultiplicationEntreDeuxNombreNegatif() {
		Assert.assertEquals(maths.multiplication(-2, -5), 10);
	}
	
	@Test
	public void testMultiplicationParZero() {
		Assert.assertEquals(maths.multiplication(2, 0), 0);
	}
	
	@Test
	public void testMultiplicationZeroParZero() {
		Assert.assertEquals(maths.multiplication(0, 0), 0);
	}
	
	
	//----------------------------------------
	// TEST MULTIPLICATION (METHODE ADDITION)
	//----------------------------------------
	
	@Test
	public void testMultiplicationCasGeneralAddition() {
		Assert.assertEquals(maths.multiplicationParAddition(2, 3), 6);
	}
	
	@Test
	public void testMultiplicationParUnNegatifAddition() {
		Assert.assertEquals(maths.multiplicationParAddition(2, -3), -6);
	}
	@Test 
	public void testMultiplicationParDeuxNombreNegatif() {
		Assert.assertEquals(maths.multiplicationParAddition(-2, -3),6);
	}
	
	@Test
	public void testMultiplicationParZeroAddition() {
		Assert.assertEquals(maths.multiplicationParAddition(2, 0), 0);
	}
	
	@Test
	public void testMultiplicationZeroParZeroAddition() {
		Assert.assertEquals(maths.multiplicationParAddition(0, 0), 0);
	}
}	
