package me.learning.learn;

public class Overriding {
    void methodA(){
        System.out.println("Parent Class method");
    }
}

class TestOverriding extends Overriding{
    public void methodA(){
        System.out.println("OverRidden Mehtod in child class");
    }
}

class Test{

    public static void main(String args[]){
    
        TestOverriding obj = new TestOverriding();
        
        obj.methodA();

    }
}