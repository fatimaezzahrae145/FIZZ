package com.fatimaezzahrae.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {
    @Test
    public void FizzBuzz_de_1_doit_retourner_1(){
        assertEquals("1",FizzBuzz.de(1));
    }
    @Test
    public void FizzBuzz_de_2_doit_retourner_2(){
        assertEquals("2",FizzBuzz.de(2));
    }
    @Test
    public void FizzBuzz_de_3_doit_retourner_Fizz(){
        assertEquals("Fizz",FizzBuzz.de(3));
    }
    @Test
    public void FizzBuzz_de_4_doit_retourner_4(){
        assertEquals("4",FizzBuzz.de(4));
    }
    @Test
    public void FizzBuzz_de_5_doit_retourner_Buzz(){
        assertEquals("Buzz",FizzBuzz.de(5));
    }
}
