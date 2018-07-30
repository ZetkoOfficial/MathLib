package com.zetkoofficial.mathlib.matrixvector.object;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * This is an Object which represents a matrix.
 * @author ZetkoOfficial
 *
 */
public class Matrix {
	
	private double[][] matrix;
	private int width, height;
	
	/**
	 * 
	 * @param width The width of the Matrix.
	 * @param height The height of the Matrix.
	 */
	public Matrix(int width, int height) {
		this.matrix = new double[width][height];
		this.width = width;
		this.height = height;
	}
	
	/**
	 * 
	 * Gets the element at the location (x,y).
	 * 
	 * @param x The horizontal index of the element.
	 * @param y The vertical index of the element.
	 * @return The element (x,y).
	 */
	public double get(int x, int y) {
		return this.matrix[x][y];
	}
	
	/**
	 * Puts a value into the location (x,y).
	 * 
	 * @param x The horizontal index of the element.
	 * @param y The vertical index of the element.
	 * @param value The value to put in the Matrix.
	 */
	public void put(int x, int y, double value) {
		this.matrix[x][y] = value;
	}
	
	/**
	 * Gets the Vector that is formed by a row of this Matrix with the vertical index of y.
	 * @param y The vertical index.
	 * @return The Vector formed. 
	 */
	public Vector getRowVector(int y) {
		Vector vector = new Vector(this.width);
		
		for(int i = 0; i < this.width; i ++) {
			vector.put(i, get(i, y));
		}
		
		return vector;
	}
	
	/**
	 * Gets the Vector that is formed by a row of this Matrix with the horizontal index of x.
	 * @param x The horizontal index.
	 * @return The Vector formed. 
	 */
	public Vector getColumnVector(int x) {
		Vector vector = new Vector(this.height);
		
		for(int i = 0; i < this.height; i ++) {
			vector.put(i, get(x, i));
		}
		
		return vector;
	}
	
	/**
	 * Multiplies all the elements of this Matrix by a value.
	 * @param scalar The value which will multiply every element in the Matrix.
	 */
	public void scale(double scalar) {
		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y ++) {
				this.matrix[x][y] *= scalar;
			}
		}
	}
	
	/**
	 * @return This Matrix but the Row Vectors are now Column Vectors and vice versa.
	 */
	public Matrix transpose() {	
		Matrix m = new Matrix(height, width);

		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y ++) {
				m.matrix[y][x] = this.matrix[x][y];
			}
		}
		
		return m;
	}
	
	/**
	 * Sets all the elements in the Matrix to random values between 0 and 1.
	 */
	public void randomize() {
		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y ++) {
				this.matrix[x][y] = Math.random();
			}
		}
	}
	
	/**
	 * @return The sum of all elements in the Matrix.
	 */
	public double sumElements() {
		double res = 0;
		
		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y ++) {
				res += this.matrix[x][y];
			}
		}
		
		return res;
	}
	
	/**
	 * @return The width of this Matrix.
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * @return The height of this Matrix.
	 */
	public int getHeight() {
		return height;
	}
	
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("0.0000");
		df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Matrix, ");
		sb.append("Size: " + height + "X" + width);
		sb.append('\n');
		
		for(int y = 0; y < this.height; y++) {
			sb.append("| ");
			for(int x = 0; x < this.width; x++) {
				sb.append(df.format(get(x,y)) + " ");
			}
			sb.append("|");
			sb.append('\n');
		}
		
		sb.delete(sb.length() - 1, sb.length());
		return sb.toString();
	}
	
	/**
	 * @return A copy of this Matrix
	 */
	public Matrix copy() {
		Matrix res = new Matrix(getWidth(), getHeight());
		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y++) {
				res.put(x, y, get(x , y));
			}
		}
		
		return res;
	}
	
}

