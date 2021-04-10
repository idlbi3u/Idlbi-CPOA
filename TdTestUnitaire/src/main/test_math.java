package main;

import interfaces.IMaths;
import mathematique.Maths;
import tests.mathematique.MathsTest;
public class test_math {

	public static void main(String[] args) {
		IMaths maths = new Maths();
		System.out.println("Addition : 2 + 3 = "+maths.addition(2, 3));
	}

}
