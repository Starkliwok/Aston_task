package com.aston.task.out;

import com.aston.task.util.Calculator;
import com.aston.task.util.ConsoleReader;
import com.aston.task.util.NumberConverter;

/**
 * Класс взаимодействия с пользователем в консоли
 * @author Денис Попов
 * @version 1.0
 */
public class HomePage {

    /** Поле для вызова методов класса ${@link Calculator} при взаимодействии пользователя*/
    private final Calculator calculator = Calculator.getInstance();

    /**
     * Метод для взаимодействия пользователя с программой путем выбора действий вводом в консоль
     */
    public void printUserPage() {
        int choose;
        do {
            System.out.print("Выберите действие:\n" +
                    "1 - Отобразить отношение чисел\n" +
                    "2 - Отобразить результат сложения чисел\n" +
                    "3 - Отобразить результат вычитания\n" +
                    "4 - Отобразить результат деления\n" +
                    "5 - Отобразить результат умножения\n" +
                    "0 - Выход из приложения\n");
            choose = ConsoleReader.PageChoose();
            chooseAction(choose);
        } while (choose != 0);

        System.exit(0);
    }

    private void chooseAction(int choose) {
        Double outputResult = null;
        switch (choose) {
            case 1: {
                calculator.printDifferenceBetweenNumbers(
                        ConsoleReader.enterDoubleValue()
                        , ConsoleReader.enterDoubleValue());
                break;
            }
            case 2: {
                outputResult =
                        calculator.addingNumbers(ConsoleReader.enterDoubleValue(), ConsoleReader.enterDoubleValue());
                break;
            }
            case 3: {
                outputResult =
                        calculator.subtracting(ConsoleReader.enterDoubleValue(), ConsoleReader.enterDoubleValue());
                break;
            }
            case 4: {
                outputResult =
                        calculator.division(ConsoleReader.enterDoubleValue(), ConsoleReader.enterDoubleValue());
                break;
            }
            case 5: {
                outputResult =
                        calculator.multiplication(ConsoleReader.enterDoubleValue(), ConsoleReader.enterDoubleValue());
                break;
            }
            case 0: {
                break;
            }
            default: {
                System.out.println("Некорректный ввод данных, повторите попытку");
                printUserPage();
            }
        }
        if (outputResult != null) {
            System.out.println("Результат: " + NumberConverter.roundNumber(outputResult));
        }
    }
}
