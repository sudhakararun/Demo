package com.math.api.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoControllerTest {

    private DemoController mathController;

    @BeforeEach
    void setUp() {
        mathController = new DemoController();
    }

    // ➕ Addition Test
    @Test
    void testAdd() {
        double result = mathController.add(10, 5);
        assertEquals(15.0, result);
    }

    // ➖ Subtraction Test
    @Test
    void testSubtract() {
        double result = mathController.subtract(10, 4);
        assertEquals(6.0, result);
    }

    // ✖️ Multiplication Test
    @Test
    void testMultiply() {
        double result = mathController.multiply(3, 5);
        assertEquals(15.0, result);
    }

    // ➗ Division Test
    @Test
    void testDivide() {
        String result = mathController.divide(8, 2);
        assertEquals("4.0", result);
    }

    // ❌ Division by Zero Test
    @Test
    void testDivideByZero() {
        String result = mathController.divide(10, 0);
        assertEquals("Error: Division by zero is not allowed.", result);
    }

    // 🔢 Power Test
    @Test
    void testPower() {
        double result = mathController.power(2, 3);
        assertEquals(8.0, result);
    }

    

}
