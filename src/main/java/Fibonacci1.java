import java.util.ArrayList;
import java.util.List;

public class Fibonacci1 {

    public static void main(String[] args) throws OutOfRangeException {
        System.out.println(fibonacciN(94));
    }

    public static List<Long> fibonacciN(int N) throws OutOfRangeException {

        List<Long> list = new ArrayList<>();
        long n1 = 0;
        long n2 = 1;
        long n3;

        if (N == 0 || N == 1) {
            list.add((long) N);
        }
        if (N < 0 || N > 93) {
            throw new OutOfRangeException("Please, provide number in the range 0-93");
        }

        for (int i = 0; i < N; i++) {
            list.add(n1);
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        return list;
    }

    static class OutOfRangeException extends Exception {
        public OutOfRangeException(String message) {
            super(message);
        }
    }
}
