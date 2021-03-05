public class CheckDoubleExist {
    public static void main(String[] args) {

        int[] nums = new int[]{10, 2, 5, 3};

        System.out.println(checkIfExist(nums));

    }

    public static boolean checkIfExist(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j] * 2 || nums[i] * 2 == nums[j])
                    return true;
            }
        }
        return false;
    }
}
