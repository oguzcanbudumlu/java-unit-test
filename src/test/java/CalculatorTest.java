import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        System.out.println(">>Test testMultiplyWithZero Starting");
        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
        System.out.println("<<Test testMultiplyWithZero Starting");
    }


    @Test
    @DisplayName("Any test")
    void test() {
        assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "
                + "to avoid constructing complex messages unnecessarily." );
    }


}
