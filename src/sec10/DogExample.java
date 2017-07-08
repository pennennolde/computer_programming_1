package sec10;

class DogExample {

	public static void main(String[] args) {
		Dog pochi = new Dog();
		pochi.name = "ぽち";
		pochi.age = 5;
		pochi.call();
		Dog kuro = new Dog();
		kuro.name = "くろ";
		kuro.age = 7;
		kuro.voice = "うぉん";
		kuro.call();
	}
}

class Dog {
	String name;
	int age;
	String kind;
	String color;
	String voice = "わん";
	// メソッド 引数&戻り値なし
	void call() {
		System.out.println(this.name + "は、" +this. voice +"と答える");
	}
}