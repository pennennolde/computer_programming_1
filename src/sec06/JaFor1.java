package sec06;

class JaFor1 {

	public static void main(String[] args) {
		int sum = 0;
		int mul = 1;
		for ( int i=1; i<=5; i++) {
			sum += i;
			mul *= i;
		}
		System.out.println( "和 = " + sum );
		System.out.println( "積 = " + mul );

		for ( int i=40; i>=20; i-=2 ) {
			System.out.print( i + " " );
		}
		System.out.println();
	}

}
