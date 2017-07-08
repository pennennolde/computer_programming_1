package sec09;

class MethodExample {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = add(a,b);
		System.out.println(a + "+" + b + "=" + c);
		// System.out.println(a + "+" + b + "=" + add(a,b)); でも良い！
		int[] e = {1,2,3,4,5};
		int d = add(e);
		System.out.println("合計は、" + d);
	}

	static int add(int x, int y) { // x,yは仮引数
		int  z = x + y; // zはローカル変数
		return z;
		// return (x+y); でも良い！

		static int add(int[] x) {
			int sum = 0;
			for(int i=0; i<x.length; i++) {
				sum += x[i];
			}
			return sum;
		}
	}
}
