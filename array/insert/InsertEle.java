package array.insert;

import java.util.Arrays;

public class InsertEle {
    private static int[] myArr = { 1, 2, 3, 4 };

    public InsertEle() {

    }

    public static void main(String[] args) {
        InsertEle insertEle = new InsertEle();

        insertEle.insertElement(myArr, 1, 100);
    }

    public int[] insertElement(int[] arr, int indexInsert, int valueInsert) {
        int[] arrOutput = new int[arr.length];
        try {
            if (indexInsert > arr.length) {
                System.out.println(" index không hợp lệ");

            }
            for (int i = 0; i < arr.length; i++) {
                if (i != indexInsert) {
                    arrOutput[i] = arr[i];
                } else {
                    arrOutput[i] = valueInsert;
                }
            }
            System.out.println("arrOutput" + Arrays.toString(arrOutput));
            return arrOutput;

        } catch (Exception e) {
            System.out.println("index khong hợp lệ");
            return null;
        }

    }
}
