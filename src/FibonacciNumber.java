public class FibonacciNumber {

    public static void main(String[] args) {

        int n = 5;

        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}