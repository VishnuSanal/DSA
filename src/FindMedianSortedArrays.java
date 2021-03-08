import java.util.Arrays;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] finalArray = new int[nums1.length + nums2.length];

        int l = finalArray.length;

        for (int i = 0; i < nums1.length; i++)
            finalArray[i] = nums1[i];


        for (int i = 0; i < nums2.length; i++)
            finalArray[nums1.length + i] = nums2[i];

        Arrays.sort(finalArray);

        if (l % 2 == 0)
            return (double) (finalArray[l / 2 - 1] + finalArray[l / 2]) / 2;
        else
            return (double) finalArray[(l + 1) / 2 - 1];
    }
}
