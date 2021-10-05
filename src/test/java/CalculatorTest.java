import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println(">>BeforeEach setUp Starting>>");
        calculator = new Calculator();
        System.out.println("<<BeforeEach setUp Ending<<");

    }

    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        System.out.println(">>Test testMultiply Starting");
        assertEquals(20, calculator.multiply(4,5), "Regular multiplication should work)");
        System.out.println("<<Test testMultiply Ending");
    }

}
