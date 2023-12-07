package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class removeElement {
    private static List<Integer> arrList1 = new ArrayList<>();
    private static List<String> arrList2 = new ArrayList<>();
    private static List<String> arrList3 = new ArrayList<>();

    public removeElement() {
        arrList1.add(1);
        arrList1.add(2);
        arrList1.add(3);
        arrList1.add(4);
        arrList1.add(5);

        arrList2.add("string1");
        arrList2.add("string2");
        arrList2.add("string3");
        arrList2.add("string4");

        arrList3.add("string1");
        arrList3.add("string2");
        arrList3.add("string3");
        arrList3.add("string4");

    }

    public static void main(String[] args) {
        removeElement removeElement = new removeElement();
        removeElement.removeIndex(arrList1, 1); // [1, 3, 4, 5]
        removeElement.removeIndex(arrList1, 1); // [1, 4, 5]

        removeElement.removeIndex(arrList2, 1); // [string1, string3, string4]
        removeElement.removeIndex(arrList2, 1); // [string1, string4]

        removeElement.removeElementDefine(arrList3, "string1"); // [string2, string3, string4]
        removeElement.removeElementDefine(arrList3, "string2"); // [string3, string4]

    }

    public <T> List<T> removeIndex(List<T> listInput, int indexRemove) {
        listInput.remove(indexRemove);
        System.out.println(listInput.toString());
        return listInput;
    }

    public List<String> removeElementDefine(List<String> list1, String textRemove) {

        List<String> list2 = list1.stream().filter(item -> !item.equals(textRemove)).collect(Collectors.toList());
        System.out.println("list2:::" + list2.toString());
        return list2;
    }

}
