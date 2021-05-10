public class PalindromeNumber {
    public static void main(String[] args) {

        int x = 0;

        System.out.println(isPalindrome(x));
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

    static boolean isPalindrome(int x) {
        if (x >= 0)
            return x == reverse(x);
        else
            return false;
    }
}
