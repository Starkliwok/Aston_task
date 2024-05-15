package com.aston.task.util;

/**
 * Класс взаимодействия с числами
 * @author Денис Попов
 * @version 1.0
 */
public class NumberConverter {

    private NumberConverter() {}

    /**
     * Метод для округления дробного значения, метод отбрасывает дробное значение тогда, когда дробное значение нулевое
     * @param number дробное число
     * @return строка со значением округленного числа
     */
    public static String roundNumber(double number) {
        int roundNumber = (int) number;
        if(number == roundNumber) {
            return String.valueOf(roundNumber);
        }
        return String.valueOf(number);
    }
}
