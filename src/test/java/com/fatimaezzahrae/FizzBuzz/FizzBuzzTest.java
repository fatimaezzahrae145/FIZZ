package com.fatimaezzahrae.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {
    @Test
    public void FizzBuzz_de_1_doit_retourner_1(){
        assertEquals("1",FizzBuzz.de(1));
    }
}
