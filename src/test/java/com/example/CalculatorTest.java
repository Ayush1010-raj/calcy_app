package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.add(10,20));
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiply(5,4));
    }
}