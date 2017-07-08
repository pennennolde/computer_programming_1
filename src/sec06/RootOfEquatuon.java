package sec06;

class RootOfEquatuon {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 1;
		//ax^2+bx+c=0 の根を求める → javaでは a*x*x+b*x+c=0
		int d = b*b-4*a*c;
		if( d > 0 ) {
			// 2実根
			double x1 = (-b+Math.sqrt(d))/(2*a);
			double x2 = (-b-Math.sqrt(d))/(2*a);
			System.out.println(" 2実根あります");
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		} else if( d == 0 ) {
			// 重根
			// double x = -b/a; はダメ！
			//double X = -b*1.0/(2*a); もOK
			double x = (double)(-b)/(2*a);
			System.out.println("重根です");
			System.out.println("x=" + x);
		} else {
			// 2虚根
			double re = (double)(-b)/(2*a);
			double im = Math.sqrt(-d)/(2*a);
			System.out.println(" 2虚根あります");
			System.out.println("x1=" + re + " +(" + im + ")i");
			System.out.println("x2=" + re + "-(" + im + ")i");
		}
	}
}

			// Math.sqrt(x) → ルートx
			// x*x → x2乗
			// Math.pow(x,100) → x100乗

