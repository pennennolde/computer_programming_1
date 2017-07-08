package practiceJava;

import java.util.Scanner;

class ForPractice1 {

	public static void main(String[] args) {

		System.out.println("おお！\tそこの君！");
		System.out.println("どうやら素因数分解してほしそうな顔をしておるな！");
		System.out.println("素因数分解してほしい整数を入力してみなされ！");
		System.out.println("このわしが華麗に素因数分解してみせよう！");
		System.out.println("整数なら何でもよいぞ！");
		System.out.print("\nx=");

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		System.out.print(" " + "=");

		int a;

		if( x<0) {
			System.out.print("-");
			x = Math.abs( x );
		}

		if( x<1000000000 ) {
			if( x==0) {
				System.out.println("0");
			} else if( x==1) {
				System.out.println("1");
			} else {
				for ( a=2; x>=a; ) {
					if( x%a==0 ) {
						System.out.print( a +"*");
						x=x/a;
					} else {
						while ( x%a!=0 ) {
							a++;
						}
					}
				}
			}
			System.out.println("\n\nふぉっ、ふぉっ、ふぉ～！" + "  " + "朝飯前よぉ～！");
		} else {
			System.out.println("\n\n数が大きすぎるわい！\tヤじゃ！！");
		}
	}

}
