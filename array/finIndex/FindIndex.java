package array.finIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindIndex {
    private static int[] arr1 = { 1, 2, 3, 4 };

    private static String[] arStrings = { "AB", "AC", "AD" };

    public static void main(String[] args) {
        FindIndex obj1 = new FindIndex();
        obj1.findIndexArr(arr1, 2);
        obj1.findIndexArr(arr1, 10);

        obj1.findIndexArr(arStrings, "AD");

        obj1.findIndexArr2(arr1, 2);
        obj1.findIndexArr2(arr1, 10);

        obj1.findStrean(arr1, 2);
        obj1.findStrean(arr1, 10);

    }

    public int findIndexArr(int[] arr, int valuefind) {
        int indexFind = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valuefind) {
                indexFind = i;
            }
        }
        System.out.println(indexFind);
        return indexFind;
    }

    public int findIndexArr(String[] arr, String valuefind) {
        int indexFind = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(valuefind)) {
                indexFind = i;
            }
        }
        System.out.println("FindString::::" + indexFind);
        return indexFind;
    }

    public int findIndexArr2(int[] arr, int valuefind) {
        List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
        int indexFind = list.indexOf(valuefind);
        System.out.println(indexFind);

        return indexFind;
    }

    public int findStrean(int[] arr, int valuefind) {
        int indexFind = IntStream.range(0, arr.length) // tạo ra mảng các chỉ số từ 0 đến arr.length
                .filter(index -> arr[index] == valuefind)
                .findFirst().orElse(-1);
        System.out.println(indexFind);

        return indexFind;
    }
}
