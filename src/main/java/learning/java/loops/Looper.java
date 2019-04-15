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

    public static int getEvenDigitsSum(int number) {
        if (number < 0) return -1;

        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += (lastDigit % 2 == 0) ? lastDigit : 0;
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int numA, int numB) {
        if (numA < 10 || numA > 99 || numB < 10 || numB > 99) return false;
        if (numA == numB) return true;

        int A1 = numA % 10;
        int A2 = numA / 10;
        int B1 = numB % 10;
        int B2 = numB / 10;

        return A1 == B1 || A1 == B2 || A2 == B1 || A2 == B2;
    }

    public static boolean hasSameLastDigit(int numA, int numB, int numC) {
        if (!isValid(numA) || !isValid(numB) || !isValid(numC)) return false;

        int lastA = numA % 10;
        int lastB = numB % 10;
        int lastC = numC % 10;

        return lastA == lastB || lastA == lastC || lastB == lastC;
    }

    public static boolean isValid(int number) {
        return number > 10 && number < 1000;
    }
}
