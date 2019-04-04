package learning.java.index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaceHolderTest {

    @Test
    void testThis() {
        var placeholder = new PlaceHolder();
        assertEquals(placeholder.testThis(), "pass");
    }
}