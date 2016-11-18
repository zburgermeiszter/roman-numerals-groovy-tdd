package com.burgermeiszter.tdd.roman.numerals

import org.junit.Before
import org.junit.Test

class RomanNumeralsTest {

    RomanNumerals romanNumerals;

    @Before
    public void setUp() throws Exception {
        romanNumerals = new RomanNumerals();
    }

    @Test
    void testSingleNumerals() {
        assert assertRomanToArabic('I', 1)
        assert assertRomanToArabic('V', 5)
        assert assertRomanToArabic('X', 10)
    }

    @Test
    void testSimpleDoubleNumerals() {
        assert assertRomanToArabic('XX', 20)
        assert assertRomanToArabic('XVI', 16)
        assert assertRomanToArabic('MMCLXV', 2165)
    }

    @Test
    void testComplexDoubleNumerals() {
        assert assertRomanToArabic('XIX', 19)
        assert assertRomanToArabic('XXX', 30)
        assert assertRomanToArabic('LXIV', 64)
        assert assertRomanToArabic('XCIX', 99)
        assert assertRomanToArabic('MCMLXXXIV', 1984)
        assert assertRomanToArabic('CLXXXVIII', 188)
        assert assertRomanToArabic('CCLXXXVIII', 288)
        assert assertRomanToArabic('MMMMCDXLIV', 4444)
        assert assertRomanToArabic('MMMMCMXCIX', 4999)
    }

    private Boolean assertRomanToArabic(String roman, Integer arabic) {
        return romanNumerals.toArabic(roman) == arabic;
    }
}