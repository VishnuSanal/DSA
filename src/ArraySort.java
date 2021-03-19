import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] nums = {12, 34, 5, 6, 89, 1, 112, 34, 96};

        System.out.println(Arrays.toString(bubbleSort(nums)));

    }

    private static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1])
                    swap(nums, j, j + 1);
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
