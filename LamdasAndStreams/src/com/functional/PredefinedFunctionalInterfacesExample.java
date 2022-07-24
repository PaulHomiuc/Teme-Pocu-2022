package com.functional;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PredefinedFunctionalInterfacesExample {

    public static void main(String[] args) {
        Predicate<Integer> isOdd = num -> num % 2 == 0;
        int x = 42;
        System.out.printf("x is odd? %b%n", isOdd.test(x));
        x = 9;
        System.out.printf("x is odd? %b%n", isOdd.test(x));

        UnaryOperator<Integer> getOppositeValue = num -> -num;
        x = 1000;
        System.out.printf("Oppoiste of x: %d%n", getOppositeValue.apply(x));
        x = -999;
        System.out.printf("Oppoiste of x: %d%n", getOppositeValue.apply(x));

        Supplier<Integer> getARandomLotteryNumber = () -> new Random().nextInt(49) + 1;
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", getARandomLotteryNumber.get());
        }
        System.out.println();
    }
}
