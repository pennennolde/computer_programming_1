package sec09;

class MethodExample2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println("a="+a+", b="+b);
		// 入れ替え
		int c = b;
		b = a;
		a = c;
		System.out.println("a="+a+", b="+b);
		swap(a,b);
		System.out.println("a="+a+", b="+b);
		int[] d = {1,2};
		System.out.println("d[0]="+d[0]+", d[1]="+d[1]);
		swap(d);
		System.out.println("d[0]="+d[0]+", d[1]="+d[1]);

		// swap(d[0],d[1]); // これは入れ替えできない！ なぜ？
	}

	static void swap(int x, int y) {
		System.out.println("メソッド");
		int z = y;
		y = x;
		x = z;
	}

	/*配列にしているのは、
		値を正しく交換するためです。配列にしないと値は交換されないです。
		配列が参照型なので値が交換されるです。参照型を引数に渡しているので、結果的に
		main()メソッド内の変数aと変数bが交換されることになるです。
		参照（配列）が変数a,bを指しているからです。
		値型(int)で行うと、swap()メソッドで処理をしても、値は交換されないです。*/
	static void swap(int[] w) {
		System.out.println("メソッド");
		int z = w[0];
		w[0] = w[1];
		w[1] = z;
	}
}
