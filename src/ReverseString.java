import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        boolean testCases =

                logAndTest(
                        new char[]{'h', 'e', 'l', 'l', 'o'},
                        new char[]{'o', 'l', 'l', 'e', 'h'}
                )
                        &&
                        logAndTest(
                                new char[]{'H', 'a', 'n', 'n', 'a', 'h'},
                                new char[]{'h', 'a', 'n', 'n', 'a', 'H'}
                        )
                        &&
                        logAndTest(
                                new char[]{},
                                new char[]{}
                        );

        System.out.println(testCases ? "Tests Passing" : "Tests Failing");
    }

    static char[] reverseString(char[] chars) {

        int start = 0, end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];

            chars[start++] = chars[end];

            chars[end--] = temp;
        }

        return chars;
    }

    private static boolean logAndTest(char[] chars, char[] result) {

        char[] i = reverseString(chars);

        System.out.println(
                "logAndTest() called with: " +
                        "chars = [" + Arrays.toString(chars) + "], " +
                        "result = [" + Arrays.toString(result) + "], " +
                        "i = [" + Arrays.toString(i) + "]"
        );


        return Arrays.toString(chars).equals(Arrays.toString(i));
    }
}
