package chapter3;

public class Calc {
	public static void main(String[] args) {
		double sum = 0.0;

		for (int i = 0; i < args.length; i++) // 인자 개수만큼 반복
			sum += Double.parseDouble(args[i]); // 문자열을 실수(double 타입)로 변환하여 합산

		System.out.println("sum = " + sum);
	}
}

// main() 명령형 인자로 전달된 문자열을 실수로 변환하여 합산하는 프로그램
// javac src/chapter3/Calc.java
// java -cp src chapter3.Calc 1.2 3.4 5.6
