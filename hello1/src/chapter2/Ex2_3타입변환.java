package chapter2;

/**
 * Ex1_3타입변환
 */
public class Ex2_3타입변환 {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;
        System.out.println(b + i); // 227, int로 변환되어 계산
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        System.out.println((char) 0x12340041); // 0x41 = 'A'
        System.out.println((byte) (b + i)); // 227 - 256 = -29
        System.out.println((int) 2.9 + 1.8);
        System.out.println((int) (2.9 + 1.8));
        System.out.println((int) 2.9 + (int) 1.8);
    }
}