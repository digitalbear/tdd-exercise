package com.digitalbear;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void number_1_is_I() {
        assertEquals("I", RomanNumerals.getRomanNumeral(1));
        assertEquals("V", RomanNumerals.getRomanNumeral(5));
    }

    @Test
    public void checkNumbers() {
        assertEquals("IV", RomanNumerals.getRomanNumeral(4));
        //assertEquals("V", RomanNumerals.getRomanNumeral(6));
    }
    @Test
    public void checkNumbers1() {
        assertEquals("IV", RomanNumerals.getRomanNumeral(1000));
    }
}
