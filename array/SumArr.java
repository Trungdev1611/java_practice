package array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumArr {
    int[] arr1 = { 1, 2, 3 };

    public static void main(String[] args) {
        SumArr sumArr = new SumArr();
        sumArr.forLoopArr();
        sumArr.forEachLoop();
        sumArr.streamSum();

    }

    public int forLoopArr() {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        System.out.println("forLoop:::" + sum);
        return sum;
    }

    public int forEachLoop() {
        int sum = 0;
        for (int i : arr1) {
            sum = sum + arr1[i - 1];
        }
        System.out.println("forEach:::" + sum);
        System.out.println("forEach:::" + sum);

        return sum;
    }

    public int streamSum() {
        IntStream arStream = Arrays.stream(arr1);

        int sum = arStream.reduce(0, (prev, next) -> {
            return prev + next;
        });

        System.out.println("stramsum:::" + sum);
        return sum;

    }

}
