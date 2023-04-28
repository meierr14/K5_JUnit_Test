package com.example.demo.leapYearChecker;

public class LeapYearChecker {
    
    public String check(int i) {
        
        if (0 < i && i < 10000) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                return "Leap year";
            }
            return "No leap year";
        }else{
            return "No valid year!";
        }
    }   
}
