package practiceJava;

class DataSwapPractice {

	public static void main(String[] args) {

		int[] numbers = { 3, 5, 2, 5, 9, 1, 7, 4, 8, 1 };

		// 比べる2つを選択
		for ( int i = 1; i < numbers.length; i++) {

			// 小さい方の数がどこまで下がるかわからないからiをjに変える
			for ( int j = i; j > 0; j-- ) {

				// 小さければ交換。その下の数ともまた比較して、それを繰り返す。
				if ( numbers[j-1] > numbers[j] ) {
					int n = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = n;

					// 1回交換するたびに出力するなら必要
					for ( int a = 0; a<numbers.length; a++ ) {
						System.out.print( numbers[a] + " ");
					}
					System.out.println();

				} else {
					// 交換する必要がなければ、j--は必要ない。iに戻る。
					break;
				}
			}
		}
		for ( int a = 0; a<numbers.length; a++ ) {
			System.out.print( numbers[a] + " ");
		}
	}

}
