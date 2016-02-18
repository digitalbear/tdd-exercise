package com.digitalbear;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LeapYearTest {

    @Test
    public void nineteen_ninety_six_is_a_leap_year() {
        int year = 1996;
        assertTrue(LeapYear.isLeap(year));
    }

    @Test
    public void nineteen_ninety_seven_is_not_a_leap_year() {
        int year = 1997;
        assertFalse(LeapYear.isLeap(year));
    }

    @Test
    public void nineteen_hundred_is_not_a_leap_year() {
        int year = 1900;
        assertFalse(LeapYear.isLeap(year));
    }

    @Test
    public void two_thousand_is_a_leap_year() {
        int year = 2000;
        assertTrue(LeapYear.isLeap(year));
    }
}
