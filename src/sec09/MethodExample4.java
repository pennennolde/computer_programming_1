package sec09;

class MethodExample4 {

	public static void main(String[] args) {
		int[] a = {1, 8, 7, 5, 3, 2, 6, 9, 4};
		int amax = max( a );
		System.out.println("配列 a の最大値は" + amax);
	}

	static int max(int[] a ) {
		// int max = Integer.MIN_VALUE;
		int amax = a[0];
		for(int i=0; i<a.length; i++) {
			amax = Math.max(amax, a[i]);
			/*
			if( a[i] > amax) {
				amax = a[i];
			}
			*/
		}
		return amax;
	}
}
