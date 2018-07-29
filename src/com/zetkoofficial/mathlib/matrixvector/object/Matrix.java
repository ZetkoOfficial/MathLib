package com.zetkoofficial.mathlib.matrixvector.object;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Matrix {
	
	private double[][] matrix;
	private int width, height;
	
	public Matrix(int width, int height) {
		this.matrix = new double[width][height];
		this.width = width;
		this.height = height;
	}
	
	public double get(int x, int y) {
		return this.matrix[x][y];
	}
	
	public void put(int x, int y, double value) {
		this.matrix[x][y] = value;
	}
	
	public Vector getRowVector(int y) {
		Vector vector = new Vector(this.width);
		
		for(int i = 0; i < this.width; i ++) {
			vector.put(i, get(i, y));
		}
		
		return vector;
	}
	
	public Vector getColumnVector(int x) {
		Vector vector = new Vector(this.height);
		
		for(int i = 0; i < this.height; i ++) {
			vector.put(i, get(x, i));
		}
		
		return vector;
	}
	
	public void scale(double scalar) {
		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y ++) {
				this.matrix[x][y] *= scalar;
			}
		}
	}
	
	public Matrix transpose() {	
		Matrix m = new Matrix(height, width);

		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y ++) {
				m.matrix[y][x] = this.matrix[x][y];
			}
		}
		
		return m;
	}
	
	public void randomize() {
		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y ++) {
				this.matrix[x][y] = Math.random();
			}
		}
	}
	
	public double sumElements() {
		double res = 0;
		
		for(int x = 0; x < this.width; x++) {
			for(int y = 0; y < this.height; y ++) {
				res += this.matrix[x][y];
			}
		}
		
		return res;
	}
	
	public int getWidth() {
		return width;
	}
	
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
	
}

