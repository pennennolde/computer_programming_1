package practiceJava;

class While_DoWhile {

	public static void main(String[] args) {
		// while
		int a = 5;
		while (a>0) {
			System.out.print( a +" ");
			a--;
		}

		System.out.println();

		// do-while
		int b = 5;
		do {
			System.out.print( b +" ");
			b--;
		} while (b>0);
	}

}
