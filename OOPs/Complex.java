/*Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.*/

import java.util.*;
class Complex{
    int real;
    int imag;
    
    public Complex(int r, int i){
        real = r;
        imag = i;
    }


public static Complex add (Complex a, Complex b) {
    return new Complex ((a.real+b.real), (a.imag+b.imag));
    }
}

public static Complex diff(Complex a, Complex b) {
    
}