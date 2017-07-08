package sec04;

class LiteralExample {

	public static void main(String[] args) {
		int idt;

		idt = 022;
		System.out.println( idt );
		idt = 0x12AB;
		System.out.println( idt );
		// idt = 0b10100101 ; // ver.7だと使える
		// idt = 123_456_789; // ver.7だと使える

		double ddt;
		ddt = 5.67e4;	//指数は整数値
		System.out.println( ddt );


	}

}
