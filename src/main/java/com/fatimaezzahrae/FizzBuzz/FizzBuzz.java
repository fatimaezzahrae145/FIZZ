package com.fatimaezzahrae.FizzBuzz;

public class FizzBuzz {
    public static String de(int n){
        if (n>2){
            if (n % 3 == 0) {return "Fizz";}
            else if (n % 5 == 0 ) {return "Buzz";}
                    else return String.valueOf(n);}
        else if  ( n > 1 ) return "2" ;
        return "1" ;}}
