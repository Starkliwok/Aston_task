package com.aston.task.util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс для считывания введённых данных пользователем
 * @author Денис Попов
 * @version 1.0
 */
public class ConsoleReader {

    /** Поле сканера, предназначенное для считывания введённых данных*/
    private static final Scanner scanner = new Scanner(System.in);

    private ConsoleReader() {}

    /**
     * Метод для считывания целочисленного значения, которое предназначено для выбора действий на различных панелях
     * @return пользовательский ввод, в случае ошибок преобразования возвращает -1
     */
    public static int PageChoose() {
        int choose;
        try {
            choose = scanner.nextInt();
        } catch (InputMismatchException exception) {
            choose = -1;
            scanner.next();
        }
        return choose;
    }

    /**
     * Метод для считывания числа с плавающей точкой
     * @return пользовательский ввод, в случае ошибок преобразования выводит сообщение об ошибке
     * и рекурсивно вызывает себя
     */
    public static double enterDoubleValue() {
        double value;
        System.out.print("Введите число: ");
        try {
            value = scanner.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Повторите попытку, введите целое или дробное число");
            scanner.next();
            return enterDoubleValue();
        }
        return value;
    }
}
