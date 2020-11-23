package com.vapsi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FizzBuzzTest {

    FizzBuzz buzz;

    @BeforeEach
    public void setup()    {
        buzz = new FizzBuzz();
    }


    @Test
    public  void shouldReturnBlahIfInputIsZero()    {
        String actualouput = buzz.displayFizzForMultipleOfThreeAndFive(0);
        assertEquals("Blah",actualouput);
    }

    @Test
    public void shouldReturnFizzIfInputIsPositiveAndOnlyMultipleOfThree()    {
        String actualouput = buzz.displayFizzForMultipleOfThreeAndFive(12);
        assertEquals("Fizz",actualouput);

    }
    @Test
    public void shouldReturnFizzIfInputIsNegativeAndOnlyMultipleOfThree()    {
        String actualouput = buzz.displayFizzForMultipleOfThreeAndFive(-9);
        assertEquals("Fizz",actualouput);

    }

    @Test
    public void shouldReturnBlahIfInputIsPositiveAndNotMultipleOfThreeAndFive()    {
        String actualouput = buzz.displayFizzForMultipleOfThreeAndFive(34);
        assertEquals("Blah",actualouput);

    }


    @Test
    public void shouldReturnBlahIfInputIsNegativeAndNotMultipleOfThreeAndFive()    {
        String actualouput = buzz.displayFizzForMultipleOfThreeAndFive(-22);
        assertEquals("Blah",actualouput);

    }


    @Test
    public void shouldReturnBuzzIfInputIsPositiveAndOnlyMultipleOfFive()    {
        String actualouput = buzz.displayFizzForMultipleOfThreeAndFive(110);
        assertEquals("Buzz",actualouput);

    }


    @Test
    public void shouldReturnBuzzIfInputIsNegativeAndOnlyMultipleOfFive()    {
        String actualouput = buzz.displayFizzForMultipleOfThreeAndFive(-80);
        assertEquals("Buzz",actualouput);

    }


}
