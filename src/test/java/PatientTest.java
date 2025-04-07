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
    void testShortGivenName() {
    Exception ex = assertThrows(IllegalArgumentException.class, () -> {
        new Patient("Ma", "Smith", "1234567891", 42);
    });
    assertEquals("Invalid given name length.", ex.getMessage());
}

    @Test
    void testValidFamilyName() {
    Patient p = new Patient ("Alice", "Brown", "9876543219", 23);
    assertEquals("Brown", p.getFamilyName());
    }

    @Test
    void testShortFamilyName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Patient("Alice", "Bro", "1234567891", 23);
        });
        assertEquals("Invalid family name length.", ex.getMessage());
    }

    @Test
    void testValidHSENumber() {
        Patient p = new Patient ("Bobby", "Gomez", "1358976535", 86);
        assertEquals("1358976535", p.getHseNumber());
    }

    @Test
    void testShortHSENumber() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Patient("Cathal", "Davin", "13254769", 16);
        });
        assertEquals("Invalid HSE number length.", ex.getMessage());
    }
}





