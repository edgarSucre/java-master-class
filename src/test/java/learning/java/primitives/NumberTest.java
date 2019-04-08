package learning.java.primitives;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberTest {

    Number number = new Number();

    @Test
    public void numbersPrimitivesSupportUnderscore() {
        assertEquals(1032, 1_032);
        assertEquals(1032.56, 1_032.56);
    }

    @ParameterizedTest
    @MethodSource("parseIntegerProvider")
    public void parsingIntegerFailOfter(String testCase, Long expected) {
        Optional<Long> valueLong = number.parsingIntegers(testCase);
        Long result = valueLong.orElse(0L);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("parseDecimalsProvider")
    public void parsingDecimalsFailOften(String testCase, Double expected) {
        Optional<Double> valueLong = number.parsingDecimals(testCase);
        Double result = valueLong.orElse(0d);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("roundUpTestProvider")
    public void roundUpTest(double testCase, double expected) {
        Optional<Double> roundedOpt = number.roundUpScore(testCase);
        var result = roundedOpt.orElse(0d);
        assertEquals(expected, result);
    }

    static Stream<Arguments> parseDecimalsProvider() {
      return Stream.of(
              Arguments.arguments("9999999999999", 9999999999999.0d),
              Arguments.arguments("99", 99.0d),
              Arguments.arguments("0.56", 0.56d),
              Arguments.arguments("400d", 400.0d),
              Arguments.arguments("NotANumber", 0d),
              Arguments.arguments(null, 0d),
              Arguments.arguments("", 0d)
      );
    }

    static Stream<Arguments> parseIntegerProvider() {
        return Stream.of(
                Arguments.arguments("9999999999999", 9999999999999L),
                Arguments.arguments("99", 99L),
                Arguments.arguments("0.56", 0L),
                Arguments.arguments("400d", 0L),
                Arguments.arguments("NotANumber", 0L),
                Arguments.arguments(null, 0L),
                Arguments.arguments("", 0L)
        );
    }

    static Stream<Arguments> roundUpTestProvider() {
        return Stream.of(
            Arguments.arguments(4.36, 4.4d),
            Arguments.arguments(3.26, 3.3d),
            Arguments.arguments(3.59, 3.6d),
            Arguments.arguments(0, 0.0d),
            Arguments.arguments(-1, 0.0d),
            Arguments.arguments(-1.9, 0.0d)
        );
    }
}