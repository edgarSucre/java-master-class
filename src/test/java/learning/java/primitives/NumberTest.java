package learning.java.primitives;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.text.html.Option;

import java.util.Optional;

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
    public void parsingIntegerFailOfter(String argument) {
        Number number = new Number();
        Optional<Long> valueLong = number.parsingIntegers(argument);
        Long response = valueLong.orElse(0L);

        assertTrue(response >= 0);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"9999999999999", "99", "0.56", "400d", "NotANumber"})
    public void parsingDecimalsFailOften(String argument) {
        Number number = new Number();
        Optional<Double> valueLong = number.parsingDecimals(argument);
        Double response = valueLong.orElse(0d);

        assertTrue(response >= 0);
    }
}