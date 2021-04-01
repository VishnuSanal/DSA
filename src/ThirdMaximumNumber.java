import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 1}; //1
//        int[] arr = {1, 2}; //2
        int[] arr = {2, 2, 3, 1}; //1

        System.out.println(thirdMax(arr));
    }

    private static int thirdMax(int[] nums) {

        Arrays.sort(nums);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int num : nums)
            if (!integerArrayList.contains(num))
                integerArrayList.add(num);

        Collections.reverse(integerArrayList);

        return (integerArrayList.size() >= 3) ? integerArrayList.get(2) : integerArrayList.get(0);
    }
}

