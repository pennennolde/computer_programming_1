package sec07;

class ArrayExample {

	public static void main(String[] args) {
		int[] a;
		a = new int[10];
		System.out.println("a[0]="+a[0]);
		a[0] = 100;
		System.out.println("a[0]="+a[0]);
		int[] b = {1,2,3,4,5,6,7,8,9};
		System.out.println("b[3]="+b[3]);
		int[] c;
		c = new int[]{1,2,3,4,5};
		System.out.println("c.length="+c.length);

		for(int i=0; i<c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();

		String d = "abcdefghijkl";
		System.out.println("d.length()="+d.length());

	}

}
