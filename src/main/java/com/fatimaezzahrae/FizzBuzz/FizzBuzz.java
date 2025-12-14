package com.fatimaezzahrae.FizzBuzz;

public class FizzBuzz {
    public static String de(int n) {
        StringBuilder result = new StringBuilder();
        if (n % 3 == 0) result.append("Fizz");
        if (n % 5 == 0) result.append("Buzz");
        return result.length() > 0 ? result.toString() : String.valueOf(n);
    }
}
