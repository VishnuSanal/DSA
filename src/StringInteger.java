public class StringInteger {
    public static void main(String[] args) {

/*
        String s = "42"; //42
        String s = "-42"; //-42
        String s = "4193 with words"; //4193
        String s = "words and 987"; //987
        String s = "-91283472332"; //-2147483648
        String s = "9223372036854775808"; //2147483647
        String s = "-91283472332"; //-2147483648
        String s = "-2147483648"; //-2147483648
*/
        String s = "2147483647"; //2147483647

        System.out.println(myAtoi(s));
    }

    static int myAtoi(String s) {

        long result = 0;

        boolean isNegative = false;

        s = s.trim();

        if (s.equals(""))
            return 0;

        if (s.substring(0, 1).trim().equals("-")) {
            isNegative = true;
            s = s.substring(1);
        } else if (s.substring(0, 1).trim().equals("+")) {
            s = s.substring(1);
        }

        while (s.length() != 0) {

            if (s.substring(0, 1).matches("[0-9]")) {
                result = result * 10 + Integer.parseInt(s.substring(0, 1).trim());
            } else
                break;

            s = s.substring(1);

            if ((isNegative ? -result : result) <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            else if ((isNegative ? -result : result) >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }

        result = isNegative ? -result : result;

        if (result <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        else if (result >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        else
            return (int) result;
    }
}
