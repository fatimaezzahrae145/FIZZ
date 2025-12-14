package com.fatimaezzahrae.FizzBuzz;

public class FizzBuzz {
    public static String de(int n){
        if (n>2){
            if (n % 3 == 0) return "Fizz";
            else return String.valueOf(n);
        }
        if ( n > 1 ) return "2" ;
        return "1" ;}}
