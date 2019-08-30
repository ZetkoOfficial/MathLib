package com.zetkoofficial.mathlib.function.helper;

import static com.zetkoofficial.mathlib.function.object.FunctionsBuiltIn.*;

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
		return FUNCTION_SIGMOID.apply(value);
	}
	
	/**
	 * This will do the sigmoid prime operation on the value.
	 * @param value The input
	 * @return The sigmoid prime of the value
	 */
	public static double mathSigmoidPrime(double value) {
		return FUNCTION_SIGMOID_PRIME.apply(value);
	}
}
