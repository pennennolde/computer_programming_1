package practiceJava;

class MeikaiPractice7_2 {

	public static void main(String[] args) {
		int[] dt = { 10, 20, -30, 40, -50, 60 };
		System.out.print("dt= ");
		for( int i = 0; i<dt.length; i++) {
			System.out.print( dt[i] +" ");
		}
		System.out.println();
		int sum = 0;
		for ( int j = 0; j<dt.length; j++) {
			if ( dt[j] >= 0 ) {
			sum += dt[j];
			}
		}
		System.out.println("正の値の和は " + sum );
	}

}
