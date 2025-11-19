package com.example.demo.controller;

//Write a program to print fibonacci series which take n as input and
//print that number of elements of the fibonacci series.
//For example:
//When n=5,
//Output: 1 1 2 3 5
//When n=8,
//Output: 1 1 2 3 5 8 13 21

import java.util.List;
import java.util.Scanner;

public class Program {




    public static void main(String[] args) {

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter no");
            Integer n = scanner.nextInt();

            int a = 1, b = 2;


            if(n > 1) {
                System.out.println("Fibonacci Series" + a + " " + b);
            }

            for (int i = 2; i < n; i++) {
                int next = a + b;

                System.out.println(" " + next);

                a = b;
                b = next;
            }

           // scanner.close();

        }



    }

}







