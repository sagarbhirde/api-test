package com.example.demo.controller;

import java.util.HashSet;
import java.util.Set;

public class RegexClassDemo {

    public static void main(String[] args) throws Exception {

//        String first = "Hello  ABCD  this is  abcd a niceABcd daBcD. Hope you    abCDDDDAbc feel Better";
//
//        String second = "ABCD";
//
//       String newString = first.replaceAll("(?i)\\b"+second + "\\b", "").trim();
//
//        //String newString = first.replaceAll("(?i)ABCD","");
//        System.out.println(newString);

//        find the number of unique pairs in an integer array whose absolute difference is equal to a given integer k.
//        For example, in the array [3,1,4,1,5] with k=2, the unique pairs are (1, 3) and (3, 5), so the answer is 2.

        int[] nos = {3,1,4,1,5};
        int diff = 2;

        Set<String> uniquePairs = new HashSet<>();
        Set<Integer> setnos = new HashSet<>();


        for (int i : nos) {
            setnos.add(i);
        }

        for (int num : setnos){
            if (setnos.contains(num + diff)){
                uniquePairs.add(num + " "+ (num + diff));
            }

            if (setnos.contains(num - diff)){
                uniquePairs.add((num - diff) + "," + num);
            }
        }

        System.out.println();

        for (int i = 0;i<=10;i--){
          throw new Exception("this is runtime exception");
        }


        for (String s : uniquePairs){
            System.out.println("(" + s.replace(",",", ")+ ")");
        }

    }
}
