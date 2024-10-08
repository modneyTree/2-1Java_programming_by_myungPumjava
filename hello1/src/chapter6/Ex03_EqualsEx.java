package chapter6;

class Point3 {
	private int x, y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object obj) {
		Point3 p = (Point3) obj; // 객체 obj를 Point3 타입으로 다운 캐스팅
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class Ex03_EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);
		if (a == b) // false
			System.out.println("a==b");
		if (a.equals(b)) // true
			System.out.println("a is equal to b");
		if (a.equals(c)) // false
			System.out.println("a is equal to c");
	}
}