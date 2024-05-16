package com.aston.task2.out;

import com.aston.task2.util.ConsoleReader;
import com.aston.task2.util.StringComparer;

/**
 * Класс взаимодействия с пользователем в консоли
 * @author Денис Попов
 * @version 1.0
 */
public class HomePage {

    /**
     * Метод для взаимодействия пользователя с программой путем выбора действий вводом в консоль
     */
    public void printUserPage() {
        int choose = 1;
        while (choose != 0){
            System.out.print("Выберите действие:\n" +
                    "1 - Сравнить строки\n" +
                    "0 - Выход из приложения\n");
            choose = ConsoleReader.PageChoose();
            if (choose == 1) {
                System.out.println("Введите первую строку");
                String first = ConsoleReader.enterStringValue();
                System.out.println("Введите вторую строку");
                String second = ConsoleReader.enterStringValue();
                System.out.println(StringComparer.stringComparison(first, second));
            } else if (choose != 0){
                System.out.println("Некорректный ввод данных, повторите попытку");
            }
        }
        System.exit(0);
    }
}
