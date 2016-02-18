package com.digitalbear;


import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    static Map roman = new HashMap();

    public static String getRomanNumeral(int num) {
        roman.put("1", "I");
        return (String) roman.get("1");
    }
}
