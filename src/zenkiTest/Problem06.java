package zenkiTest;

public class Problem06 {

	public static void main(String[] args) {
		double a = 1;
        double b = 2;
        int stepSize = 10;
        double h = (b-a)/stepSize;

        System.out.println("区間[a,b]を" + stepSize + "分割して関数値を求める：");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println();

        for(int i=0; i<=stepSize; i++) {
        	double x = a + i*h;
        	double y = func( x );
        	System.out.println("f(" +x+ ")=" +y );
        }
    }

    static double func(double x) {
    	double y;
    	y = 10/(x+1) + Math.sqrt( Math.log( 2*x - 1 ) );
    	return y;
	}

}
