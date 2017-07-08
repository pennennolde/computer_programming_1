
// 分割統治法

package sec10;

/*
 *  static 版 Quick Sort method
 */

class QuickSortExample {

	public static void main(String[] args) {
		int[] data = { 10, 47, 29, 10, 33, 4, 15, 21, 30, 6};

		// Qsort qs = new Qsort(); がない！
		Qsort.printData("ソート前：", data);
		Qsort.quickSort( data );
		Qsort.printData("ソート後：", data);
		double value = Math.cos(Math.PI/2);
	}
}

class Qsort {
	static void quickSort( int[] data ) {
		qsort(data, 0, data.length-1);
	}
	static void qsort(int[] data, int left, int right) {
		if(left <= right) {
			int middle = getMiddle(data, left, right);
			int l = left;
			int r = right;
			while( l <= r ) {
				while( data[l] < middle ) { l++; }
				while( data[r] > middle ) { r--; }
				if( l <= r ) {
					swap(data, l, r);
					l++;
					r--;
				}
				}
			qsort(data, left, r);
			qsort(data, l, right);
		}
	}

	static int getMiddle(int[] data, int left, int right) {
		return data[left];
	}

	static void swap(int[] data, int l, int r) {
		int temp = data[l];
		data[l] = data[r];
		data[r] = temp;
	}

	static void printData(String mess, int[] data) {
		System.out.print( mess );
		for(int i=0; i<data.length; i++) {
			System.out.print( data[i] + " " );
		}
		System.out.println();
	}
}