package practiceJava;

class Practice3_3_for {

	public static void main(String[] args) {
		int a;
		int sum1 = 0;
		for ( a=10; a<=20; a++) {
			sum1 += a;
		}
		System.out.println( sum1 );

		int b = 10;
		int sum2 = 0;
		while ( b<=20 ) {
			sum2 += b;
			b++;
		}
		System.out.println( sum2 );

		int x;
		if ( (x==5) || (x==8) ) {
		}
		if ( x==( 5 || 8) ) {
		}
		if ( (x>1) && (x<10) && (x!=5) ) {
		}
		if ( (1<x<10) && (x!=5) ) {
		}

	}
}
