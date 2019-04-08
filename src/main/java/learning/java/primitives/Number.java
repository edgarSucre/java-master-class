package learning.java.primitives;

import java.text.DecimalFormat;
import java.util.Optional;
import static java.util.Optional.empty;
import static java.util.Optional.of;


public class Number {

    /*
     *  For integers is safer to to to the bigger integer available
     */
    public Optional<Long> parsingIntegers(String value) {
        try {
            return of(Long.parseLong(value));
        }
        catch (Exception ex) {
            return empty();
        }
    }


    /*
     * For decimals is double
     */
    public Optional<Double> parsingDecimals(String value) {
        try {
            return of(Double.parseDouble(value));
        }
        catch (Exception ex) {
            return empty();
        }
    }

    public Optional<Double> roundUpScore(double score) {
        var wrapped = (Object) score;

        if (wrapped == null || score < 0) return empty();

        DecimalFormat ptyScoreFormater = new DecimalFormat("#.#");
        return parsingDecimals(ptyScoreFormater.format(score));
    }
}
