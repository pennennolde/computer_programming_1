package sec10;

class StackExample {

	public static void main(String[] args) {
		Stack stack = new Stack( 10 );
		stack.push( 7 );
		stack.push( 3 );
		stack.push( 5 );
		int d = stack.pop();
		System.out.println("取り出したのは" + d);
	}
}
// データ構造"スタック"
class Stack {
	int[] stack;
	int top;
	Stack(int max) {
		stack = new int[max];
		top = 0;
	}
	void push( int data ) {
		if( top < stack.length ) {
			stack[top] = data;
			top++;
			System.out.println("スタックに" + data + "をプッシュしました");
		} else {
			System.out.println("スタックがあふれたのでプッシュ失敗");
		}
	}
	int pop() {
		int data = 0;
		if( top > 0) {
			data = stack[top-1];
			top--;
		}
		return data;
	}
}