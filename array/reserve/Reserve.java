package array.reserve;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reserve {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reserve1(arr);

        Integer[] arIntegers = { 1, 2, 3, 4, 5 };
        reserve2(arIntegers);
    }

    public static int[] reserve1(int[] arrInput) {
        int[] arrReturn = new int[arrInput.length];
        int j = 0;
        for (int i = (arrInput.length - 1); i >= 0; i--) {
            arrReturn[j] = arrInput[i];
            j++;
        }

        System.out.println("reserve1::" + Arrays.toString(arrReturn)); // [5, 4, 3, 2, 1]
        return arrReturn;
    }

    // từ array của kiểu dữ liệu tham chiếu => chuyển qua list => khi sang list rồi
    // thì mới áp dụng collection được

    public static List<Integer> reserve2(Integer[] arrInput) {
        List<Integer> listInteger = Arrays.asList(arrInput);

        // đảo ngược List
        Collections.reverse(listInteger);

        System.out.println("listInteger::" + listInteger.toString()); // [5, 4, 3, 2, 1]
        return listInteger;
    }
}
