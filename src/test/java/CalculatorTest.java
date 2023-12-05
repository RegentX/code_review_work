import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void dif() {
        assertEquals(1, calc.dif(4, 3), "4 - 3 should equal 1");
    }

    @Test
    void div() {
        assertEquals(2, calc.div(4, 2), "4 / 2 should equal 2");
        assertThrows(ArithmeticException.class, () -> calc.div(4, 0), "Division by zero should throw ArithmeticException");

    }

    @Test
    void times() {
        assertEquals(6, calc.times(2, 3), "2 * 3 should equal 6");
    }

    @Test
    void solver() {
        assertEquals(3, calc.solver(), "The result of the solver method should be 3");
    }
}
