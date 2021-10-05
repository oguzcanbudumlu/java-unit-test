import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AddressTest {

    private static Address address;

    @BeforeAll
    static void setUp() {
        address = new Address("oğuzcan", "budumlu");
    }

    @Test
    void groupedAssertios() {
        Assertions.assertAll("address name",
                () -> Assertions.assertEquals("oğuzcan", address.getFirstName()),
                () -> Assertions.assertEquals("budumlu", address.getLastName())
        );
    }

}
