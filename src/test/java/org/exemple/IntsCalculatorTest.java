package org.exemple;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Тестирование: IntsCalculator")

public class IntsCalculatorTest {

    private Ints calc;

    @BeforeEach
    void setUp() {
        calc = new IntsCalculator();
    }

    @Test
    @DisplayName("Проверка сложения")
    void sumTest() {
        assertEquals(12, calc.sum(5, 7));
    }

    @Test
    @DisplayName("Проверка умножения")
    void multTest() {
        assertEquals(35, calc.mult(5, 7));
    }

    @Test
    @DisplayName("Проверка возведения в степень")
    void Test() {
        assertEquals(8, calc.pow(2, 3));
    }

}
