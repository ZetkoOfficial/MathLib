package com.zetkoofficial.mathlib.function.helper;

/**
 * This is the helper class for the function package.
 * @author ZetkoOfficial
 *
 */
public class MathFunction {
	/**
	 * This will do the sigmoid operation on the value.
	 * @param value The input
	 * @return The sigmoid of the value
	 */
	public static double mathSigmoid(double value) {
		return 1d / (1 + Math.exp(-value));
	}
	
	/**
	 * This will do the sigmoid prime operation on the value.
	 * @param value The input
	 * @return The sigmoid prime of the value
	 */
	public static double mathSigmoidPrime(double value) {
		return mathSigmoid(value) * (1 - mathSigmoid(value));
	}
}
