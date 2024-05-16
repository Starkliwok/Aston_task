package com.aston.task2.util;

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
     * Метод для считывания строки, принимает значение минимальной длины считываемой строки
     * @return пользовательский ввод
     */
    public static String enterStringValue() {
        scanner.useDelimiter("\n");
        return scanner.next();
    }
}
