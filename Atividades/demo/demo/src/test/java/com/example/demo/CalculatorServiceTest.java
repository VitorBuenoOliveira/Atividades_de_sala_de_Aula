package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void testAddition() {
        CalculatorResult result = service.calculate(5.0, 3.0, "+");
        assertEquals(5.0, result.getNum1());
        assertEquals(3.0, result.getNum2());
        assertEquals("+", result.getOperation());
        assertEquals(8.0, result.getResult());
        assertEquals("sucesso", result.getStatus());
    }

    @Test
    void testSubtraction() {
        CalculatorResult result = service.calculate(10.0, 4.0, "-");
        assertEquals(10.0, result.getNum1());
        assertEquals(4.0, result.getNum2());
        assertEquals("-", result.getOperation());
        assertEquals(6.0, result.getResult());
        assertEquals("sucesso", result.getStatus());
    }

    @Test
    void testMultiplication() {
        CalculatorResult result = service.calculate(7.0, 6.0, "*");
        assertEquals(7.0, result.getNum1());
        assertEquals(6.0, result.getNum2());
        assertEquals("*", result.getOperation());
        assertEquals(42.0, result.getResult());
        assertEquals("sucesso", result.getStatus());
    }

    @Test
    void testDivision() {
        CalculatorResult result = service.calculate(20.0, 4.0, "/");
        assertEquals(20.0, result.getNum1());
        assertEquals(4.0, result.getNum2());
        assertEquals("/", result.getOperation());
        assertEquals(5.0, result.getResult());
        assertEquals("sucesso", result.getStatus());
    }

    @Test
    void testDivisionByZero() {
        CalculatorResult result = service.calculate(10.0, 0.0, "/");
        assertEquals(10.0, result.getNum1());
        assertEquals(0.0, result.getNum2());
        assertEquals("/", result.getOperation());
        assertEquals(0.0, result.getResult());
        assertEquals("Erro: divisão por zero", result.getStatus());
    }

    @Test
    void testExponentiation() {
        CalculatorResult result = service.calculate(2.0, 3.0, "^");
        assertEquals(2.0, result.getNum1());
        assertEquals(3.0, result.getNum2());
        assertEquals("^", result.getOperation());
        assertEquals(8.0, result.getResult());
        assertEquals("sucesso", result.getStatus());
    }

    @Test
    void testInvalidOperation() {
        CalculatorResult result = service.calculate(5.0, 3.0, "%");
        assertEquals(5.0, result.getNum1());
        assertEquals(3.0, result.getNum2());
        assertEquals("%", result.getOperation());
        assertEquals(0.0, result.getResult());
        assertEquals("Erro: operação inválida", result.getStatus());
    }

    @Test
    void testNegativeNumbersAddition() {
        CalculatorResult result = service.calculate(-5.0, -3.0, "+");
        assertEquals(-5.0, result.getNum1());
        assertEquals(-3.0, result.getNum2());
        assertEquals("+", result.getOperation());
        assertEquals(-8.0, result.getResult());
        assertEquals("sucesso", result.getStatus());
    }

    @Test
    void testZeroMultiplication() {
        CalculatorResult result = service.calculate(0.0, 100.0, "*");
        assertEquals(0.0, result.getNum1());
        assertEquals(100.0, result.getNum2());
        assertEquals("*", result.getOperation());
        assertEquals(0.0, result.getResult());
        assertEquals("sucesso", result.getStatus());
    }

    @Test
    void testFractionalNumbers() {
        CalculatorResult result = service.calculate(1.5, 2.0, "*");
        assertEquals(1.5, result.getNum1());
        assertEquals(2.0, result.getNum2());
        assertEquals("*", result.getOperation());
        assertEquals(3.0, result.getResult());
        assertEquals("sucesso", result.getStatus());
    }

    @Test
    void testLargeNumbers() {
        CalculatorResult result = service.calculate(1000000.0, 2.0, "+");
        assertEquals(1000000.0, result.getNum1());
        assertEquals(2.0, result.getNum2());
        assertEquals("+", result.getOperation());
        assertEquals(1000002.0, result.getResult());
        assertEquals("sucesso", result.getStatus());
    }
}
