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

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;

        int sum = 0;
        while (number > 0) {
            int even = number % 10;
            sum += (even % 2 == 0) ? even : 0;
            number /= 10;
        }
        return sum;
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
        return number >= 10 && number <= 1000;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        int minimun = 0;
        int i = 1;
        while (i <= first && i <= second) {
            if (first % i == 0 && second % i == 0) {
                minimun = i;
            }
            i++;
        }
        return minimun;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int i = 1;
        int sum = 0;
        while (i < number) {
            sum += (number % i == 0) ? i : 0;
            i++;
        }
        return sum == number;
    }

    /**
     *
     * @param bigCount represents 5 kilos bag
     * @param smallCount represents 1 kilo bag
     * @param goal represents the amount of kilos needed to assemble a package
     * @return
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        if (smallCount >= goal) return true;

        int needed = goal / 5;
        int big = (bigCount >= needed) ? needed : bigCount;
        return big * 5 + smallCount >= goal;
    }
}
