package sec05;

class IncrementExample {

	public static void main(String[] args) {
		int a = 3;
		int b = a + (++a); print(a, b);

		a = 3; b = a + (++a); print(a, b);		// 7=3+4  a=4
		a = 3; b = a + (a++); print(a, b);		// 6=3+3  a=4
		a = 3; b = (++a) + a; print(a, b);		// 8=4+4  a=4
		a = 3; b = (a++) + a; print(a, b);		// 7=3+4  a=4
		a = 3; b = (a++) + (a--) + (++a); print(a, b);	// 11=3+4+4  a=14
		         // a=  3  4       4  3            4
		a = 3; b = (a++) + (++a) * (a--); print(a, b);	// 28=3+5*5  a=4

		a+=1;
		a++;
		++a;
		a = a+1;

		//sum += a[k++];

		//sum += a[k];
		//k++;

	}

	static void print(int a, int b) {
		System.out.println("a=" + a + ", b=" + b);
	}
}
