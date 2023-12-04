package array;

import java.util.Arrays;
import java.util.Comparator;

public class Practice1 {
    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3, 4, 6, 5, 9, 8, 4 };
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("arr1:::" + Arrays.toString(arr1));

        // sắp xếp tăng dần
        Arrays.sort(arr2);
        System.out.println("arr2:::" + Arrays.toString(arr2));

        // copy arr2
        Integer[] arr2Copy = Arrays.copyOf(arr2, arr2.length);

        // sắp xếp giảm dần
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                // Return -1 to indicate that elements should be swapped for descending order
                return b.compareTo(a);
            }
        });

        System.out.println("arr2 sau:::" + Arrays.toString(arr2));

        // sắp xếp giảm dần
        Comparator<Integer> test = Comparator.reverseOrder();
        Arrays.sort(arr2Copy, test.reversed());
        System.out.println("arr2Copy :::" + Arrays.toString(arr2Copy));
        System.out.println(11111);
    }
}
