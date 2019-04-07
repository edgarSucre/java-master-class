package learning.java.primitives;

public class Number {

    /*
     *  For integers is safer to to to the bigger integer available
     */
    public long parsingIntegers(String value) {
        if (value == null || value.isEmpty()) return 0;
        return Long.parseLong(value);
    }


    /*
     * For decimals is double
     */
    public double parsingDecimals(String value) {
        if (value == null || value.isEmpty()) return 0;
        return Double.parseDouble(value);
    }
}
