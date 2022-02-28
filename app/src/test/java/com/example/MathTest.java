package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    Math math;

    @Before
    public void init() {
        math = new Math();
    }

    @Test
    public void addTest() {
        assertEquals("17", math.add("12", "5"));
    }

    @Test
    public void simpleDivideTest() {
        assertEquals("1", math.divide("5", "5"));
    }

    @Test

    public void simpleMultiplyTest() {
        assertEquals("36", math.multiply("6", "6"));
    }

    @Test
    public void simpleSubtractionTest() {
        assertEquals("999", math.subtract("1000", "1"));
    }

    @Test
    public void addIncludingSpacesTestCase() {
        assertEquals("17", math.add("12", "5"));
    }

    @Test
    public void addIncludingMinusTestCase() {
        assertEquals("Here is a negative number ", math.add("-5", "3"));

    }

    @Test
    public void isDividedByZero() {
        assertEquals("You can't divide by zero.", math.dividedByZero("2", "0"));
    }

    @Test
    public void doesIncludeSpecialCharacters() {
        assertEquals("Special characters present", math.areSymbolsIncluded( "№;%2№?2", "456"));
    }

    @After
    public void detach() {
        math = null;
    }
}
