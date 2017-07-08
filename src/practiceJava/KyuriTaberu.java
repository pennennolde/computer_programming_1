package practiceJava;

import java.util.Scanner;

class KyuriTaberu {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("芳花：キュウリ食べる？");
		System.out.println();
		System.out.println("\t<はい：1>");
		System.out.println("\t<いいえ：0>");

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		if( x==1 )	{
			System.out.println("ボク：うん！\t<次へ：1>");
			Scanner scan1 = new Scanner(System.in);
			int y = scan.nextInt();
			if(y==1) {
				System.out.println("  "+"(ポリポリ…)\t<次へ：1>");
			}
			Scanner scan2 = new Scanner(System.in);
			int z= scan.nextInt();
			if( z==1 ) {
				System.out.print("ボク：おいしいね！");
			}
		} else if( x==0 ) {
			System.out.print("ボク：いらな～い");
		}

		int f = 0;

		System.out.println("\t<戻る：1>");
		Scanner scan0 = new Scanner(System.in);
		int w= scan.nextInt();
		do {
		if( w==1 ) {
			System.out.println();
		System.out.println("<話しかけますか？>");
		System.out.println();
		System.out.println("\t<はい：1>");
		System.out.println("\t<いいえ：0>");
		System.out.println();
		}
		Scanner scan3 = new Scanner(System.in);
		int a = scan.nextInt();

		if( a==1 ) {
			//int f = 0;

			//do {
			System.out.println();
			System.out.println("芳花：キュウリもう1本食べる？");
			System.out.println();
			System.out.println("\t<はい：1>");
			System.out.println("\t<いいえ：0>");
			Scanner scan4 = new Scanner(System.in);
			int b = scan.nextInt();
			if( b==1) {
				System.out.println("ボク：うん！\t<次へ：1>");
			} else if( b==0) {
				System.out.println("芳花：じゃあ、またお腹すいたらおいで～");
			}
				Scanner scan5 = new Scanner(System.in);
				int c = scan.nextInt();
				if(c==1) {
					System.out.println("  "+"(ポリポリ…)\t<次へ：1>");
				}
				Scanner scan6 = new Scanner(System.in);
				int d= scan.nextInt();
				if( d==1 ) {
					System.out.println("ボク：やっぱりおいしいね！\t<次へ：1>");
					System.out.println();
				}
					Scanner scan7 = new Scanner(System.in);
					int e= scan.nextInt();
					if( e==1) {
						f=1;
					}
			//}while ( f==1);
	}else if( a==0 ) {
			System.out.println("ボク：…(終)");
	}
	}while ( f==1);
	}
}


