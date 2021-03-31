import java.util.Arrays;

public class ValidMountainArray {
    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 4, 5, 2, 1, 0}; // -> true
//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // -> false
//        int[] arr = {3,5,5};// -> false
//        int[] arr = {2,1};// -> false

        System.out.println(Arrays.toString(arr));

        System.out.println("Return: " + validMountainArray(arr));
    }

    private static boolean validMountainArray(int[] arr) {

        if (arr.length < 3)
            return false;

        int maxIndex = maxElement(arr);

        if (maxIndex == 0 || maxIndex == arr.length - 1)
            return false;

        System.out.println("maxIndex: " + maxIndex + "\t" + arr[maxIndex]);

        for (int i = maxIndex; i < arr.length - 1; i++) {
            System.out.println("First Loop: " + i + " " + (arr[i + 1] > arr[i]));
            if (arr[i + 1] >= arr[i])
                return false;
        }

        for (int i = maxIndex; i > 0; i--) {
            System.out.println("Second Loop: " + i + " " + (arr[i - 1] > arr[i]));
            if (arr[i - 1] >= arr[i])
                return false;
        }

        return true;
    }

    private static int maxElement(int[] num) {
        int maxIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > num[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }
}
