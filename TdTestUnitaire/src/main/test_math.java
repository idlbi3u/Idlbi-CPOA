package main;


import interfaces.IMaths;
import mathematique.Maths;
public class test_math {

	public static void main(String[] args){
		IMaths maths = new Maths();
		System.out.println("Multiplication : 4 × 5 = "+maths.multiplicationParAddition(4, 5));
	}

}
