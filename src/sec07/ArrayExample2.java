package sec07;

class ArrayExample2 {

	public static void main(String[] args) {
		int[][] a = {{-1,0,10},{5,16,-7,-8},{19,-40}};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf( "%3d", a[i][j] );
			}
			System.out.println();
		}
		//要素の平均値を求める
		int total = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				total += a[i][j];
			}
		}
		int count = 0;
		for(int i=0; i<a.length; i++) {
			count += a[i].length;
		}
		double average = (double) total / count;
		System.out.printf("平均は、%.3f%n" , average);

		//最大値を求める
		int max = a[0][0];
		for(int i =0; i<a.length; i++) {
			for(int j =0; j<a[i].length; j++) {
				if( a[i][j] > max ) {
					max = a[i][j];
			}
		}
	}
	System.out.println("最大値は、" + max);

/*
	int x = -6;
	int y = 9;
	double z;
	z = (double) x/y;
	System.out.println( z );
	*/

	}
}
