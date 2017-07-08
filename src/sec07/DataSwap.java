package sec07;

/*
 * データを変換するプログラム
 */

class DataSwap {

	public static void main(String[] args) {
		// 2変数の値の変換
		int a = 2;
		int b = 3;
				//間違いの例  b = a; a = b;
		int c = b;
		b = a;
		a = c;
		System.out.println("a="+a+", b="+b);
		System.out.println();

		// 配列内の2要素の交換
		int[] d = {2, 3};
		int e = d[1];
		d[1] = d[0];
		d[0] = e;
		System.out.println("d[0]="+d[0]+", d[1]="+d[1]);
		System.out.println();

		// 3要素の並び替え
		int  f = 3;
		int g = 2;
		int h = 4;
				// f<g<h に並び替える
				// f, g, h
		if( g < f ) {		 // f <= g にする
			int i = f;
			f = g;
			g = i;
		}		// f<g ,h
		if( h < g ) {		// g<=h にする
			int i = g;
			g = h;
			h = i;
				// (f,g)<h
			if( g < f ) { // h<f<g : g→h, f→g, h→f
				int j = f;
				f = g;
				g = j;
			}
		}
		System.out.println("f="+f+", g="+g+", h="+h);
		System.out.println();

		// 配列の要素の並び替え
		int [] m = {3,2,5,6,1,4};		// → 1,2,3,4,5,6
		for(int i=1; i<m.length; i++) {
			for(int j=i; j>0; j--) {
				if( m[j-1] > m[j]) {
					int n=m[j-1]; m[j-1]=m[j]; m[j]=n;	// 入れ替え
					for ( int k=0; k<m.length; k++) {		// 出力
						System.out.print( m[k] + " ");
					}
					System.out.println();
				}else{
					break;
				}
			}
		}
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println();
		System.out.println();

		// 2配列の値の交換
		int[] p = {1, 2, 3, 4};
		int[] q = {5, 6, 7, 8};

		/*方法1  値それぞれ
		for(int i=0; i<p.length; i++) {
			int j = p[i]; p[i] = q[i]; q[i] = j;
		}*/

		//方法2  全部一斉に
		int[] r = p; p = q; q = r;

		for(int i=0; i<p.length; i++) {
				System.out.print( p[i] + " ");
		}
		System.out.println();
		for ( int i=0; i<q.length; i++) {
			System.out.print( q[i] + " ");
		}
		System.out.println();
	}

}
