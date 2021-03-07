import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {

        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    private static int[] searchRange(int[] nums, int target) {

        int[] position = new int[]{-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                if (position[0] == -1) {
                    position[0] = i;
                    position[1] = i;
                } else
                    position[1] = i;
        }
        return position;
    }

}