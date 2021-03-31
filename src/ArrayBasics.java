public class ArrayBasics {
    public static void main(String[] args) {

//        int[] num = {12, 34, 5, 6, 89, 1, 112, 34, 96};
        int[] num = {1, 5, 6, 12, 34, 34, 89, 96, 112};

        int element = 96;

        int linearSearchIndex = linearSearch(num, element);

        int binarySearchIndex = binarySearch(num, element);

        int maxIndex = maxElement(num);

        System.out.println("Linear Search Index: " + linearSearchIndex);
        System.out.println("Binary Search Index: " + binarySearchIndex);

        System.out.println("Max Element Index: " + maxIndex);
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

        if (num == null || num.length == 0)
            return -1;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == element)
                return i;
        }
        return -1;
    }

    private static int maxElement(int[] num) {
        int maxIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > num[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }
}
