package main.practice.datastructure;


import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        Arrays.copyOf(array, 6);

        Arrays.stream(array).forEach(i -> System.out.println(i));

    }
}
