package com.example.demo.fizzbuzz;

public class Fizzbuzz {
    
    public String convert(int i){
        if (i%3 == 0){
            return "Fizz";
        }
        return String.valueOf(i);
    }
}
