package chapter2;

/**
 * Ex1_10if문
 */
import java.util.Scanner;

public class Ex2_10if문 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를입력하시오: ");
        int score = scanner.nextInt();
        if (score >= 80)
            System.out.println("축하합니다! 합격입니다.");
        scanner.close();
    }
}