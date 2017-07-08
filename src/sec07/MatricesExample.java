package sec07;

// 線形代数の基本変形

class MatricesExample {

	public static void main(String[] args) {
		double[][] a = {{1,2,3},{4,3,2},{-1,0,2}};
		printMatrix( a );
		for(int i=1; i<a.length; i++) {
			double b = a[i][0]/a[0][0];
				if( b != 0 ) {
					for(int j=0; j<a[i].length; j++) {
						a[i][j] -= a[0][j]*b;
					}
				}
		}
		printMatrix( a );

		double b = a[1][1];
		for(int j=1; j<a[1].length; j++) {
			a[1][j] /= b;
		}
		printMatrix( a );
	}

	// 行列を出力するメソッド
	static void printMatrix(double[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.print( m[i][j] + " " );
			}
			System.out.println();
		}
		System.out.println();
	}
}
