package sec04;

class CalcSum {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println( a + "+" + b  + "=" + sum );
		System.out.println( a + "+" + b  + "=" + ( a + b ));
		a = 30;
		sum = a + b;
		System.out.println( a + "+" + b  + "=" + sum );
	}

}
