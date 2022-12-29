package basicAlgorithm;

import java.util.Scanner;

public class SumWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값: ");
        int n = scanner.nextInt();

        int sum = 0;
//        int i = 1;

//        1. while문 사용 방법
//        while (i <= n) {
//            sum += i;
//            i++;
//        }

//        2. for문 사용 방법

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }

}
