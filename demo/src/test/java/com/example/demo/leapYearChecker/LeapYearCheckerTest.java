package com.example.demo.leapYearChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LeapYearCheckerTest {
    

    @Test
    public void leapYearChecker1() {

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("No Leap Year", leapYearChecker.check(1));

    }

    @Test
    public void leapYearChecker2() {

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("No leap Year", leapYearChecker.check(2));

    }

    @Test
    public void leapYearChecker3() {

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("Leap year", leapYearChecker.check(4));

    }
    
}
