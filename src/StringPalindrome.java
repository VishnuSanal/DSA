import java.util.Locale;

public class StringPalindrome {

    public static void main(String[] args) {

        boolean testCases =

                logAndTest("abc", false)
                        &&
                        logAndTest("abba", true);

        System.out.println(testCases ? "Tests Passing" : "Tests Failing");
    }

    static boolean stringPalindrome(String s) {

        s = s.toLowerCase(Locale.ROOT);

        int start = 0, end = s.length() - 1;

        while (start < end)
            if (s.charAt(start++) != s.charAt(end--))
                return false;

        return true;
    }

    private static boolean logAndTest(String chars, boolean result) {

        boolean i = stringPalindrome(chars);

        System.out.println(
                "logAndTest() called with: " +
                        "chars = [" + chars + "], " +
                        "result = [" + result + "], " +
                        "i = [" + i + "]"
        );

        return i == result;
    }
}
