package learning.java.loops;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LooperTest {

    @ParameterizedTest
    @MethodSource("isPalindromeProvider")
    void isPalindrome(int number, boolean result) {
        assertEquals(Looper.isPalindrome(number), result);
    }

    public static Stream<Arguments> isPalindromeProvider() {
        return Stream.of(
                Arguments.arguments(12321, true),
                Arguments.arguments(12, false),
                Arguments.arguments(0, true),
                Arguments.arguments(11, true),
                Arguments.arguments(323354, false)
        );
    }
}