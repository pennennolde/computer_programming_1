package practiceJava;

class MatricesPractice {

	public static void main(String[] args) {
		int[][]a = {{1,2,3},{4,5,6}};

		for ( int i=0; i<a.length; i++) {
			for ( int j=0; j<a[i].length; j++) {
				System.out.printf( "%3d", a[i][j] );
			}
			System.out.println();
		}

		System.out.println();

		int[][]b = {{1,2},{3,4},{5,6}};

		for ( int i=0; i<b.length; i++) {
			for ( int j=0; j<b[i].length; j++) {
				System.out.printf( "%3d", b[i][j] );
			}
			System.out.println();
		}

		System.out.println();

		int[][]c = new int[a.length][b[0].length];
		for ( int i =0; i<a.length; i++) {
			for ( int j=0; j<a[i].length; j++) {
				c[i][j] += a[i][j]*b[j][i];
				System.out.printf("%3d", c[i][j] );
			}
			System.out.println();
		}

	}

}
