package com.zetkoofficial.mathlib.calculus.helper;

import com.zetkoofficial.mathlib.function.object.IFunction;

/**
 * This is the helper class for the calculus package.
 * @author ZetkoOfficial
 *
 */
public class MathCalculus {
	
	/**
	 * This method calculates the derivative of the function at the point (x,y).
	 * @param function The IFunction
	 * @param x The x coordinate
	 * @param stepSize The step size(h)
	 * @return The derivative at the point (x,y)
	 */
	public static double mathDerivative(IFunction function, double x, double stepSize) {
		double f1 = function.run(x + stepSize);
		double f2 = function.run(x);
		
		double res = (f1 - f2) / stepSize;
		
		return res;
	}
	
	/**
	 * This method calculates the derivative of the function at the point (x,y), with the step size 0.0001.
	 * @param function The IFunction
	 * @param x The x coordinate
	 * @return The derivative at the point (x,y)
	 */
	public static double mathDerivative(IFunction function, double x) {
		return mathDerivative(function, x, 0.0001);
	}
	
	/**
	 * This method calculates the definite integral of the function between x = b and x = a.
	 * @param function The IFunction
	 * @param a The lower bound of the integral
	 * @param b The higher bound of the integral
	 * @param rectNumber Number of rectangles which will approximate the area.
	 * @return The definite integral between x = b and x = a.
	 */
	public static double mathIntegral(IFunction function, double a, double b, int rectNumber) {
		double range = b - a;	
		double stepSize = range / rectNumber;
		
		double res = 0;
		
		for(int i = 0; i < rectNumber; i++) {
			res += function.run(stepSize * i + a) * stepSize;
		}
		
		return res;
	}
	
	/**
	 * This method calculates the definite integral of the function between x = b and x = a, by using 10000 rectangles.
	 * @param function The IFunction
	 * @param a The lower bound of the integral
	 * @param b The higher bound of the integral
	 * @return The definite integral between x = b and x = a.
	 */
	public static double mathIntegral(IFunction function, double a, double b) {
		return mathIntegral(function, a, b, 10000);
	}
}
