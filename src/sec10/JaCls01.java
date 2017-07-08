package sec10;

class JaCls01 {

	public static void main(String[] args) {
		Zaiko dt = new Zaiko();
		dt.setName("HDD1428");
		dt.setCount(30);
		System.out.println("在庫データの名前は" + dt.getName());
		dt.disp();
	}

}

class Zaiko {
	private String name;
	private int count;
	void setCount(int n) {
	if( n < 0 ) {
		count = 0;
	} else {
		count = n;
	}
}
	void disp() {
		System.out.println("名前："+name+" 個数："+count);
	}
}
class Zako {
	private String name;
	private int count;

	Zaiko() {
		this.name = "<noname>";
		this.
	}
}