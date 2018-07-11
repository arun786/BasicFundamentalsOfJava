package regularExpression;

import java.util.regex.Pattern;

/**
 * Created by Adwiti on 7/1/2018.
 */
public class PatternExample {
    private static Pattern pattern = Pattern.compile("[0-9]{6}");

    public static void main(String[] args) {
        String aNumber = "1234567";
        System.out.println(pattern.matcher(aNumber).matches());
    }
}
