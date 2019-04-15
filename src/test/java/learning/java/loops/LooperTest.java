package learning.java.loops;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LooperTest {

    @ParameterizedTest
    @MethodSource("isPalindromeProvider")
    public void isPalindrome(int number, boolean result) {
        assertEquals(Looper.isPalindrome(number), result);
    }

    @ParameterizedTest
    @MethodSource("sumFirstAndLastDigitsProvider")
    public void sumFirstAndLastDigit(int number, int result) {
        assertEquals(Looper.sumFirstAndLastDigit(number), result);
    }

    @ParameterizedTest
    @MethodSource("getEvenDigitsSumProvider")
    public void getEvenDigitsSum(int number, int expected) {
        assertEquals(Looper.getEvenDigitsSum(number), expected);
    }

    @ParameterizedTest
    @MethodSource("hasSharedDigitProvider")
    public void hasSharedDigitProvider(int A, int B, boolean expected) {
        assertEquals(Looper.hasSharedDigit(A, B), expected);
    }

    @ParameterizedTest
    @MethodSource("hasSameLastDigitProvider")
    public void hasSameLastDigit(int A, int B, int C, boolean expected) {
        assertEquals(Looper.hasSameLastDigit(A, B, C), expected);
    }

    @ParameterizedTest
    @MethodSource("getGreatestCommonDivisorProvider")
    public void getGreatestCommonDivisor(int A, int B, int expected) {
        assertEquals(Looper.getGreatestCommonDivisor(A,B), expected);
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

    public static Stream<Arguments> sumFirstAndLastDigitsProvider() {
        return Stream.of(
                Arguments.arguments(252, 4),
                Arguments.arguments(257, 9),
                Arguments.arguments(0, 0),
                Arguments.arguments(5, 10),
                Arguments.arguments(-10, -1)
        );
    }

    public static Stream<Arguments> getEvenDigitsSumProvider() {
        return Stream.of(
            Arguments.arguments(123456789, 20),
            Arguments.arguments(252, 4),
            Arguments.arguments(-22, -1),
            Arguments.arguments(0, 0)
        );
    }

    public static Stream<Arguments> hasSharedDigitProvider() {
        return Stream.of(
            Arguments.arguments(12, 23, true),
            Arguments.arguments(9, 23, false),
            Arguments.arguments(15, 55, true)
        );
    }

    public static Stream<Arguments> hasSameLastDigitProvider() {
        return Stream.of(
            Arguments.arguments(41, 22, 71, true),
            Arguments.arguments(23, 32, 42, true),
            Arguments.arguments(9, 99, 999, false)
        );
    }

    public static Stream<Arguments> getGreatestCommonDivisorProvider() {
        return Stream.of(
            Arguments.arguments(12, 30, 6),
            Arguments.arguments(25, 15, 5),
            Arguments.arguments(9, 18, -1),
            Arguments.arguments(81, 153, 9)
        );
    }
}