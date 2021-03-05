public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] ints = new int[]{1, 1, 0, 1, 1, 1};

        System.out.println(findMaxConsecutiveOnes(ints));
    }

    private static int findMaxConsecutiveOnes(int[] ints) {
        int current = 0, max = 0;

        for (int i : ints) {
            if (i == 1) {
                current++;
            } else {
                max = Math.max(current, max);
                current = 0;
            }
        }
        if (max < current) max = current;
        return max;
    }
}
