package com.aston.task.util;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private static Calculator calculator;
    private static double a;
    private static double b;

    @BeforeAll
    static void getInstance() {
        calculator = Calculator.getInstance();
        a = 4.5;
        b = 76.2;
    }

    @Test
    @DisplayName("Печать результата сравнения а > b")
    void printDifferenceBetweenNumbers_firstGreaterThenSecond() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        calculator.printDifferenceBetweenNumbers(3, 2);

        assertThat("a > b").isEqualTo(outContent.toString().trim());
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Печать результата сравнения а = b")
    void printDifferenceBetweenNumbers_firstEqualsSecond() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        calculator.printDifferenceBetweenNumbers(2.1, 2.1);

        assertThat("a = b").isEqualTo(outContent.toString().trim());
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Печать результата сравнения а < b")
    void printDifferenceBetweenNumbers_firstLessThenSecond() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        calculator.printDifferenceBetweenNumbers(2, 2.1);

        assertThat("a < b").isEqualTo(outContent.toString().trim());
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Сложение чисел")
    void addingNumbers() {
        double expected = a + b;

        double actual = calculator.addingNumbers(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Вычитание чисел")
    void subtracting() {
        double expected = a - b;

        double actual = calculator.subtracting(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Деление чисел")
    void division() {
        double expected = a / b;

        double actual = calculator.division(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Умножение чисел")
    void multiplication() {
        double expected = a * b;

        double actual = calculator.multiplication(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}