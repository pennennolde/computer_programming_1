package practiceJava;

import java.util.Scanner;

class IfPractice1 {

	public static void main(String[] args) {
		System.out.println("絶対値を求めたい数を入力せよ");
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		if( a>0 ) {
			System.out.println("正なので絶対値は\t" + a);
		} else if( a== 0) {
			System.out.println("0\tなので絶対値は\t0");
		} else {
			System.out.println("負なので絶対値は\t" + Math.abs(a));
		}

	}

}
