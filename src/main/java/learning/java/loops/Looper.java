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
    
}
