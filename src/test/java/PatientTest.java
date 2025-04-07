import ie.atu.week12.Patient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PatientTest {
    @Test
    void testValidGivenName() {
        Patient p = new Patient("Mary", "Smith", "1234567891", 42);
        assertEquals("Mary", p.getGivenName());
    }

    @Test
    void testInvalidGivenName() {}
    Exception ex = assertThrows(IllegalArgumentException.class, () -> {
        new Patient("Ma", "Smith", "1234567891", 42);
    });
    assertEquals("Invalid given name length.", ex.getMessage());
}
