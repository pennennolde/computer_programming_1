package sec10;

class HanoiExample {

	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi("a","b","c",3);
		hanoi.start();
	}
}

class Hanoi {
	String a;
	String b;
	String c;
	int n;

	// コンストラクタ
	Hanoi(String a, String b, String c, int n) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.n = n;
	}

	// メソッド 引数&戻り値なし
	void start() {
		trans(a,c,b,n);
	}

// 再帰プログラム→自分自身を呼び出す

	// メソッド 戻り値なし
	void trans(String a, String c, String b, int n) {
		if( n >= 1) {
			trans( a, b, c, n-1);
			System.out.println(a + "から" + c + "に１枚移動" );
			trans(b, c, a, n-1);

			/* 	1.左の棒からn-1個の円盤を真ん中の棒に移動させる
				 	2.一番大きい円盤を左の棒から右の棒に移動させる
					3.真ん中の円盤を全部右の棒に移動させる */
		}
	}
}