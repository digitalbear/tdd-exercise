package com.digitalbear;


public class RomanNumerals {

    static int[] ints = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static String[] numerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    String numeral = "";

    public String getRomanNumeral(int inputNumber) {
        while (inputNumber > 0){
            inputNumber = getNext(inputNumber, findFloorIndex(inputNumber));
        }
        return numeral;
    }

    public int getNext(int num, int floorIndex) {
        num = num - ints[floorIndex];
        numeral = numeral + numerals[floorIndex];
        return num;
    }

    public int findFloorIndex(int num){
        int index = 0;
        for(int i = 0; i < ints.length; i++) {
            if(num >= ints[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
