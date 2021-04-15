package main;

import exceptions.MathsException;
import interfaces.IMaths;
import mathematique.Maths;
import tests.mathematique.MathsTest;
public class test_math {

	public static void main(String[] args) throws MathsException {
		IMaths maths = new Maths();
		IMaths maths1 = new Maths();
		System.out.println("Multiplication : 4 × 5 = "+maths.multiplicationParAddition(4, 5));
	}

}
