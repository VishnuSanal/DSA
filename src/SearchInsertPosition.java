public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 5, 6};
        int target = 5;

        System.out.println(searchInsert(nums, target));

    }

   private static int searchInsert(int[] nums, int target) {

        if (target < nums[0])
            return 0;

        if (target > nums[nums.length - 1])
            return nums.length;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target)
                return i;

            if (nums[i] < target && target < nums[i + 1])
                return i + 1;

        }
        return nums.length;
    }
}
