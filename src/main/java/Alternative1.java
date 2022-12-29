import java.util.Scanner;

public class Alternative1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("홀수면 + 짝수면 - 로 표시합니다.");

        do {
            System.out.println("n의 값: ");
            n = scanner.nextInt();
        } while (n <= 0);

        if (n % 2 != 0) {
            System.out.print("+");
        } else {
            System.out.print("-");
        }

    }

}
