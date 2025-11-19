package com.example.demo.controller;

//Write a program to swap the two strings using substring.
//Input: Hello world
//Output: World Hello
//
//5. Given an array of non-duplicating
//numbers from 1 to n
//where one number is missing,
//write an efficient java program to find that missing number.

//4,3,8,7,5,2,6

//10. Write a java program to check if any number given as input is the sum of 2 prime numbers.
//Input - 18
//Output -
//        18 = 13 + 5
//        18 = 11 + 7

public class Program2 {

    public static void main(String[] args) {

//       String firstString = "Hello";
//       String secondString = "World";
//
//       firstString = firstString + secondString;
//
//       secondString = firstString.substring(0,firstString.length() - secondString.length());
//
//
//       firstString = firstString.substring(secondString.length());
//
//       System.out.println("After Swapping");
//
//       System.out.println(" first:-"+ firstString);
//
//      System.out.println(" Second:-"+ secondString);


//        int[] number = {4,3,8,7,5,2,6};
//
//        int n = number.length + 1;
//
//        int expectedSum = n * (n+1) / 2;
//
//        int actualSum = 0;
//
//       for (int num: number){
//           actualSum += num;
//        }
//
//       int missing = expectedSum - actualSum;
//       System.out.println("Missing Number:- "+missing);

        int num = 18;

        if (isSumOfTwoPrimeNumbers(num)){
            System.out.println(num+" this is prime of 2 numbers");
        }else {
            System.out.println(num+" this is not prime of 2 numbers");
        }

    }

    public  static  boolean isSumOfTwoPrimeNumbers(int num){

        if ( num < 4){
            return  false;
        }

        for (int i = 2; i < num / 2; i++) {
            if (isPrime(i) && isPrime(num -i)){
                System.out.println(num+" = "+ i + " + " + (num - i));
                return true;
            }
        }
     return false;
    }

    public static boolean isPrime(int n){
        if(n <= 1) return  false;
        if ( n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if(n% i == 0 ) return false;
        }


        return  true;
    }
}
