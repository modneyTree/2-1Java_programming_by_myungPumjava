package chapter2;

/**
 * Ex1_9비트논리연산_비트시프트연산
 * 
 */
public class Ex2_9비트논리연산_비트시프트연산 {
    public static void main(String[] args) {
        short a = (short) 0x55ff; // 0101 0101 1111 1111
        short b = (short) 0x00ff; // 0000 0000 1111 1111
        // 비트 논리연산
        System.out.println("[비트 연산 결과]");
        System.out.printf("%04x\n", (short) (a & b)); // 비트 AND
        System.out.printf("%04x\n", (short) (a | b)); // 비트 OR
        System.out.printf("%04x\n", (short) (a ^ b)); // 비트 XOR
        System.out.printf("%04x\n", (short) (~a)); // 비트 NOT

        byte c = 20; // 0x14 = 0001 0100
        byte d = -8; // 0xf8 = 1111 1000 -> 정수 승격 연산 후 1111 1111 1111 1111 1111 1111 1111 1000

        // 비트 시프트연산
        System.out.println("[시프트 연산 결과]");
        System.out.println(c << 2); // c를 2비트 왼쪽 시프트 0101 0000 = 80
        System.out.println(c >> 2); // c를 2비트 오른쪽 시프트. 0 삽입, 0000 0101 = 5
        System.out.println(d >> 2); // d를 2비트 오른쪽 시프트. 1 삽입, 1111 1110 = -2
        System.out.printf("%x\n", (d >>> 2)); // d를 2비트 오른쪽 시프트. 0 삽입, 0011 1111 1111 1111 1111 1111 1111 1100
        // 3ffffffe = 0011 1111 1111 1111 1111 1111 1111 1110
    }
}