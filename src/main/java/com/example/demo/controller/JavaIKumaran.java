package com.example.demo.controller;

public class JavaIKumaran {

    // Largest No in array without using in built
    public static void main(String[] args) {
        String name = "Sagar";
            String reverse = "";

        for (int i = name.length() -1 ; i >=0 ; i--) {
            reverse = reverse + name.charAt(i);
        }

        System.out.println("Reverse String: " + reverse);

//        Integer[] arr = {1,3,4,5,6,7};
//
//        int largest = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] > largest){
//                largest = arr[i];
//            }
//        }

        System.out.println("Reverse String: " + reverse);

    }
}
