package Day5;

class Shape { // 슈퍼 클래스
	public Shapes next;
	public Shape() { next = null; }
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shapes {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line");
	}
}
class Rect extends Shapes {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shapes {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class MethodOverridingEx {
	static void paint(Shapes p) {
		p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출.
					// 동적 바인딩
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shapes());
		paint(new Line());
		paint(new Rect());
		paint(new DayCircle());
	}
}
