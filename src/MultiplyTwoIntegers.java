import java.util.Arrays;
//TODO: Non working solution!
public class MultiplyTwoIntegers {

    public static void main(String[] args) {

        boolean testCases =
                logAndTest("2", "3", "6") &&
                        logAndTest("123", "456", "56088") &&
                        logAndTest("123456789", "987654321", "121932631112635269") &&
                        logAndTest("498828660196", "840477629533", "419254329864656431168468");

        System.out.println(testCases ? "Tests Passing" : "Tests Failing");
    }

    private static String multiply(String num1, String num2) {

        long oneAsInt = 0, twoAsInt = 0;

        char[] oneAsChar = num1.toCharArray(), twoAsChar = num2.toCharArray();

        System.out.println(Arrays.toString(oneAsChar) + " : " + Arrays.toString(twoAsChar));

        for (char c : oneAsChar) {
            oneAsInt = (oneAsInt * 10) + (c - '0');
        }

        for (char c : twoAsChar) {
            twoAsInt = (twoAsInt * 10) + (c - '0');
        }

        System.out.println(oneAsInt + " : " + twoAsInt);

        return String.valueOf(oneAsInt * twoAsInt);

    }

    private static boolean logAndTest(String num1, String num2, String result) {

        String i = multiply(num1, num2);

        System.out.println(
                "num1 = [" + num1 + "], " +
                        "num2 = [" + num2 + "]," +
                        " i = [" + i + "]" +
                        " result = [" + result + "]"
//                       + " => [" + (i.equals(result)) + "]"
        );

        return i.equals(result);
    }
}