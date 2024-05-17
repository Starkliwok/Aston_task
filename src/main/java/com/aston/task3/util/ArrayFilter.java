package com.aston.task3.util;

import java.util.Arrays;

/**
 * Класс для фильтрации массивов
 * @author Денис Попов
 * @version 1.0
 */
public class ArrayFilter {

    private ArrayFilter() {}

    /**
     * Метод для получения массива с чётными числами из переданного массива
     * @param array Массив для фильтрации
     * @return отфильтрованный массив который не содержит нечётных чисел
     */
    public static int[] getArrayWithAllEvenNumbersInArray(int[] array) {
        return Arrays.stream(array).filter(x -> x%2 == 0).toArray();
    }
}
