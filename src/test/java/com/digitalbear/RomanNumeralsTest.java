package com.digitalbear;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    RomanNumerals roman;

    @Before
    public void createInstance() {
        roman = new RomanNumerals();
    }

    @Test
    public void check_number_1() {
        assertEquals("I", roman.getRomanNumeral(1));
    }

    @Test
    public void check_number_4() {
        assertEquals("IV", roman.getRomanNumeral(4));
    }
    @Test
    public void check_number_1000() {
        assertEquals("M", roman.getRomanNumeral(1000));
    }
    @Test
    public void check_number_2() {
        assertEquals("II", roman.getRomanNumeral(2));
    }
    @Test
    public void check_number_36() {
        assertEquals("XXXVI", roman.getRomanNumeral(36));
    }
    @Test
    public void check_number_42() {
        assertEquals("XLII", roman.getRomanNumeral(42));
    }
    @Test
    public void check_number_87() {
        assertEquals("LXXXVII", roman.getRomanNumeral(87));
    }
    @Test
    public void check_number_249() {
        assertEquals("CCXLIX", roman.getRomanNumeral(249));
    }
}
