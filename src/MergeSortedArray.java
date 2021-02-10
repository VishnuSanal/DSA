import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};

        int m = 3, n = 2;

        System.out.println(Arrays.toString(mergeArray(num1, m, num2, n)));
    }

    private static int[] mergeArray(int[] num1, int m, int[] num2, int n) {

        for (int i = m; i < m + n + 1; i++) {
            num1[i] = num2[i - m];
        }
        Arrays.sort(num1);
        return (num1);
    }
}
