public class ReverseInteger {
    public static void main(String[] args) {

        int s = 7321;

        System.out.println(reverse(s));
    }

    static int reverse(int num) {

        if (num <= Integer.MIN_VALUE || num >= Integer.MAX_VALUE)
            return 0;

        long rev = 0;

        while (num != 0) {
            int rem = num % 10;

            rev = rev * 10 + rem;

            num /= 10;
        }

        if (rev <= Integer.MIN_VALUE || rev >= Integer.MAX_VALUE)
            return 0;
        else
            return (int) rev;
    }
}