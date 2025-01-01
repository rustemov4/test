package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Sorted Array (Built-in Sort): " + Arrays.toString(array));
    }


}