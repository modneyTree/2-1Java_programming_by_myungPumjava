package chapter2;

/*
 * 소스파일: Hello.java
 */
public class Ex2_1기본구조 {
    public static int sum(int n, int m) {
        return n + m;
    }

    // main() 메소드에서 실행 시작
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 10); // sum() 메소드 호출
        a = '?';
        System.out.println(a); // 문자 '?' 화면 출력
        System.out.println("Hello"); // "Hello" 문자열 화면 출력
        System.out.println(s); // 정수 s 값 화면 출력
    }
}

/*
 * 만약 sum 메서드에 static이 없다면 => 객체를 생성하고 메서드 사용해야 한다.
 * 
 * public class Ex1_1기본구조 {
 * public int sum(int n, int m) {
 * return n + m;
 * }
 * 
 * // main() 메소드에서 실행 시작
 * public static void main(String[] args) {
 * int i = 20;
 * int s;
 * char a;
 * 
 * Ex1_1기본구조 ex = new Ex1_1기본구조(); // 객체 생성
 * s = ex.sum(i, 10); // sum() 메서드 호출
 * a = '?';
 * System.out.println(a); // 문자 '?' 화면 출력
 * System.out.println("Hello"); // "Hello" 문자열 화면 출력
 * System.out.println(s); // 정수 s 값 화면 출력
 * }
 * }
 * 
 */