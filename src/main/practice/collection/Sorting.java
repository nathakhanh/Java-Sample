package main.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(22);
        list.add(15);

        Collections.sort(list);

        list.stream().forEach(i -> System.out.print(i + " "));
        System.out.println();

        int[] arrays = new int[]{5,4,7,8,3,1};

        Arrays.sort(arrays);

        Arrays.stream(arrays).forEach(i -> System.out.print(i + " "));


    }
}
