package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        int[] numbers = {1,-2,0,4,0,-1,-8,0};
//
//
//        numbers = Arrays.stream(numbers)
//                .boxed()
//                .collect(Collectors.partitioningBy(n -> n != 0))
//                .values()
//                .stream()
//                .flatMap(List::stream)
//                .mapToInt(Integer::intValue)
//                .toArray();
//
//        System.out.println(Arrays.toString(numbers));

        Singletonclass s1 = Singletonclass.getInstance();
        Singletonclass s2 = Singletonclass.getInstance();
        System.out.println(s1 == s2);

    }
}
