package me.learning.learn;

public class OverLoading {
    
    public void add(){
        System.out.println("hey");
    
    }
    public void add(int x){
        int i;
        i= x;
        System.out.println(+i);
    }

   
}

class Hello{

    public static void main(String args[]){
        OverLoading obj = new OverLoading();

        obj.add(5);
        obj.add();
    }
}
