package sec09;

class MethodExample3 {

	public static void main(String[] args) {
		int[][] m = {{1,2,3,4,5},
							{6,7,8,9},
							{10,11},
							{12,13,14,15,16,17}};
		averageRow( m );
	}

	static void averageRow(int[][] a) {
		for(int i=0; i<a.length; i++) {
			double ave = getAveragePrint( a[i] );
			averagePrint( i, ave );
		}
	}

	static void averagePrint(int i, double ave) {
		System.out.println( (i+1) +"行目の平均値は、" + ave);
	}

	static double getAveragePrint(int[] x ) {
		int sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		double ave = (double) sum /x.length;
		return ave;
	}
	}
