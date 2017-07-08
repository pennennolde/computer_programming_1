package zenkiTest;

public class Problem07 {

	public static void main(String[] args) {
		double a = 1;
        double b = 2;
        int stepSize = 1000;
        double h = (b-a)/stepSize;

        System.out.println("区間[a,b]を" + stepSize + "分割して定積分の近似値を求める：");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println();

        double area = 0;
        for ( int i = 0; i<stepSize; i++) {
        	double x = a + i*h;
        	double y = func( x );
        	double s = h*y;
        	area += s;
        }
        System.out.println(stepSize + "分割による定積分の近似値は、" + area);
    }

    static double func(double x) {
    	double y;
    	y = 10/(x+1) + Math.sqrt( Math.log( 2*x - 1 ) );
    	return y;
	}

}
