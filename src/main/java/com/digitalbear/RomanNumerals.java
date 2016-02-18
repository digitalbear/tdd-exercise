package com.digitalbear;


import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    static Map roman = new HashMap();

    public static String getRomanNumeral(int num) {
        roman.put(1, "I");
        roman.put(4, "IV");
        roman.put(5, "V");

        return (String) roman.get(num);
    }
}
