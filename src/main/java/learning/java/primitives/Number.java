package learning.java.primitives;

import java.util.Optional;


public class Number {

    /*
     *  For integers is safer to to to the bigger integer available
     */
    public Optional<Long> parsingIntegers(String value) {
        try {
            return Optional.of(Long.parseLong(value));
        }
        catch (Exception ex) {
            return Optional.empty();
        }
    }


    /*
     * For decimals is double
     */
    public Optional<Double> parsingDecimals(String value) {
        try {
            return Optional.of(Double.parseDouble(value));
        }
        catch (Exception ex) {
            return Optional.empty();
        }
    }
}
