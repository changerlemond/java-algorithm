import java.util.Scanner;

public class DigitsNo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.println("정숫값: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int no = 0;

        while (n > 0) {
            n /= 10;
            no++;
        }

        System.out.println("그 수는 " + no + "자리입니다.");
    }
}
