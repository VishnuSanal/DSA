public class ArrayBasics {
    public static void main(String[] args) {
//        int[] num = {12, 34, 5, 6, 89, 1, 112, 34, 96};
        int[] num = {1, 5, 6, 12, 34, 34, 89, 96, 112};

        int element = 112;

//        int requiredIndex = linearSearch(num, element);
        int requiredIndex = binarySearch(num, element);

        System.out.println("" + requiredIndex);
    }

    private static int binarySearch(int[] num, int element) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == element)
                return mid;
            else if (num[mid] > element)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    private static int linearSearch(int[] num, int element) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == element) return i;
        }
        return -1;
    }
}
