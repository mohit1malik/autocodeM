package me.learning.learn;

public class Polymorphism {
    void add(){
        System.out.println("No Prameter");
    }

    void add(int x){

        System.out.println("Parameterized"+x);
    }

    void add(int x, int y){

        System.out.println(" 2Parameterized "+x  + " and " + y );
    }
}
