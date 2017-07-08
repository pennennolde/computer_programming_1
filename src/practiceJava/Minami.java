package practiceJava;

public class Minami {

	public static void main(String[] args) {
		for ( int i=1; i<=10; i++ ) {
			int j = i*9;
			int a = (int)(j/10);
			int b = j-(int)(j/10)*10;
			int c = a+b-2;
			System.out.println("n=" + i + " " + c);
		}
	}
}
