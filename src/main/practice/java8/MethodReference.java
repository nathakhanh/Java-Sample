package main.practice.java8;

import java.util.*;
import java.util.function.BiPredicate;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);

        // Using an anonymous class
        findNumbers(list, new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer i1, Integer i2) {
                return MethodReference.isMoreThanFifty(i1, i2);
            }
        });

        // Using a lambda expression
        findNumbers(list, (i1, i2) -> MethodReference.isMoreThanFifty(i1, i2));

        // Using a method reference
        findNumbers(list, MethodReference::isMoreThanFifty);

    }

    public static boolean isMoreThanFifty(int n1, int n2) {
        return (n1 + n2) > 50;
    }

    public static List<Integer> findNumbers(List<Integer> l, BiPredicate<Integer, Integer> p) {
        List<Integer> newList = new ArrayList<>();
        for(Integer i : l) {
            if(p.test(i, i + 10)) {
                newList.add(i);
            }
        }
        return newList;
    }
}
