package com.example.demo.controller;

import java.util.*;
import java.util.stream.Collectors;



public class Test {


    public static void main(String[] args) {

//        List<String> names = List.of("1","22","333333","666","44444");
//
//        // descending order based on string length
//        names = names.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
//
//
//
//        //names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        Optional.ofNullable(names).ifPresent(System.out::println);
        // sort in descending order of numbers
        //names = names.reversed().stream().toList();

        String name = " Sagar is java developer";

        String result = Arrays.stream(name.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

            System.out.println("Reverse words :- "+ result);

            for (int i=0; i< 5; i++) {
                System.out.println("Hello World");
            }



    }

}

//
//public class Calculate {
//
//    public float doSomeCalculation(int parm1, int parm2, int parm3, int parm4) {
//
//        float answer = 0.0f;
//
//        //...
//
//        //...
//
//        //...
//
//        handle this exception
//
//        if( parm1 == 0){
//            throw new IllegalArgumentException("Division by zero not allowed");
//        }
//
//        float f = parm3/parm1;
//
//        //...
//
//        //...
//
//        return answer;
//
//    }
//
//}


