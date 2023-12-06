package array.removeindex;

import java.util.Arrays;

//khi muốn xóa hoặc thêm phần tử trong mảng, ta nên sử dụng arrayList (Collection), không nên sử dụng array vì array không hỗ trợ các phương thức xóa và thêm trực tiếp
//việc biến đổi với array sẽ gây khó khăn
public class RemoveIndex {
    static int[] arr = { 1, 2, 5, 7, 8, 9 };

    public static void main(String[] args) {
        // removeElementInArr(arr, 2);
        removeElementInArr2(arr, 2);
    }

    public static int[] removeElementInArr(int[] arrayInput, int index) {
        int[] arrCopy = new int[arrayInput.length - 1];

        int j = 0;
        for (int i = 0; i < arrayInput.length; i++) {
            if (i != index) {
                arrCopy[j] = arrayInput[i];
                j++;
            }

        }
        System.out.println("arr" + Arrays.toString(arr));
        System.out.println("arrCopy" + Arrays.toString(arrCopy));

        return arrCopy;
    }

    public static int[] removeElementInArr2(int[] arrayInput, int index) {
        int[] arrCopy = new int[arrayInput.length - 1];

        System.arraycopy(arrayInput, 0, arrCopy, 0, index); // copy các phần tử từ 0 đến index tử mảng nguồn sang từ 0
                                                            // đến
                                                            // index mảng đích //[1,2]

        System.arraycopy(arrayInput, index + 1, arrCopy, index, arrayInput.length - 1 - index); // copy các phần tử từ
        // index + 1 đến cuối [1,2,7,8,9]

        System.out.println("arr2 " + Arrays.toString(arr));
        System.out.println("arrCopy2 " + Arrays.toString(arrCopy));
        return arrCopy; // sẽ bỏ qua phần tử ở vị trí index
    }
}
