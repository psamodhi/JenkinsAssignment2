import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualToFour() {
        var calculator = new SimpleCalculator();
        int result = calculator.add(2, 2);
        assertEquals(4, result);
        }
    }

