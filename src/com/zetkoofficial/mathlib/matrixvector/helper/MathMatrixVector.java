package com.zetkoofficial.mathlib.matrixvector.helper;

import com.zetkoofficial.mathlib.function.object.FunctionsBuiltIn;
import com.zetkoofficial.mathlib.function.object.IFunction;
import com.zetkoofficial.mathlib.matrixvector.object.Matrix;
import com.zetkoofficial.mathlib.matrixvector.object.Vector;

/**
 * This is the helper class for the matrixvector package.
 * @author ZetkoOfficial
 *
 */
public final class MathMatrixVector {
	
	/**
	 * Does the sigmoid operation on every element of the Matrix.
	 * @param m The Matrix
	 * @return The result Matrix
	 */
	public static Matrix mathSigmoid(Matrix m) {
		return mathCustomFunction(m, FunctionsBuiltIn.FUNCTION_SIGMOID);
	}
	
	/**
	 * Does the sigmoid prime operation on every element of the Matrix.
	 * @param m The Matrix
	 * @return The result Matrix
	 */
	public static Matrix mathSigmoidPrime(Matrix m) {
		return mathCustomFunction(m, FunctionsBuiltIn.FUNCTION_SIGMOID_PRIME);
	}
	
	/**
	 * Does a custom operation on every element of the Matrix.
	 * @param m The Matrix
	 * @param function The IFunction which holds the custom operation
	 * @return The result Matrix
	 */
	public static Matrix mathCustomFunction(Matrix m, IFunction function) {
		Matrix res = new Matrix(m.getWidth(), m.getHeight());
		
		for(int x = 0; x < m.getWidth(); x++) {
			for(int y = 0; y < m.getHeight(); y ++) {
				res.put(x, y, function.run(m.get(x, y)));
			}
		}
		
		return res;
	}
	
	/**
	 * Does the absolute value operation on every element of the Matrix.
	 * @param m The Matrix
	 * @return The result Matrix
	 */
	public static Matrix mathAbs(Matrix m) {
		Matrix res = new Matrix(m.getWidth(), m.getHeight());
		
		for(int x = 0; x < m.getWidth(); x++) {
			for(int y = 0; y < m.getHeight(); y ++) {
				res.put(x, y, Math.abs(m.get(x, y)));
			}
		}
		
		return res;
	}
	
	/**
	 * Does addition between elements of both Matrices of the same index.
	 * @param m1 The first Matrix
	 * @param m2 The second Matrix
	 * @return The result Matrix
	 */
	public static Matrix mathAdd(Matrix m1, Matrix m2) {
		Matrix res = new Matrix(m1.getWidth(), m1.getHeight());
		
		for(int x = 0; x < m1.getWidth(); x++) {
			for(int y = 0; y < m1.getHeight(); y ++) {
				res.put(x, y, m1.get(x, y) + m2.get(x, y));
			}
		}
		
		return res;
	}
	
	/**
	 * Does subtraction between elements of both Matrices of the same index.
	 * @param m1 The first Matrix
	 * @param m2 The second Matrix
	 * @return The result Matrix
	 */
	public static Matrix mathSubtract(Matrix m1, Matrix m2) {
		Matrix res = new Matrix(m1.getWidth(), m1.getHeight());
		
		for(int x = 0; x < m1.getWidth(); x++) {
			for(int y = 0; y < m1.getHeight(); y ++) {
				res.put(x, y, m1.get(x, y) - m2.get(x, y));
			}
		}
		
		return res;
	}
	
	/**
	 * Does multiplication between elements of both Matrices of the same index.
	 * @param m1 The first Matrix
	 * @param m2 The second Matrix
	 * @return The result Matrix
	 */
	public static Matrix mathMultiply(Matrix m1, Matrix m2) {
		Matrix res = new Matrix(m1.getWidth(), m1.getHeight());
		
		for(int x = 0; x < m1.getWidth(); x++) {
			for(int y = 0; y < m1.getHeight(); y ++) {
				res.put(x, y, m1.get(x, y) * m2.get(x, y));
			}
		}
		
		return res;
	}
	
	/**
	 * Does division between elements of both Matrices of the same index.
	 * @param m1 The first Matrix
	 * @param m2 The second Matrix
	 * @return The result Matrix
	 */
	public static Matrix mathDivide(Matrix m1, Matrix m2) {
		Matrix res = new Matrix(m1.getWidth(), m1.getHeight());
		
		for(int x = 0; x < m1.getWidth(); x++) {
			for(int y = 0; y < m1.getHeight(); y ++) {
				res.put(x, y, m1.get(x, y) / m2.get(x, y));
			}
		}
		
		return res;
	}
	
	/**
	 * Calculates the dot product of Matrices.
	 * @param m1 The first Matrix
	 * @param m2 The second Matrix
	 * @return The result Matrix
	 */
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
	
	/**
	 * Does the sigmoid operation on every element of the Vector.
	 * @param v The Vector
	 * @return The result Vector
	 */
	public static Vector mathSigmoid(Vector v) {
		return mathCustomFunction(v, FunctionsBuiltIn.FUNCTION_SIGMOID);
	}
	
	/**
	 * Does the sigmoid prime operation on every element of the Vector.
	 * @param v The Vector
	 * @return The result Vector
	 */
	public static Vector mathSigmoidPrime(Vector v) {
		return mathCustomFunction(v, FunctionsBuiltIn.FUNCTION_SIGMOID_PRIME);
	}
	
	/**
	 * Does the custom operation on every element of the Vector.
	 * @param v The Vector
	 * @param function The IFunction which holds the custom operation.
	 * @return The result Vector
	 */
	public static Vector mathCustomFunction(Vector v, IFunction function) {
		Vector res = new Vector(v.getSize());
		
		for(int x = 0; x < v.getSize(); x++) {
			res.put(x, function.run(v.get(x)));
		}
		
		return res;
	}
	
	/**
	 * Does the absolute value operation on every element of the Vector.
	 * @param v The Vector
	 * @return The result Vector
	 */
	public static Vector mathAbs(Vector v) {
		Vector res = new Vector(v.getSize());
		
		for(int x = 0; x < v.getSize(); x++) {
			res.put(x, Math.abs(v.get(x)));
		}
		
		return res;
	}
	
	/**
	 * Does addition between elements of both Vectors of the same index.
	 * @param v1 The first Vector
	 * @param v2 The second Vector
	 * @return The result Vector
	 */
	public static Vector mathAdd(Vector v1, Vector v2) {
		Vector res = new Vector(v1.getSize());
		
		for(int x = 0; x < v1.getSize(); x++) {
			res.put(x, v1.get(x) + v2.get(x));
		}
		
		return res;
	}
	
	/**
	 * Does subtraction between elements of both Vectors of the same index.
	 * @param v1 The first Vector
	 * @param v2 The second Vector
	 * @return The result Vector
	 */
	public static Vector mathSubtract(Vector v1, Vector v2) {
		Vector res = new Vector(v1.getSize());
		
		for(int x = 0; x < v1.getSize(); x++) {
			res.put(x, v1.get(x) - v2.get(x));
		}
		
		return res;
	}
	
	/**
	 * Does multiplication between elements of both Vectors of the same index.
	 * @param v1 The first Vector
	 * @param v2 The second Vector
	 * @return The result Vector
	 */
	public static Vector mathMultiply(Vector v1, Vector v2) {
		Vector res = new Vector(v1.getSize());
		
		for(int x = 0; x < v1.getSize(); x++) {
			res.put(x, v1.get(x) * v2.get(x));
		}
		
		return res;
	}
	
	/**
	 * Does division between elements of both Vectors of the same index.
	 * @param v1 The first Vector
	 * @param v2 The second Vector
	 * @return The result Vector
	 */
	public static Vector mathDivide(Vector v1, Vector v2) {
		Vector res = new Vector(v1.getSize());
		
		for(int x = 0; x < v1.getSize(); x++) {
			res.put(x, v1.get(x) / v2.get(x));
		}
		
		return res;
	}
	
	
	/**
	 * Calculates the dot product of Vectors.
	 * @param v1 The first Vector
	 * @param v2 The second Vector
	 * @return The result Vector
	 */
	public static double mathDot(Vector v1, Vector v2) {
		double res = 0;
		
		for(int i = 0; i < v1.getSize(); i++) {
			res += v2.get(i) * v1.get(i);
		}
		
		return res;
	}
}
