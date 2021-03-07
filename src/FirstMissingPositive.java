import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 0};

        System.out.println(firstMissingPositive(ints));

    }

    /*private static int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);

        ArrayList<Integer> num = new ArrayList<>();

        for (int j : nums) {
            num.add(j);
        }

        for (int i = 1; i < nums.length; i++) { //i < Integer.MAX_VALUE
            if (!num.contains(i))
                return i;
        }
        return 1;
    }*/

    private static int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);

        int minInt = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == minInt)
                minInt++;
        }
        return minInt;
    }

}
