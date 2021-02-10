import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) {

        int[] ints = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(sortedSquares(ints)));

    }

    static int[] sortedSquares(int[] ints) {

        for (int j = 0; j < ints.length; j++) {
            ints[j] = ints[j] * ints[j];
        }
        Arrays.sort(ints);
        return (ints);
    }

}