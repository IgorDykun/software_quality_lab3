package org.example;

/*
@author User
@project lab3Quality
@class IntegerToRomanTest
@version 1.0.0
@since 03.04.2025 - 22.29
*/


import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRomanTest {

    private final IntegerToRoman converter = new IntegerToRoman();

    @Test
    public void testNonNumericInput() {
        try {
            Integer.parseInt("abc");
            fail("Expected NumberFormatException.");
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testEmptyInput() {
        try {
            Integer.parseInt("");
            fail("Expected NumberFormatException.");
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testNumericInputWithNonNumericCharacters() {
        try {
            Integer.parseInt("123a");
            fail("Expected NumberFormatException.");
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testInputExceedingMaximumValue() {
        int num = 4000;
        assertNull("Value exceeds maximum Roman numeral limit.", converter.intToRoman(num));
    }

    @Test
    public void testInputZero() {
        int num = 0;
        assertNull("Roman numeral for zero does not exist.", converter.intToRoman(num));
    }

    @Test
    public void testInputEqualToMaximumRomanValue() {
        int num = 3999;
        assertEquals("MMMCMXCIX", converter.intToRoman(num));
    }

    @Test
    public void testInputEqualToOne() {
        int num = 1;
        assertEquals("I", converter.intToRoman(num));
    }

    @Test
    public void testInputWithSpaces() {
        String input = " 123 ";
        input = input.trim();
        assertEquals("CXXIII", converter.intToRoman(Integer.parseInt(input)));
    }

    @Test
    public void testInputWithSpecialCharacters() {
        try {
            Integer.parseInt("12@34");
            fail("Expected NumberFormatException.");
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testInputWithCommaInsteadOfPeriod() {
        try {
            Integer.parseInt("123,45");
            fail("Expected NumberFormatException.");
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testInputContainingWhitespace() {
        try {
            Integer.parseInt("   ");
            fail("Expected NumberFormatException.");
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testInputEqualTo888() {
        assertEquals("DCCCLXXXVIII", converter.intToRoman(888));
    }

    @Test
    public void testInputEqualTo100() {
        assertEquals("C", converter.intToRoman(100));
    }

    @Test
    public void testInputEqualTo500() {
        assertEquals("D", converter.intToRoman(500));
    }

    @Test
    public void testInputEqualTo999() {
        assertEquals("CMXCIX", converter.intToRoman(999));
    }

    @Test
    public void testInputEqualTo1234() {
        assertEquals("MCCXXXIV", converter.intToRoman(1234));
    }

    @Test
    public void testInputEqualTo1500() {
        assertEquals("MD", converter.intToRoman(1500));
    }

    @Test
    public void testInputEqualTo3000() {
        assertEquals("MMM", converter.intToRoman(3000));
    }

    @Test
    public void testInputEqualTo99() {
        assertEquals("XCIX", converter.intToRoman(99));
    }

    @Test
    public void testInputWithTabCharacters() {
        try {
            Integer.parseInt("12\t34");
            fail("Expected NumberFormatException.");
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testValueExceedsMaxLimit() {
        int num = 4001;
        assertNull("Value exceeds maximum Roman numeral limit.", converter.intToRoman(num));
    }

    @Test
    public void testMinimumValue() {
        int num = 1;
        assertEquals("I", converter.intToRoman(num));
    }

    @Test
    public void testLargeValueConversion() {
        int num = 2999;
        assertEquals("MMCMXCIX", converter.intToRoman(num));
    }

    @Test
    public void testEmptyStringInput() {
        try {
            Integer.parseInt("");
            fail("Expected NumberFormatException.");
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testInputWithAlphabeticCharacters() {
        try {
            Integer.parseInt("ABC");
            fail("Expected NumberFormatException.");
        } catch (NumberFormatException e) {
            assertTrue(true);
        }
    }
}

