package midTerm2019;

class Complex {
	private double real;
	private double imaginary;

	public Complex(double a, double b) {
		this.real = a;
		this.imaginary = b;
	}

	public Complex add(Complex other) {
		double new_real = this.getReal();
		double new_imaginary = this.getImaginary();

		new_real += other.getReal();
		new_imaginary += other.getImaginary();

		Complex result = new Complex(new_real, new_imaginary);
		return result;
	}

	public Complex sub(Complex other) {
		double new_real = this.getReal();
		double new_imaginary = this.getImaginary();

		new_real -= other.getReal();
		new_imaginary -= other.getImaginary();

		Complex result = new Complex(new_real, new_imaginary);
		return result;

	}

	public Complex mul(Complex other) {
		double a = this.getReal();
		double b = this.getImaginary();

		double c = other.getReal();
		double d = other.getImaginary();

		double new_real = a * c - b * d;
		double new_imaginary = a * d + b * c;

		Complex result = new Complex(new_real, new_imaginary);
		return result;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}
}

public class Q2 {
	public static void main(String[] args) {
		Complex c1 = new Complex(3, -1);
		Complex c2 = new Complex(-5, 2);

		Complex c1_add_c2 = c1.add(c2);
		Complex c1_sub_c2 = c1.sub(c2);
		Complex c1_mul_c2 = c1.mul(c2);

		System.out.println("c1 + c2 = " + c1_add_c2.getReal() + " + " + c1_add_c2.getImaginary() + "i");
		System.out.println("c1 - c2 = " + c1_sub_c2.getReal() + " + " + c1_sub_c2.getImaginary() + "i");
		System.out.println("c1 * c2 = " + c1_mul_c2.getReal() + " + " + c1_mul_c2.getImaginary() + "i");

	}
}
