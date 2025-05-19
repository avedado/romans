package edu.estatuas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {
    private String roman;
    private int decimalNum;
    private Pattern pattern;

    public Double toDecimal() {
        Matcher matcher= pattern.matcher(roman);
        int num=0;
        while (matcher.find()){
            String symbol = matcher.group();
        }


    }


}
