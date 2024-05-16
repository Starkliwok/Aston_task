package com.aston.task2.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringComparerTest {

    @Test
    @DisplayName("Сравнение идентичных строк")
    void stringComparison_identical() {
        String first = "hello";
        String second = "hello";
        String expected = "Строки идентичны";

        String actual = StringComparer.stringComparison(first, second);

        assertThat(actual).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Сравнение идентичных строк без учёта регистра")
    void stringComparison_identical_IgnoreCase() {
        String first = "hello";
        String second = "Hello";
        String expected = "Строки идентичны без учёта регистра";

        String actual = StringComparer.stringComparison(first, second);

        assertThat(actual).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Сравнение неидентичных строк")
    void stringComparison_difference_Strings() {
        String first = "hi";
        String second = "Hello";
        String expected = "Строки неидентичны";

        String actual = StringComparer.stringComparison(first, second);

        assertThat(actual).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }
}