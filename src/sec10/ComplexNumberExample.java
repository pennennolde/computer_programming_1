package sec10;

class ComplexNumberExample {

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(1.0, 2.0);
		ComplexNumber c2 = new ComplexNumber(-0.5, 1.5);
		ComplexNumber c3 = c1.plus( c2 );
	}
}

class ComplexNumber {
	double real;
	double imag;

	//コンストラクタ
	ComplexNumber( double r, double i) {
		this.real = r;
		this.imag = i;
	}

	ComplexNumber plus( ComplexNumber c) {
		ComplexNumber c2 = new ComplexNumber(this.real+c.real, this.imag+c.imag);
		return c2;
	}

	ComplexNumber product( ComplexNumber c ) {
		double real = this.real * c.real - this.imag * c.imag;
		double imag = this.real * c.imag + this.imag * c.real;
		ComplexNumber c2 = new ComplexNumber( real, imag );
		return c2;
	}
}
