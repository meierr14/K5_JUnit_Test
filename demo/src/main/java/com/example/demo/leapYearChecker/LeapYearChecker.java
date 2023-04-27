package com.example.demo.leapYearChecker;

public class LeapYearChecker {
    
    public String check(int i){
        if (i % 4 == 0){
            return "Leap Year";
        }
        return "no leap year";
    }
}
