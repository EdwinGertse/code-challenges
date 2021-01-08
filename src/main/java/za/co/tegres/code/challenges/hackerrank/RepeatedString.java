package za.co.tegres.code.challenges.hackerrank;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * @author edwin.gertse
 */
public class RepeatedString {

    public int execute(String value, int numberOfChars, char letter) {
        Objects.requireNonNull(value);
        if (value.length() < 1 || value.length() > 100)
            throw new ArithmeticException("Value exceed range");
        if (numberOfChars < 1 || numberOfChars > (long)Math.pow(10, 12))
            throw new ArithmeticException("Number exceed range");

        String repeatedString = StringUtils.repeat(value, numberOfChars);
        String substring = repeatedString.substring(0, numberOfChars);

        int count = 0;
        for(char c : substring.toCharArray())
            if (Character.compare(c, letter) == 0)
                count++;
        return count;
    }
}
