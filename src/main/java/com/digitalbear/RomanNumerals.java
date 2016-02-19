package com.digitalbear;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {


    static int[] ints = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static String[] numerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};



    public static String getRomanNumeral(int num) {
        String retVal="";
        while (num > 0){
        for(int i = 0; i<ints.length ;i++){
            if(num >= ints[i]){
                num=num-ints[i];
                retVal=retVal+ numerals[i];
            }
        }}
        return retVal;

    }
}
