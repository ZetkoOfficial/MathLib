package com.zetkoofficial.mathlib.matrixvector.object;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * This is an Object which represents a vector.
 * @author ZetkoOfficial
 *
 */
public class Vector {
	private double[] vector;
	private int size;
	
	/**
	 * @param size The size of this Vector.
	 */
	public Vector(int size) {
		this.vector = new double[size];
		this.size = size;
	}
	
	/**
	 * @param elements The elements of the Vector.
	 */
	public Vector(double... elements) {
		this.size = elements.length;
		this.vector = elements;
	}
	
	/**
	 * Gets the element at the location index.
	 * @param index The index of the element.
	 * @return The element (index).
	 */
	public double get(int index) {
		return vector[index];
	}
	
	/**
	 * Puts a value into the location (index).
	 * 
	 * @param index The index of the element.
	 * @param value The value to put in the Vector.
	 */
	public void put(int index, double value) {
		this.vector[index] = value;
	}
	
	/**
	 * Sets all the elements in the Vector to random values between 0 and 1.
	 */
	public void randomize() {
		for(int x = 0; x < this.size; x++) {
			this.vector[x] = Math.random();
		}
	}
	
	/**
	 * Multiplies all the elements of this Vector by a value.
	 * @param scalar The value which will multiply every element in the Vector.
	 */
	public void scale(double scalar) {
		for(int x = 0; x < this.size; x++) {
			this.vector[x] *= scalar;
		}
	}
	
	/**
	 * @return The size of the Vector.
	 */
	public int getSize() {
		return size;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.0000");
		df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Vector, ");
		sb.append("Size: " + size);
		sb.append('\n');
		
		sb.append("( ");
		for(double d : vector) {
			sb.append(df.format(d) + " ");
		}
		sb.append(")");
		
		return sb.toString();
	}
	
	/**
	 * @return A copy of this Vector
	 */
	public Vector copy() {
		Vector res = new Vector(getSize());
		for(int x = 0; x < this.size; x++) {
			res.put(x, get(x));
		}
		
		return res;
	}
	
	/**
	 * @return An Array containing all the elements.
	 */
	public double[] toArray() {
		return vector;
	}
	
}

