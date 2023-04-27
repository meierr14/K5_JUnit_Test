package com.example.demo.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzbuzzTest {

    @Test
    public void fizzbuzz1(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        Assertions.assertEquals("1", fizzbuzz.convert(1));
    }

    @Test
    public void fizzbuzz2(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        Assertions.assertEquals("2", fizzbuzz.convert(2));
    }

    @Test
    public void fizzbuzz3(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        Assertions.assertEquals("Fizz", fizzbuzz.convert(3));
    }

    @Test
    public void fizzbuzz4(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        Assertions.assertEquals("Fizz", fizzbuzz.convert(6));
    }
}
