package chapter4;

public class GarbageEx {
	@SuppressWarnings("unused") // 경고를 제거한다.
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null;
		d = c;
		c = null;
	}
}
