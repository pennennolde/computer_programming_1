package sec04;

class CastExample {

	public static void main(String[] args) {
		byte bdt = 100;
		int idt = bdt;		//これはキャストしなくてもOK

		idt = 100;
		// bdt = idt; これはNO
		bdt = (byte) idt;

		long ldt = 12345678901L;
		// idt = ldt; これはNO
		idt = (int) ldt;
		System.out.println( "idt=" + idt );

		double ddt =  1234.5678;
		float fdt;
		// fdt = ddt; これはNO
		fdt = (float) ddt;
		System.out.println( "fdt=" + fdt );



	}

}
