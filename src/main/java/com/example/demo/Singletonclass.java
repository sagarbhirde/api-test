package com.example.demo;

public class Singletonclass {

    private static Singletonclass singletonclass;

    private Singletonclass(){
        System.out.println("this is the constructor");
    }

    public static Singletonclass getInstance(){
        if(singletonclass == null){
            singletonclass = new Singletonclass();
        }
        return  singletonclass;
    }
}
