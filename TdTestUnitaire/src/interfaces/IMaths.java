package interfaces;

import exceptions.MathsException;

public interface IMaths {
	
	int addition(int a , int b);
	int soustraction(int a, int b);
	int multiplication(int a, int b);
	double division(double a, double b) throws MathsException;
	int multiplicationParAddition(int a, int b);
	
}
