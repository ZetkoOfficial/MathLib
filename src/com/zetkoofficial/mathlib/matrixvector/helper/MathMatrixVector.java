package com.zetkoofficial.mathlib.matrixvector.helper;

import com.zetkoofficial.mathlib.function.helper.MathFunction;
import com.zetkoofficial.mathlib.function.object.IFunction;
import com.zetkoofficial.mathlib.matrixvector.object.Matrix;
import com.zetkoofficial.mathlib.matrixvector.object.Vector;

public final class MathMatrixVector {
	
	public static Matrix mathSigmoid(Matrix m) {
		Matrix res = new Matrix(m.getWidth(), m.getHeight());
		
		for(int x = 0; x < m.getWidth(); x++) {
			for(int y = 0; y < m.getHeight(); y ++) {
				res.put(x, y, MathFunction.mathSigmoid(m.get(x, y)));
			}
		}
		
		return res;
	}
	
	public static Matrix mathSigmoidPrime(Matrix m) {
		Matrix res = new Matrix(m.getWidth(), m.getHeight());
		
		for(int x = 0; x < m.getWidth(); x++) {
			for(int y = 0; y < m.getHeight(); y ++) {
				res.put(x, y, MathFunction.mathSigmoidPrime(m.get(x, y)));
			}
		}
		
		return res;
	}
	
	public static Matrix mathCustomFunction(Matrix m, IFunction function) {
		Matrix res = new Matrix(m.getWidth(), m.getHeight());
		
		for(int x = 0; x < m.getWidth(); x++) {
			for(int y = 0; y < m.getHeight(); y ++) {
				res.put(x, y, function.run(m.get(x, y)));
			}
		}
		
		return res;
	}
	
	public static Matrix mathAbs(Matrix m) {
		Matrix res = new Matrix(m.getWidth(), m.getHeight());
		
		for(int x = 0; x < m.getWidth(); x++) {
			for(int y = 0; y < m.getHeight(); y ++) {
				res.put(x, y, Math.abs(m.get(x, y)));
			}
		}
		
		return res;
	}
	
	public static Matrix mathAdd(Matrix m1, Matrix m2) {
		Matrix res = new Matrix(m1.getWidth(), m1.getHeight());
		
		for(int x = 0; x < m1.getWidth(); x++) {
			for(int y = 0; y < m1.getHeight(); y ++) {
				res.put(x, y, m1.get(x, y) + m2.get(x, y));
			}
		}
		
		return res;
	}
	
	public static Matrix mathSubtract(Matrix m1, Matrix m2) {
		Matrix res = new Matrix(m1.getWidth(), m1.getHeight());
		
		for(int x = 0; x < m1.getWidth(); x++) {
			for(int y = 0; y < m1.getHeight(); y ++) {
				res.put(x, y, m1.get(x, y) - m2.get(x, y));
			}
		}
		
		return res;
	}
	
	public static Matrix mathMultiply(Matrix m1, Matrix m2) {
		Matrix res = new Matrix(m1.getWidth(), m1.getHeight());
		
		for(int x = 0; x < m1.getWidth(); x++) {
			for(int y = 0; y < m1.getHeight(); y ++) {
				res.put(x, y, m1.get(x, y) * m2.get(x, y));
			}
		}
		
		return res;
	}
	
	public static Matrix mathDivide(Matrix m1, Matrix m2) {
		Matrix res = new Matrix(m1.getWidth(), m1.getHeight());
		
		for(int x = 0; x < m1.getWidth(); x++) {
			for(int y = 0; y < m1.getHeight(); y ++) {
				res.put(x, y, m1.get(x, y) / m2.get(x, y));
			}
		}
		
		return res;
	}
	
	
	
	public static Matrix mathDot(Matrix m1, Matrix m2) {		
		Matrix res = new Matrix(m2.getWidth(), m1.getHeight());
		
		for(int y = 0; y < m1.getHeight(); y++) {
			for(int x = 0; x < m2.getWidth(); x ++) {
				Vector a = m1.getRowVector(y);
				Vector b = m2.getColumnVector(x);
				
				double val = mathDot(a,b);	
				res.put(x, y, val);
			}
		}
		
		return res;
	}
	
	public static Vector mathSigmoid(Vector v) {
		Vector res = new Vector(v.getSize());
		
		for(int x = 0; x < v.getSize(); x++) {
			res.put(x, MathFunction.mathSigmoid(v.get(x)));
		}
		
		return res;
	}
	
	public static Vector mathSigmoidPrime(Vector v) {
		Vector res = new Vector(v.getSize());
		
		for(int x = 0; x < v.getSize(); x++) {
			res.put(x, MathFunction.mathSigmoidPrime(v.get(x)));
		}
		
		return res;
	}
	
	public static Vector mathCustomFunction(Vector v, IFunction function) {
		Vector res = new Vector(v.getSize());
		
		for(int x = 0; x < v.getSize(); x++) {
			res.put(x, function.run(v.get(x)));
		}
		
		return res;
	}
	
	public static Vector mathAbs(Vector v) {
		Vector res = new Vector(v.getSize());
		
		for(int x = 0; x < v.getSize(); x++) {
			res.put(x, Math.abs(v.get(x)));
		}
		
		return res;
	}
	
	public static Vector mathAdd(Vector v1, Vector v2) {
		Vector res = new Vector(v1.getSize());
		
		for(int x = 0; x < v1.getSize(); x++) {
			res.put(x, v1.get(x) + v2.get(x));
		}
		
		return res;
	}
	
	public static Vector mathSubtract(Vector v1, Vector v2) {
		Vector res = new Vector(v1.getSize());
		
		for(int x = 0; x < v1.getSize(); x++) {
			res.put(x, v1.get(x) - v2.get(x));
		}
		
		return res;
	}
	
	public static Vector mathMultiply(Vector v1, Vector v2) {
		Vector res = new Vector(v1.getSize());
		
		for(int x = 0; x < v1.getSize(); x++) {
			res.put(x, v1.get(x) * v2.get(x));
		}
		
		return res;
	}
	
	public static Vector mathDivide(Vector v1, Vector v2) {
		Vector res = new Vector(v1.getSize());
		
		for(int x = 0; x < v1.getSize(); x++) {
			res.put(x, v1.get(x) / v2.get(x));
		}
		
		return res;
	}
	
	
	
	public static double mathDot(Vector v1, Vector v2) {
		double res = 0;
		
		for(int i = 0; i < v1.getSize(); i++) {
			res += v2.get(i) * v1.get(i);
		}
		
		return res;
	}
}
