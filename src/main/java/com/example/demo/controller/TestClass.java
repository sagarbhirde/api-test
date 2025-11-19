package com.example.demo.controller;

import java.util.*;

public class TestClass {

    public static void main(String[] args) {

        List<Integer> nos = Arrays.asList(10,3,5,34,6,99,32,86,39,50);

        Integer result = findNthLargestNumber(nos,4);
        System.out.println(result);

        // find the second largest nos from arraylist

//        Integer secondLargestNumber = nos.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
//
//        System.out.println(secondLargestNumber);

//        int first = Integer.MIN_VALUE;
//        int second = Integer.MIN_VALUE;
//        int third = Integer.MIN_VALUE;
//
//        for (int no : nos) {
//
//            if(no > first){
//                third = second;
//                second = first;
//                first = no;
//            }

        }

        public  static Integer findNthLargestNumber(List<Integer>nos,Integer largestNo){
            Integer no = 1;

            if(nos == null || nos.isEmpty() || largestNo < 0 ){
                throw new IllegalArgumentException("Invalid");
            }

            List<Integer> nunbr = new ArrayList<>(new HashSet<>(nos));
            Collections.sort(nunbr,Collections.reverseOrder());

            if(largestNo > nunbr.size()){

            }

            return nunbr.get(largestNo-1);

        }


    }

