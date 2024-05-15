package com.aston.task.util;

/**
 * Класс взаимодействия с числами
 * @author Денис Попов
 * @version 1.0
 */
public class Calculator {

    /** Поле класса для паттерна Singleton*/
    private static Calculator calculator;

    private Calculator(){}

    /** Метод создает объект класса тогда, когда поле {@link #calculator} не имеет ссылки
     * @return объект класса
     */
    public static Calculator getInstance() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;
    }

    /** Метод выводит в консоль информацию, в случае если первое число больше второго - "a > b", в случае если первое
     * число меньше второго - "a < b", иначе - "a = b"
     * @param a первое число
     * @param b второе число
     */
    public void printDifferenceBetweenNumbers(double a, double b) {
        System.out.println(a > b ? "a > b" : a < b ? "a < b" : "a = b");
    }

    /** Метод складывает первое и второе число
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @return результат сложения
     */
    public double addingNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /** Метод вычитает из первого числа второе число
     * @param decreasing первое число
     * @param subtracted второе число
     * @return результат вычитания
     */
    public double subtracting(double decreasing, double subtracted) {
        return decreasing - subtracted;
    }

    /** Метод делит первое число на второе число
     * @param divisible первое число
     * @param divider второе число
     * @return результат деления
     */
    public double division(double divisible, double divider) {
        return divisible / divider;
    }

    /** Метод умножает первое число и второе число между собой
     * @param firstMultiplier первое число
     * @param SecondMultiplier второе число
     * @return результат умножения
     */
    public double multiplication(double firstMultiplier, double SecondMultiplier) {
        return firstMultiplier * SecondMultiplier;
    }
}
