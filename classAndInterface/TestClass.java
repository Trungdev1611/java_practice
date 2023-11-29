package classAndInterface;

import java.util.Arrays;
import java.util.function.Consumer;

public class TestClass {
    int sum = 0;

    public static void main(String[] args) {
        System.out.println(test());
        ;
    }

    public static int test() {
        return Arrays.asList(1, 2).stream().reduce(0, (total, item) -> total + item);
    }

}