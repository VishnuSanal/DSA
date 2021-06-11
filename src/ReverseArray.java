import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        reverseArray(new int[]{1, 2, 3, 4, 5, 6});
        reverseArray(new int[]{1});
        reverseArray(new int[]{});
        reverseArray(new int[]{0, 1, 2, 2, 3, 0, 4, 2});
    }

    static void reverseArray(int[] nums) {
        System.out.println(Arrays.toString(nums));

        int start = 0, end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(nums));
    }
}
