import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 1};

        System.out.println(containsDuplicate(num));
    }

/*
    private static boolean containsDuplicate(int[] nums) {

            for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
*/

    private static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}
