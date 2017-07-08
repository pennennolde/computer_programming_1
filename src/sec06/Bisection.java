package sec06;

class Bisection {

	public static void main(String[] args) {
		double a = 0;
		double b = 0.35;
		double fa = -1;
		double m;
		while( true ) {
			m = ( a + b )/2;
			double fm = 100*m*m*m-80*m*m+17*m-1;
			if( Math.abs(fm) <= 1.e-10 ) break;
			if( fa * fm < 0 ) {
				b =  m;
			}  else {
				a = m;
				fa = fm;
			}
		}
		System.out.println( "m=" + m );
	}

}
