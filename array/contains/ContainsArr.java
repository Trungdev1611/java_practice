package array.contains;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ContainsArr {
    private static int[] arrPrimite = { 1, 2, 3 };
    private static String[] arrString = { "AB", "AC", "AD", "AE" };

    public static void main(String[] args) {
        checkArrayContainElement(arrPrimite, 1);
        checkArrContainsValue(arrString, 12);

        checkArrContainsValue(arrString, "AB");

        checkArrayListcontain(arrPrimite, 1);
        checkArrayListcontain(arrPrimite, 4);
        checkArrayListcontainStringg(arrString, "AB");
        checkStreamcontain(arrPrimite, 2);
    }

    // generic không áp dụng với primitive value nên ta phải viết một phương thức
    // bên dưới để áp dụng với primitive value

    public static boolean checkArrayContainElement(int[] arrayInput, int valueCompare) {
        boolean isContain = false;
        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i] == valueCompare) {
                isContain = true;
                break;
            }
        }
        System.out.println("checkArrayContainElement:::" + isContain);
        return isContain;
    }

    // ở đây ta viết thêm generic (nếu muốn sử dụng với primitive value như int thì
    // ta convert chúng sang Integer.....)
    public static <T> boolean checkArrContainsValue(T[] arrInput, T valueCompare) {
        boolean isContain = false;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].equals(valueCompare)) {
                isContain = true;
                break;
            }
        }
        System.out.println("checkArrayContainElement:::" + isContain);
        return isContain;
    }

    // nhưng lưu ý rằng bên trên dù ta đã generic checkArrContainsValue(arrString,
    // 12); dù 12 truyền vào không phải String nhưng java vẫn tự suy luận nó ra
    // Integer và không báo lỗi
    // nếu ta muốn java chặt chẽ ở chỗ này ta nên sử dụng
    // public static <T extends Comparable<T>> boolean checkArrContainsValue

    // với arrayList (đây ta vẫn dùng array rồi convert sang arrayList, nếu
    // arrayList luôn thì tiện)
    public static boolean checkArrayListcontain(int[] arrInput, int compareValue) {
        List<Integer> list = Arrays.asList(Arrays.stream(arrInput).boxed().toArray(Integer[]::new)); // convert sang
                                                                                                     // List Integer thì
                                                                                                     // mới dùng được
        boolean isContain = list.contains(compareValue);
        System.out.println("checkArrayListcontain:::" + isContain); // contains method
        return isContain;
    }

    public static boolean checkArrayListcontainStringg(String[] arrInput, String compareValue) {
        boolean isContain = Arrays.asList(arrInput).contains(compareValue);
        System.out.println("checkArrayListcontainStringg:::" + isContain); // contains method

        return isContain;
    }

    public static boolean checkStreamcontain(int[] arrInput, int compareValue) {
        IntStream stream1 = IntStream.of(arrInput);

        boolean isContain = stream1.anyMatch(item -> item == compareValue);
        System.out.println("checkArrayListcontainStringg:::" + isContain); // contains method

        return isContain;
    }
}
