package junittests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import testing.Calculator;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        // Arrange
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete.");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }
}
