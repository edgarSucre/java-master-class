package learning.java.primitives;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    @Test
    public void intGetsAppendedToString() {
        assertEquals(12 + "10", "1210");
    }

    @Test
    public void stringRequiresExplicitTransform() {
        int sum = 12 + Integer.parseInt("10");
        assertEquals(sum, 22);
    }
}
