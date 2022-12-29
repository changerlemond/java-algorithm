package basicAlgorithm;

import java.util.Scanner;

public class SumFor2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b;

        System.out.println("a의 값: ");
        int a = scanner.nextInt();

        while (true) {
            System.out.println("b의 값: ");
            b = scanner.nextInt();

            if (b > a) break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        System.out.println("b - a는 " + (b - a) + "입니다.");

    }

}
