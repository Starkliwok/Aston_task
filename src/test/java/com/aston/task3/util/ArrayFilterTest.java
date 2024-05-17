package com.aston.task3.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayFilterTest {

    @Test
    @DisplayName("Метод должен вернуть массив с чётными числами из переданного массива")
    void getArrayWithAllEvenNumbersInArray() {
        int[] array = new int[] {1, 2, 6, 7, 9, 3, 12};
        int[] expected = new int[] {2, 6, 12};
        int[] actual;

        actual = ArrayFilter.getArrayWithAllEvenNumbersInArray(array);

        assertThat(actual).containsOnly(expected);
    }

    @Test
    @DisplayName("Метод должен вернуть пустой массив если переданный массив полностью состоит из нечётных чисел")
    void getArrayWithAllEvenNumbersInArray_With_Empty_Arrays() {
        int[] array = new int[]{1, 3, 5, 7, 11, 15, 19, 53};
        int[] expected = new int[]{};
        int[] actual;

        actual = ArrayFilter.getArrayWithAllEvenNumbersInArray(array);

        assertThat(actual).containsOnly(expected);
    }
}