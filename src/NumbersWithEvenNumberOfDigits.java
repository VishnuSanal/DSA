public class NumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {

        int[] ints = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(ints));

    }

    static int findNumbers(int[] ints) {
        int n = 0;

        for (int i : ints) {
            if ((String.valueOf(i).length() % 2) == 0) n++;
        }
        return n;
    }
}
