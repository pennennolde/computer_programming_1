package sec05;

class ConnectStringsExample {

	public static void main(String[] args) {
		String s = "";
		s = s + "abc";
		s += "def";
		System.out.println( "s=" + s );
		System.out.println( s + 10 + 20 );
		System.out.println( s + (10 + 20) );
		System.out.println( 10 + 20 + s );
		System.out.println( "" + 10 + 20 + s );

		System.out.println();

		double a;
		double b;
		double c;
		a=10;
		b=3;
		c=a/b;
		System.out.println("c=" + c);

		double x;
		double y;
		double z;
		x=10.000;
		y=2;
		z=x/y;
		System.out.println("z=" +z);

		int m;
		double n;
		double l;
		m=5;
		n=2;
		l=m/n;
		System.out.println("l=" +l);

		int p =19;
		double q =10;
		double r =p%q;
		System.out.println("r=" +r);

		double i =5;
		 i +=i;
		 System.out.println("i=" +i);
		 ++i;
		 System.out.println("i=" +i);
		 i *= i;
		 System.out.println("i=" +i);
		 i *= 5;
		 System.out.println("i=" +i);


	}

}
