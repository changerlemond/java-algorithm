package basicAlgorithm;

public class Min4 {

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        if (min > d)
            min = d;

        return min;
    }

}
