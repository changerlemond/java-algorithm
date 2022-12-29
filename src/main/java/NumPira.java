import java.util.Scanner;

public class NumPira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("숫자 피라미드를 출력합니다.");

        do {
            System.out.print("단수 입력: ");
            n = scanner.nextInt();
        } while(n <= 0);

        npira(n);
    }

    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }

}
