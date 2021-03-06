package com.javaTraining.strings;

/**
 * Created by Brian on 10/10/2017.
 */
public class SubStringHelper {

    // AACD -> CD, ACD => CD, CDED => CDEF, CDAA => CDAA
    public String truncateAInFirst2Positions(String str) {
        if (str.length() <= 2)
            return str.replaceAll("A", "");

        String first2Chars = str.substring(0, 2).toUpperCase();
        String stringMinusFirst2Chars = str.substring(2).toUpperCase();

        return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
    }

    // ABCD = false, ABAB = true, AB = true, A = false
    public boolean areFirstAndLast2CharsTheSame(String str) {
        if (str.length() <= 1)
            return false;
        if (str.length() == 2)
            return true;

        String first2Chars = str.substring(0, 2);
        String last2Chars = str.substring(str.length() - 2);

        return first2Chars.equals(last2Chars);

    }


}
