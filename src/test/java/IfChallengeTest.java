import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IfChallengeTest {

    @Test
    public void testValidDays() {
        IfChallenge ifChallenge = new IfChallenge();

        assertEquals("Monday", ifChallenge.dayOfWeek(1));
        assertEquals("Tuesday", ifChallenge.dayOfWeek(2));
        assertEquals("Wednesday", ifChallenge.dayOfWeek(3));
        assertEquals("Thursday", ifChallenge.dayOfWeek(4));
        assertEquals("Friday", ifChallenge.dayOfWeek(5));
        assertEquals("Saturday", ifChallenge.dayOfWeek(6));
        assertEquals("Sunday", ifChallenge.dayOfWeek(7));
    }

    @Test
    public void testInvalidLowNumber() {
        IfChallenge ifChallenge = new IfChallenge();
        assertEquals("Not a valid day of week", ifChallenge.dayOfWeek(0));
    }

    @Test
    public void testInvalidHighNumber() {
        IfChallenge ifChallenge = new IfChallenge();
        assertEquals("Not a valid day of week", ifChallenge.dayOfWeek(8));
    }

    @Test
    public void testNegativeNumber() {
        IfChallenge ifChallenge = new IfChallenge();
        assertEquals("Not a valid day of week", ifChallenge.dayOfWeek(-3));
    }
}
