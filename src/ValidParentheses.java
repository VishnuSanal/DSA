@SuppressWarnings({"IfCanBeSwitch", "PointlessBooleanExpression"})
//TODO: Non working solution!
public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("{[]}"));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid(")(){}"));
        System.out.println(isValid("]"));

        boolean testCases =
                (isValid("{[]}") == true) &&
                        (isValid("()") == true) &&
                        (isValid("()[]{}") == true) &&
                        (isValid("(]") == false) &&
                        (isValid("([)]") == false) &&
                        (isValid("{[]}") == true) &&
                        (isValid(")(){}") == false) &&
                        (isValid("]") == false);

        System.out.println(testCases ? "Tests Passing" : "Tests Failing");

    }

    static boolean isValid(String s) {

        if (s.length() < 2)
            return false;

        while (s.length() != 0) {

            String charOne = s.substring(0, 1);

            String charNext = (s.length() >= 2) ? s.substring(1, 2) : "";

            String charEnd = s.substring(s.length() - 1);

            if ("(".equals(charOne)) {

                if (charEnd.equals(")")) {
                    s = s.substring(0, s.length() - 1);
                    s = s.substring(1);
                } else if (charNext.equals(")"))
                    s = s.substring(2);
                else
                    return false;

            } else if ("[".equals(charOne)) {

                if (charEnd.equals("]")) {
                    s = s.substring(0, s.length() - 1);
                    s = s.substring(1);
                } else if (charNext.equals("]"))
                    s = s.substring(2);
                else
                    return false;

            } else if ("{".equals(charOne)) {

                if (charEnd.equals("}")) {
                    s = s.substring(0, s.length() - 1);
                    s = s.substring(1);
                } else if (charNext.equals("}"))
                    s = s.substring(2);
                else
                    return false;
            } else
                return false;
        }

        return true;
    }
}