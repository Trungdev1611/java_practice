package array.average;

public class Average {
    private static int[] arr1 = { 1, 2, 5 };

    public static void main(String[] args) {
        Average average = new Average();
        average.averageResult(arr1);
    }

    public double averageResult(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        System.out.println("averageFor::" + average);
        return average;
    }
}
