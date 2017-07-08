package practiceJava;

class MeikaiPractice7_1 {

	public static void main(String[] args) {
		int[] dt = { 20, 40, 10, 80, 30, 90, 50 };
		int max = dt[0];
		int min = dt[0];
		for ( int i = 1; i<dt.length; i++) {
			if ( dt[i] > max ) {
				max = dt[i];
			} else if ( dt[i] < min ) {
				min = dt[i];
			}
		}
		System.out.println("最大値は" + max );
		System.out.println("最小値は" + min );
	}

}
