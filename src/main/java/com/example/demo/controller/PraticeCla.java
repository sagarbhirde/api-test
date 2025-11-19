package com.example.demo.controller;

import java.net.InterfaceAddress;
import java.util.Comparator;
import java.util.List;

public class PraticeCla {

    interface Calculator  {
        Integer operator (Integer firstValue, Integer secondValue);
      
    }

    static Calculator add = ((firstValue, secondValue) -> firstValue + secondValue );
    static Calculator sub = ((firstValue, secondValue) ->  firstValue - secondValue);

    public static void main(String[] args) {
//        List<Integer> nos = List.of(1,33,42,58,71,44);
//
//        Integer secondHighestNumber = nos.stream().distinct().
//                sorted(Comparator.reverseOrder()).
//                skip(1).
//                findFirst().
//                orElse(null);
//
//        System.out.println(secondHighestNumber);
        System.out.println("Addition :-"+add.operator(10,5));
        System.out.println("Substraction:-"+sub.operator(10,5));
    }
}



