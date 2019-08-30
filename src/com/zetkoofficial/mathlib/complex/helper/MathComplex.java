package com.zetkoofficial.mathlib.complex.helper;

import com.zetkoofficial.mathlib.complex.object.ComplexDouble;
import com.zetkoofficial.mathlib.matrixvector.helper.MathMatrixVector;
import com.zetkoofficial.mathlib.matrixvector.object.Vector;

/**
 * This is the helper class for the complex package.
 * @author ZetkoOfficial
 *
 */
public class MathComplex {
	
	/**
	 * Does addition between the ComplexDoubles.
	 * @param c1 The first ComplexDouble
	 * @param c2 The second ComplexDouble
	 * @return The result ComplexDouble
	 */
	public static ComplexDouble mathAdd(ComplexDouble c1, ComplexDouble c2) {
		Vector complexVector = MathMatrixVector.mathAdd(c1.getComplexVector(), c2.getComplexVector());
		
		return new ComplexDouble(complexVector);
	}
	
	/**
	 * Does subtraction between the ComplexDoubles.
	 * @param c1 The first ComplexDouble
	 * @param c2 The second ComplexDouble
	 * @return The result ComplexDouble
	 */
	public static ComplexDouble mathSubtract(ComplexDouble c1, ComplexDouble c2) {
		Vector complexVector = MathMatrixVector.mathSubtract(c1.getComplexVector(), c2.getComplexVector());
		
		return new ComplexDouble(complexVector);
	}
	
	/**
	 * Does multiplication between the ComplexDoubles.
	 * @param c1 The first ComplexDouble
	 * @param c2 The second ComplexDouble
	 * @return The result ComplexDouble
	 */
	public static ComplexDouble mathMultiply(ComplexDouble c1, ComplexDouble c2) {
		double a = c1.getRealPart() * c2.getRealPart() - c1.getImaginaryPart() * c2.getImaginaryPart();
		double b = c1.getRealPart() * c2.getImaginaryPart() + c1.getImaginaryPart() * c2.getRealPart();
		
		return new ComplexDouble(a, b);
	}
	
	/**
	 * Does division between the ComplexDoubles.
	 * @param c1 The first ComplexDouble
	 * @param c2 The second ComplexDouble
	 * @return The result ComplexDouble
	 */
	public static ComplexDouble mathDivide(ComplexDouble c1, ComplexDouble c2) {
		ComplexDouble conjugate = c2.copy();
		conjugate.setImaginaryPart(conjugate.getImaginaryPart() * -1);
		
		ComplexDouble enumarator = mathMultiply(c1, conjugate);
		double scale = 1d/ (Math.pow(c2.getRealPart(), 2) + Math.pow(c2.getImaginaryPart(), 2));
	
		enumarator.scale(scale);

		return enumarator;
	}
	
	/**
	 * 
	 * @param c The ComplexDouble
	 * @return The length of the complex vector of this ComplexDouble.
	 */
	public static double mathLength(ComplexDouble c) {
		return MathMatrixVector.mathLength(c.getComplexVector());
	}
	
	/**
	 * Does does the power operation to this ComplexDouble
	 * @param c The ComplexDouble
	 * @param exponent A positive integer
	 * @return The result ComplexDouble
	 */
	public static ComplexDouble mathPow(ComplexDouble c, int exponent) {
		
		ComplexDouble res = c.copy();
		
		for(int i = 0; i < exponent - 1; i++) {
			res = mathMultiply(res, c);
		}
		
		return res;
	}
	
	/**
	 * @param c The ComplexDouble.
	 * @return The angle between the x-axis and the vector formed by the complex number.
	 */
	public static double mathArgument(ComplexDouble c) {
		return Math.atan2(c.getImaginaryPart(), c.getRealPart());
	}
}
