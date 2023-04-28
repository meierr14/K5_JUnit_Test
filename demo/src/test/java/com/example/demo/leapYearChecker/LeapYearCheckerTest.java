package com.example.demo.leapYearChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LeapYearCheckerTest {
    

    @Test
    public void leapYearChecker1() {

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("No leap year", leapYearChecker.check(1));

    }

    @Test
    public void leapYearChecker2() {

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("No leap year", leapYearChecker.check(2));

    }

    @Test
    public void leapYearChecker3() {

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("Leap year", leapYearChecker.check(4));

    }
    
    @Test
    public void leapYearChecker4(){

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("Leap year", leapYearChecker.check(20));
        Assertions.assertEquals("Leap year", leapYearChecker.check(60));
        Assertions.assertEquals("Leap year", leapYearChecker.check(124));
    }

    @Test
    public void leapYearChecker5(){

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("No leap year", leapYearChecker.check(687));
        Assertions.assertEquals("No leap year", leapYearChecker.check(99));
        Assertions.assertEquals("No leap year", leapYearChecker.check(634));
    }

    @Test
    public void leapYearChecker6(){

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("No leap year", leapYearChecker.check(200));
        Assertions.assertEquals("No leap year", leapYearChecker.check(300));
        Assertions.assertEquals("No leap year", leapYearChecker.check(700));
    }

    @Test
    public void leapYearChecker7(){

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("Leap year", leapYearChecker.check(400));
        Assertions.assertEquals("Leap year", leapYearChecker.check(1200));
        Assertions.assertEquals("Leap year", leapYearChecker.check(2000));
    }

    @Test
    public void leapYearChecker8(){

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertEquals("Leap year", leapYearChecker.check(-100));
        Assertions.assertEquals("Leap year", leapYearChecker.check(-2567));
    }
}
