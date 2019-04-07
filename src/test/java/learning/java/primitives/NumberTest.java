package learning.java.primitives;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    public void numbersPrimitivesSupportUnderscore() {
        assertEquals(1032, 1_032);
        assertEquals(1032.56, 1_032.56);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"9999999999999", "99", "0.56", "400d", "NotANumber"})
    public void parsingNumbersFailOften(String argument) {
        Number number = new Number();
        long overflow;
        try{
            overflow = number.parsingIntegers(argument);
        }
        catch (NumberFormatException e) {
            //TODO: How to avoid try/catch nesting, with functional programming, Optional
            try{
                overflow = (long) number.parsingDecimals(argument);
            }
            catch (NumberFormatException e2) {
                overflow = 0;
            }

        }
        catch (Exception e) {
            overflow = 0;
        }

        assertTrue(overflow >= 0);
    }
}