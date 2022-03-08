package com.github.yurysavchuk.math.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i<=n; i++) {
            result.add(getStringFor(i));
        }

        return result;
    }

    private String getStringFor(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        }
        return Integer.valueOf(n).toString();
    }
}
