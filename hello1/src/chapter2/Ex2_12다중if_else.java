package chapter2;

/**
 * Ex1_12다중if_else
 */
import java.util.Scanner;

public class Ex2_12다중if_else {
    public static void main(String[] args) {
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt(); // 점수읽기
        if (score >= 90) // score가 90 이상
            grade = 'A';
        else if (score >= 80) // score가80 이상 90 미만
            grade = 'B';
        else if (score >= 70) // score가70 이상 80 미만
            grade = 'C';
        else if (score >= 60) // score가60 이상 70 미만
            grade = 'D';
        else // score가60 이만
            grade = 'F';
        System.out.println("학점은 " + grade + "입니다.");
        scanner.close();
    }
}