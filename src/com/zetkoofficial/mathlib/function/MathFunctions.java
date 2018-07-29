package com.zetkoofficial.mathlib.function;

public class MathFunctions {
	public static double mathSigmoid(double value) {
		return 1d / (1 + Math.exp(-value));
	}
	
	public static double mathSigmoidPrime(double value) {
		return mathSigmoid(value) * (1 - mathSigmoid(value));
	}
}
