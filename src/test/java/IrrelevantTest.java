import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class IrrelevantTest {


    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        Exception exception1 = Assertions.assertThrows(NumberFormatException.class,
                () -> {
            Integer.parseInt("1a");
                });

        Exception exception2 = Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    Integer.parseInt("1a");
                });

        String expectedMessage = "For input string";
        String actualMessage = exception1.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void whenDerivedExceptionThrown_thenAssertionSucceds() {
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            Integer.parseInt("1a");
        });

        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void groupedAssertions() {

    }


}
