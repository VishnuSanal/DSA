public class StudentsDoingHomework {
    public static void main(String[] args) {

        int[] startTime = new int[]{1, 2, 3};
        int[] endTime = new int[]{3, 2, 7};
        int queryTime = 4;

        System.out.println(studentHW(startTime, endTime, queryTime));

    }

    public static int studentHW(int[] startTime, int[] endTime, int queryTime) {

        int count = 0;

        for (int i = 0; i < startTime.length; i++) {

            if (startTime[i] <= queryTime && queryTime <= endTime[i])
                count++;
        }

        return count;
    }
}
