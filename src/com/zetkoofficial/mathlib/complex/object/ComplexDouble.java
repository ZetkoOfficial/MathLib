package com.zetkoofficial.mathlib.complex.object;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import com.zetkoofficial.mathlib.complex.helper.MathComplex;
import com.zetkoofficial.mathlib.matrixvector.object.Vector;

/**
 * This is and Object which represents a complex number.
 * @author ZetkoOfficial
 *
 */
public class ComplexDouble {
	
	private Vector complexVector = new Vector(2);
	
	/**
	 * This creates a complex number of the form a + bi.
	 * @param a The real part of the complex number
	 * @param b The imaginary part of the complex number
	 */
	public ComplexDouble(double a, double b) {
		this.complexVector.put(0, a);
		this.complexVector.put(1, b);
	}
	
	/**
	 * This creates a complex number with the complexVector.
	 * @param complexVector The vector which represents the complex number.
	 */
	public ComplexDouble(Vector complexVector) {
		this.complexVector = complexVector;
	}
	
	/**
	 * This function changes the complex number by making its absolute value 1, but keeping the angle.
	 */
	public void normalize() {
		double tan = Math.tan(MathComplex.mathArgument(this));

		double a = Math.sqrt(1d / (Math.pow(tan, 2) + 1));
		double b = a * tan;
		
		this.complexVector.put(0, a);
		this.complexVector.put(1, b);
	}
	
	/**
	 * Sets the real part of the complex number to the value.
	 * @param value The new value of the real part
	 */
	public void setRealPart(double value) {
		this.complexVector.put(0, value);
	}
	
	/**
	 * Sets the imaginary part of the complex number to the value.
	 * @param value The new value of the imaginary part
	 */
	public void setImaginaryPart(double value) {
		this.complexVector.put(1, value);
	}
	
	/**
	 * @return The real part of the complex number
	 */
	public double getRealPart() {
		return this.complexVector.get(0);
	}
	
	/**
	 * Scales the complex vector by a scalar.
	 * @param scalar The scaler that will be multiplied to every component of the complex vector
	 */
	public void scale(double scalar) {
		this.complexVector.scale(scalar);
	}
	
	/**
	 * @return The imaginary part of the complex number
	 */
	public double getImaginaryPart() {
		return this.complexVector.get(1);
	}
	
	public Vector getComplexVector() {
		return this.complexVector;
	}
	
	/**
	 * @return A copy of this ComplexDouble
	 */
	public ComplexDouble copy() {
		return new ComplexDouble(complexVector);
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.0000");
		df.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("ComplexDouble, ");
		sb.append('\n');

		sb.append(df.format(getRealPart()) + " + " + df.format(getImaginaryPart()) + "i");
		
		return sb.toString();
	}
}
