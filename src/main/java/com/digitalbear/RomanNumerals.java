package com.digitalbear;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    static Map<Integer,String> roman = new HashMap();
    static int[] ints = {1000, 900,500,400,100,90,50,40,10,9,5,4,1};
    static String[] numerals = {"M","CM","D","CD","C","XC","L","X","IX","V","IV","I"};

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

        for(int i = 0; i<ints.length ;i++){
            if(num >= ints[i]){
                num=num-ints[i];
                System.out.println(numerals[i]);
            }
        }
        return (String) roman.get(num);
    }
}
