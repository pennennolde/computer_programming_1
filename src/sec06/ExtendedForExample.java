package sec06;

class ExtendedForExample {

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3}, {4, 5}};
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum += a[i][j];
				// sum = sum + a[i][j]; でも良い
			}
		}
		System.out.println("合計は" + sum);

		int sum2 = 0;
		for(int[] array : a) {
			for(int d : array) {
				sum2 += d;
			}
		}
		System.out.println("合計は" + sum2);
	}

}
