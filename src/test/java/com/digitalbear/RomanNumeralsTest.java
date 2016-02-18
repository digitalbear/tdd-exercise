package com.digitalbear;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void number_1_is_I() {
        assertEquals("I", RomanNumerals.getRomanNumeral(1));
    }
}
