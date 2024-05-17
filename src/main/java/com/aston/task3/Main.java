package com.aston.task3;

import com.aston.task3.util.ArrayFilter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(ArrayFilter.getArrayWithAllEvenNumbersInArray(array)));
    }
}
