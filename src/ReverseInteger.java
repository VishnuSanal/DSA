public class ReverseInteger {
    public static void main(String[] args) {

        int s = 1237;

        System.out.println(reverse(s));
    }

    static int reverse(int num) {

        if (num <= Integer.MIN_VALUE || num >= Integer.MAX_VALUE)
            return 0;

        int i = String.valueOf(Math.abs(num)).length() - 1;

        int result = 0, temp;

        while (num != 0) {
            temp = num % 10;

            result += temp * Math.pow(10, i);

            num /= 10;

            i--;
        }

        if (result <= Integer.MIN_VALUE || result >= Integer.MAX_VALUE)
            return 0;
        else
            return result;
    }
}