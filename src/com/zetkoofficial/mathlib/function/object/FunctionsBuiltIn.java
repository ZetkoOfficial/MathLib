package com.zetkoofficial.mathlib.function.object;

/**
 * This class holds the IFunction of all built-in one value functions.
 * @author ZetkoOfficial
 *
 */
public class FunctionsBuiltIn {

	public static final IFunction FUNCTION_SIGMOID = new FunctionsBuiltIn.FunctionSigmoid();
	public static final IFunction FUNCTION_SIGMOID_PRIME = new FunctionsBuiltIn.FunctionSigmoidPrime();
	
	public static class FunctionSigmoid implements IFunction{
		
		@Override
		public double run(double value) {
			return 1d / (1 + Math.exp(-value));
		}
	}
	
	public static class FunctionSigmoidPrime implements IFunction{
		
		FunctionsBuiltIn.FunctionSigmoid fs = new FunctionSigmoid();
		
		@Override
		public double run(double value) {
			return fs.run(value) * (1 - fs.run(value));
		}
	}
	
	
}
