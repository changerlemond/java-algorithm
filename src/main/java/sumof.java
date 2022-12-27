public class sumof {

    static int sumOf(int a, int b) {

        int min;
        int max;
        int sum = 0;

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.println("총합: " + sum);
        return sum;
    }

}
