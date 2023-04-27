package com.example.demo.leapYearChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCheckerTest {
    

    @Test
    public void leapYearChecker1() {

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("1994", leapYearChecker.check(1994));

    }

    public void leapYearChecker() {

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("2000", leapYearChecker.check(2000));

    }
    
}
