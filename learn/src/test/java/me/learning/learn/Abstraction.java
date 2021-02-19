package me.learning.learn;

abstract class Abstraction {
    
    abstract void addition();

    void substract(int x, int y){
        int r = x-y;
        System.out.println("substraction is - "+ r);
    }

    abstract void multi();

}


class  Math1 extends Abstraction{

    void addition(int x , int y){
        int e = x+y;
        System.out.println("Addition is -"+ e);
    }

    void multi(int x , int y){
        int f = x*y;
        System.out.println("Addition is -"+ f);
    }
}

class Results extends Math1{
    public static void main(String[] args) {
        Math1 obj = new Math1();

        obj.addition(4,5);
        obj.substract(10, 3);
        obj.multi(4,7);
    }
}   