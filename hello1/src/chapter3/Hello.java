// main() 인자로 전달된 문자열을 출력하는 프로그램
package chapter3;

public class Hello {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) { // 명령행 인자의 개수만큼 반복
			String s = args[i];
			System.out.println(s); // 명령행 인자 출력
		}
	}
}
