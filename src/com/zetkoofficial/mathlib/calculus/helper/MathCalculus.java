package com.zetkoofficial.mathlib.calculus.helper;

import com.zetkoofficial.mathlib.function.IFunction;

public class MathCalculus {
	public static double mathDerivative(IFunction function, double x, double stepSize) {
		double f1 = function.run(x + stepSize);
		double f2 = function.run(x);
		
		double res = (f1 - f2) / stepSize;
		
		return res;
	}
	
	public static double mathDerivative(IFunction function, double x) {
		return mathDerivative(function, x, 0.0001);
	}
	
	public static double mathIntegral(IFunction function, double a, double b, int rectNumber) {
		double range = b - a;	
		double stepSize = range / rectNumber;
		
		double res = 0;
		
		for(int i = 0; i < rectNumber; i++) {
			res += function.run(stepSize * i + a) * stepSize;
		}
		
		return res;
	}
	
	public static double mathIntegral(IFunction function, double a, double b) {
		return mathIntegral(function, a, b, 10000);
	}
}
