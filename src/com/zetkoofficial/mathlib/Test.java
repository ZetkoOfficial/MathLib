package com.zetkoofficial.mathlib;

import com.zetkoofficial.mathlib.matrixvector.object.Matrix;
import static com.zetkoofficial.mathlib.matrixvector.helper.MathMatrixVector.*;

import com.zetkoofficial.mathlib.function.object.IFunction;

import static com.zetkoofficial.mathlib.calculus.helper.MathCalculus.*;

public class Test {
	public static void main(String[] args) {
		IFunction func = new IFunction() {
			
			@Override
			public double run(double value) {
				return Math.pow(value, 2);
			}
		};
		
		Matrix m1 = new Matrix(2,2);
		m1.put(0, 0, 1); m1.put(1, 0, 2);
		m1.put(0, 1, 3); m1.put(1, 1, 4);
		
		System.out.println(m1);
		
		System.out.println(mathCustomFunction(m1, func));
		
		System.out.println(mathDerivative(func, 1));
	}
}
