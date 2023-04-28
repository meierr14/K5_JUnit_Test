package com.example.demo.leapYearChecker;

public class LeapYearChecker {
    
    public String check(int i) {
        
        if (i < 0) {
            return "No valid year!";
        }else{
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                return "Leap year";
            }
            return "No leap year";
        }
    }   
}
