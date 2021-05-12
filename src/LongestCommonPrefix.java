public class LongestCommonPrefix {
    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"reflower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));


        boolean testCases =

                (longestCommonPrefix(new String[]{"flower", "flow", "flight"}).equals("fl")) &&
                        (longestCommonPrefix(new String[]{"reflower", "flow", "flight"}).equals("")) &&
                        (longestCommonPrefix(new String[]{"dog", "racecar", "car"}).equals(""));

        System.out.println(testCases ? "Tests Passing" : "Tests Failing");

    }

    static String longestCommonPrefix(String[] strings) {

        strings = sort(strings);

        String itemOne = strings[0];

        for (int i = 1; i < strings.length; ) {
            if (strings[i].startsWith(itemOne))
                i++;
            else
                itemOne = itemOne.substring(0, itemOne.length() - 1);
        }

        return itemOne;
    }

    private static void swap(String[] nums, int j, int i) {
        String temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    private static String[] sort(String[] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (str[j].length() > str[j + 1].length())
                    swap(str, j, j + 1);
            }
        }
        return str;
    }
}