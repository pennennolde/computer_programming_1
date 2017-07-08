package sec06;

class AndExample {

	public static void main(String[] args) {
		int[] d = {1, 2, 3, 4};
		int base = 10;
		int i = 0;
		while( i<d.length && d[i] <= base ) {
			base -= d[i];
			i++;
		}
		System.out.println("残りは" + base);

		base = 5;
		for(int j=0; j<d.length; j++) {
			if( d[j] <=base ) {
				base -= d[j];
			} else {
				break;
			}
		}
		System.out.println("残りは" + base);

		base = 5;
		for(int j=0; j<d.length && d[j]<=base; j++) {
			base -= d[j];
		}
		System.out.println("残りは" + base);

		int sum = 0;
		for(int j=0, k=0; j<10 && k<4; j++, k++) {
			sum += j + k;
		}
		System.out.println(sum);
	}

}
