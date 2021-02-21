import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] num = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
//        int[] num = new int[]{1, 5, 2, 0, 6, 8, 0, 6, 0};
//        int[] num = new int[]{1,2,3};
//        int[] num = new int[]{0, 0, 0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(duplicateZeroes(num)));
    }

    private static int[] duplicateZeroes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {

                for (int j = arr.length - 1; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                if (i < arr.length - 1)
                    arr[i + 1] = 0;
                i++;
            }
        }
        return arr;
    }
}
