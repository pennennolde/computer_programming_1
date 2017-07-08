
// フィールド
// コンストラクタ
// メソッド = 神様

package sec10;

class CylinderExample {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(5, 10);
		System.out.println("この円柱の半径は" + cylinder.getRadius());
		System.out.println("この円柱の高さは" + cylinder.getHeight());
		System.out.println("この円柱の体積は" + cylinder.volume());
		System.out.println("この円柱の表面積は" + cylinder.surfaceArea());
	}
}

// 円柱
class Cylinder {
	Circle base; // 底面をなす円
	Rectangle side; // 側面をなす長方形
	// コンストラクタ
	Cylinder(double r, double h) {
		base =new Circle(r);
		side = new Rectangle(h, base.circumstance());
	}
	// 底面の半径を返すメソッド
	double getRadius() {
		return this.base.radius;
	}
	// 側面の高さを返すメソッド
	double getHeight() {
		return this.side.height;
	}
	// 体積を返すメソッド
	double volume() {
		return this.base.area()*getHeight();
	}
	// 表面積を返すメソッド
	double surfaceArea() {
		return this. base.area()*2+this.side.area();
	}
}

// 円
class Circle {
	double radius; // 円の半径
	// コンストラクタ
	Circle(double r) {
		this.radius = r;
	}
	// 円の底面積を返すメソッド
	double area() {
		return radius*radius*Math.PI;
	}
	// 円の円周の長さを返すメソッド
	double circumstance() {
		return radius*2*Math.PI;
	}
}

// 長方形
class Rectangle {
	double height; // 長方形の縦
	double width; // 長方形の横
	// コンストラクタ
	Rectangle(double h, double w) {
		this.height = h;
		this.width= w;
	}
	// 長方形の面積メソッド
	double area() {
		return height*width;
	}
}
