import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        int result = calculator.dif(8, 3);
        assertEquals(5, result);
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        int result = calculator.div(8, 2);
        assertEquals(4, result);
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        int result = calculator.times(4, 3);
        assertEquals(12, result);
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        int result = calculator.solver();
        assertEquals(2, result);  // (5 + 3) * 2 - 3 / 4 = 2
    }
}
