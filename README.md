# MathLib
**MathLib** is a Java library that adds support for matrices and vectors, as well as definate integrals and derivatives.

It currently has 4 packages: _matrixVector_, _calculus_, _function_ and _complex_.


To use MathLib in your Java project you can either clone this repository and compile it yourself or download it from [here](http://zetkoofficial.com/mathLib), then add it to your build path.
The source and javadoc of this project are both in located in the .jar on the website.

I suggest you use static imports as all helper methods in all packages are prefixed by ```math```.

Example:
```java
import static com.zetkoofficial.mathlib.matrixvector.helper.MathMatrixVector.*;
import com.zetkoofficial.mathlib.matrixvector.object.Vector;
.
.
.

Vector vector = new Vector(2);
vector.randomize();

Vector result = mathSigmoid(vector);

```


If ```_PACKAGENAME_``` is the name of the desired package then:

All helper classes have their location in the form of: ```com.zetkoofficial.mathlib._PACKAGENAME_.helper.Math_PACKAGENAME_```

All object classes can be found in: ```com.zetkoofficial.mathlib._PACKAGENAME_.object```
