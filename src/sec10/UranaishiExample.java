package sec10;

import java.util.InputMismatchException;
import java.util.Scanner;

class UranaishiExample {

	public static void main(String[] args) {
		Uranaishi uranaishi = new Uranaishi("神楽坂の父");
		uranaishi.start();
		uranaishi.end();
	}

}

class Uranaishi {
	String name;

	Uranaishi(String name) {
		this.name = name;
	}

	void start() {
		System.out.println("わしは、"+name+"じゃ。そなたの運勢を占って進ぜよう。");
		int month = 0;
		while( true ) {
			System.out.println("誕生月を入力して下され：");
			try {
				Scanner scan = new Scanner(System.in);
				month = scan.nextInt();
				if( month >=1 && month <=12 ) {
					scan.close();
					break;
				}
				errorMessage();
			}	catch( NumberFormatException nfe ) {
				errorMessage();
			} catch( InputMismatchException ime ) {
				errorMessage();
			}
	}
	System.out.println("誕生月は"+month+"じゃな。");
	System.out.println("うーむ、今日のそなたの運勢は");
	System.out.println("『"+fortune(month) +"』と出ておる。ご注意なされよ。");
	}

	void errorMessage() {
		System.out.println("まじめに答えなされ！");
	}

	String fortune(int month) {
		String fortune = "吉";
		switch( (int)(Math.random()*6) ) {
		case 0:
			fortune = "大吉";
			break;
		case 1:
			fortune = "中吉";
			break;
		case 2:
			fortune = "凶";
			break;
		default:
			fortune = "吉";
			break;
		}
		return fortune;
	}

	void end() {
		System.out.println("占い料はサービスしておこうかの。また来られい。");
	}
}