package com.galvanize;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting("Test"));
    }

    @Test
    public void testAppReturnCorrectGrade(){
        App classUnderTest = new App();
        assertEquals("C", classUnderTest.getLetterGrade(79));
    }

    @Test
    public void testPrintFromWhile(){
        App classUnderTest = new App();
        classUnderTest.printNumbers(45, 50);
    }
}