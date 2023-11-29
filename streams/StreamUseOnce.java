package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUseOnce {
    public static void main(String[] args) {
        testStreamUseJustOnce();
    }

    static void testStreamUseJustOnce() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // khởi tạo stream
        Stream<Integer> streamInt = list.stream();
        List<Integer> list1 = streamInt.filter(item -> item > 1).collect(Collectors.toList());
        System.out.println(list1); // [2,3]

        // dùng lần 2
        List<Integer> list2 = streamInt.filter(item -> item > 1).collect(Collectors.toList()); // Lỗi : stream has
                                                                                               // already been operated
                                                                                               // upon or closed
        // Khăc phục bằng cách tạo mới stream mỗi lần sử dụng
        System.out.println(list2);
    }
}
