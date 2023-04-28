package com.example.demo.leapYearChecker;

public class LeapYearChecker {
    
    public String check(int i){
        
        if (i % 400 == 0){
            if (i % 100 != 0){
                if (i % 4 == 0){
                    return "Leap year";
                }
            }
        }
        return "No leap year";
    }
}
