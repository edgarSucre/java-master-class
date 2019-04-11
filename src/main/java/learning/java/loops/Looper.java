package learning.java.loops;

public class Looper {

    public static boolean isPalindrome(int number) {

        int absNumber = Math.abs(number);
        int first = 0;
        while(absNumber > 0) {
            int last = absNumber % 10;
            first = (first * 10) + last;
            absNumber /= 10;
        }

        return  number == first;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int last = number % 10;
        int first = number % 10;
        while (number > 0) {
            first = number % 10;
            number /= 10;
        }
        return last + first;
    }
}
