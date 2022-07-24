package com.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SuppressWarnings({})
public class StreamExamples {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        IntStream randomInts = randomGenerator.ints(12, 0, 100);

        //randomInts IntStream, improved version of Stream<Integer>
        int sumOfDoubledEvenInts = randomInts
                .filter(elem -> elem % 2 == 0)
                .peek(elem -> System.out.printf("%d ", elem))
                .map(elem -> 2 * elem)
                .sum();

        System.out.println("Doubled Sum is: " + sumOfDoubledEvenInts);

    }
}
