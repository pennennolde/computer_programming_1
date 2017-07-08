package sec06;

import java.util.Scanner;

class MacDonaldLady {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("いらっしゃいませ。");
		System.out.println("どれになさいますか?");
		System.out.println("(1) ハンバーガー\\100 \n"
									+ "(2) チーズバーガー \\120 \n"
									+ "(3) フィレオフィッシュ\\150");
		int no = scan.nextInt();
		int price = 0;
		switch( no) {
		case 1 :
			System.out.println("ハンバーガーですね。\\100です");
			price += 100;
			break;
		case 2:
			System.out.println("チーズバーガーですね。\\120です");
			price += 120;
			break;
		case 3:
			System.out.println("フィレオフィッシュですね。\\150です");
			price += 150;
			break;
		}
		System.out.println("ポテトはいかがですか?");
		String yesNo="";
		do {
			System.out.println("y / n でお答えください");
			yesNo = scan.next();
			if( yesNo.equals("y") ) {
				System.out.println("\\100になります");
				price += 100;
				break;
			}
		} while( ! yesNo.equals("n") );
		System.out.println("合計\\" + price + "いただきます");
	}
}
