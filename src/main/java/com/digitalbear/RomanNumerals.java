package com.digitalbear;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    static Map<Integer,String> roman = new HashMap();
    static int[] ints = {1000, 900,500};

    public static String getRomanNumeral(int num) {
        roman.put(1, "I");
        roman.put(4, "IV");
        roman.put(5, "V");
        //int maxValueInMap= (int) Collections.(roman.keySet());
        /*for (Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }*/
        return (String) roman.get(num);
    }
}
