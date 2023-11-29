package Predicate;

import java.util.function.BiPredicate;

public class PredicateExaple {
    public static void main(String[] args) {
        testBiPredicate();
    }

    public static void testBiPredicate() {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(4, 3));
    }
}
