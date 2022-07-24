package com.lambda;

import java.util.*;

public class LambdaExamples {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ana", "areeeeeee", "mere", ".");
        //Before Java 8
        for (String elem : list) {
            System.out.printf("%s ", elem);
        }
        System.out.println();
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        for (String elem : list) {
            System.out.printf("%s ", elem);
        }

        System.out.println();
        System.out.println();

        List<String> list2 = Arrays.asList("Ana", "areeeeeee", "mere", ".");
        //Java 8 with Lambda
        //this lambda: Consumer<? super T> action
        list2.forEach(elem -> System.out.printf("%s ", elem));
        System.out.println();

        //this lambda: Comparator<? super E> c
        String s = "abasd";
        list2.sort(Comparator.naturalOrder());
        list2.forEach(elem -> {System.out.printf("%s ", elem);
            System.out.println(s);});
        list2.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        list2.forEach(elem -> System.out.printf("%s ", elem));

    }
}