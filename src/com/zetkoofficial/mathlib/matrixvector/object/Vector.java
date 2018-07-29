package com.zetkoofficial.mathlib.matrixvector.object;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Vector {
	private double[] vector;
	private int size;
	
	public Vector(int size) {
		this.vector = new double[size];
		this.size = size;
	}
	
	public double get(int index) {
		return vector[index];
	}
	
	public void put(int index, double value) {
		this.vector[index] = value;
	}
	
	public void randomize() {
		for(int x = 0; x < this.size; x++) {
			this.vector[x] = Math.random();
		}
	}
	
	public void scale(double scalar) {
		for(int x = 0; x < this.size; x++) {
			this.vector[x] *= scalar;
		}
	}
	
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
	
}

