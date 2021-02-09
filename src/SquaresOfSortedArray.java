import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SquaresOfSortedArray {

    public static void main(String[] args) {

        int[] ints = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(sortedSquares(ints)));

    }

    static int[] sortedSquares(int[] ints) {

        for (int j = 0; j < ints.length; j++) {
            ints[j] = ints[j] * ints[j];
        }
        return sortArray(ints);
    }

    private static int[] sortArray(int[] ints) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i : ints) {
            integerArrayList.add(i);
        }

        Collections.sort(integerArrayList);

        for (int i = 0; i < integerArrayList.size(); i++) {
            ints[i] = integerArrayList.get(i);
        }
        return ints;
    }
}