package com.aston.task2.util;

/**
 * Класс для сравнения строк
 * @author Денис Попов
 * @version 1.0
 */
public class StringComparer {

    private StringComparer() {
    }

    /**
     * Метод для сравнения строк
     * @param first Первая строка для сравнения
     * @param second Вторая строка для сравнения
     * @return Результат сравнения - "Строки идентичны" в случае если строки идентичны, "Строки неидентичны"
     * в случае если строки неидентичны, "Строки идентичны без учёта регистра" в случае если строки идентичны без
     * учёта регистра
     */
    public static String stringComparison(String first, String second) {
        return first.equals(second) ? "Строки идентичны" : first.equalsIgnoreCase(second)
                ? "Строки идентичны без учёта регистра" : "Строки неидентичны";
    }
}
