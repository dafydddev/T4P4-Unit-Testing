package fi.utu.dafydd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        calculator.add(20);
        calculator.add(-5);
        assertEquals(15, calculator.getResult());
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.subtract(5);
        assertEquals(5, calculator.getResult());
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.multiply(3);
        assertEquals(15, calculator.getResult());
    }

    @Test
    void exponent() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.exponent(2);
        assertEquals(100, calculator.getResult());
    }

    @Test
    void reset() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.reset();
        assertEquals(0, calculator.getResult());
    }
}