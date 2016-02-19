package com.digitalbear;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void check_number_1() {
        assertEquals("I", RomanNumerals.getRomanNumeral(1));
    }

    @Test
    public void check_number_4() {
        assertEquals("IV", RomanNumerals.getRomanNumeral(4));
    }
    @Test
    public void check_number_1000() {
        assertEquals("M", RomanNumerals.getRomanNumeral(1000));
    }
    @Test
    public void check_number_2() {
        assertEquals("II", RomanNumerals.getRomanNumeral(2));
    }
    @Test
    public void check_number_36() {
        assertEquals("XXXVI", RomanNumerals.getRomanNumeral(36));
    }
}
