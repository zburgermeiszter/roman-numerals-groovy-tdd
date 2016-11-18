package com.burgermeiszter.tdd.roman.numerals

class RomanNumerals {

    Map romanToArabicMap = [
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
    ];

    Integer toArabic(String romanNumber) {
        Integer result = 0;

        romanNumber.eachWithIndex { numeral, index ->
            Integer arabicNumeral = romanToArabicMap.get(numeral, 0);

            // if the current numeral is less than the following, then subtract the current from the result
            if(index < romanNumber.length()-1) {
                Integer nextArabic = romanToArabicMap.get(romanNumber[index+1], 0);
                if(nextArabic > arabicNumeral) arabicNumeral *= -1;
            }

            result += arabicNumeral;
        }
        return result;
    }
}
