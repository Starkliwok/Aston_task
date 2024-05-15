package com.aston.task.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberConverterTest {
    @Test
    @DisplayName("Округление дробного числа, в случае если нет остатка")
    void roundNumber() {
        String actual = NumberConverter.roundNumber(2.2);
        String actual2 = NumberConverter.roundNumber(4);
        String actual3 = NumberConverter.roundNumber(5.0);
        String actual4 = NumberConverter.roundNumber(10.0001);

        assertThat(actual).isEqualTo("2.2");
        assertThat(actual2).isEqualTo("4");
        assertThat(actual3).isEqualTo("5");
        assertThat(actual4).isEqualTo("10.0001");
    }
}