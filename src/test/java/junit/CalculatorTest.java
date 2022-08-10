package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Test Ok") // If user wants to creat a new Test name!
    void add() {

        assertEquals(7,Calculator.add(3,4));
    }

    @Test
    void multiplex() {
        assertEquals(5,Calculator.multiplex(1,5));
    }
}