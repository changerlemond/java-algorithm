package basicAlgorithm;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");

        System.out.println("a의 값: ");
        int a = scanner.nextInt();

        System.out.println("b의 값: ");
        int b = scanner.nextInt();

        System.out.println("c의 값: ");
        int c = scanner.nextInt();

        System.out.println("최댓값은 " + Max3Method.max3(a, b, c) + "입니다.");
    }
}

class Max3Method {
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }
}