package com.vapsi;

public class FizzBuzz {

    final String FIZZ = "Fizz";
    final String FIZZBUZZ = "FizzBuzz";
    final String BUZZ ="Buzz";
    final String NOFIZZBUZZ ="Blah";
    public String displayFizzForMultipleOfThreeAndFive(int num) {

        if((num == 0))
            return NOFIZZBUZZ;

        if((num %3 == 0) && (num % 5 ==0))
            return FIZZBUZZ;

        if((num % 3) == 0) return FIZZ;

        if((num % 5) == 0) return BUZZ;

        return NOFIZZBUZZ;
    }

}
