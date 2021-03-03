public class IsMonotonic {
    public static void main(String[] args) {

        int[] num = new int[]{1, 2, 2, 3};

        System.out.println(isMonotonic(num));

    }

    public static boolean isMonotonic(int[] nums) {

        boolean isIncreasing = true, isDecreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1])
                isDecreasing = false;
            if (nums[i] > nums[i + 1])
                isIncreasing = false;

        }
        return isIncreasing || isDecreasing;
    }
}
