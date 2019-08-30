package com.zetkoofficial.mathlib.function.object;

import java.util.function.Function;

/**
 * This class holds the IFunction of all built-in one value functions.
 * @author ZetkoOfficial
 *
 */
public class FunctionsBuiltIn {

	public static final Function<Double, Double> FUNCTION_SIGMOID = a -> 1d/(1 + Math.exp(-a));
	public static final Function<Double, Double> FUNCTION_SIGMOID_PRIME = a -> FUNCTION_SIGMOID.apply(a) * (1 - FUNCTION_SIGMOID.apply(a));
}
