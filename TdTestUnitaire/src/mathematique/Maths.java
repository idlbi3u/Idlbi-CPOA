package mathematique;

import exceptions.MathsException;
import interfaces.IMaths;

public class Maths implements IMaths {

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int soustraction(int a, int b) {
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		// Ecrire en écrivant que des multiplication en utilisant que des additions
		// Tester tous les cas possibles(positif, négatif).
		return a*b;
	}

	@Override
	public double division(double a, double b) throws MathsException {
		if (b == 0) {
			throw new MathsException("Division par zero impossible");
		}
		try {
			return a/b;
		}catch(Exception e) {
			throw new MathsException(e.getMessage());
			
		}
	}

}
