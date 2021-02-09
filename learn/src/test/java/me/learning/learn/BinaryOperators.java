package me.learning.learn;

public class BinaryOperators {
    
    public static void main(String[] args) {
        boolean m = true;

        if(!m){
            System.out.println("m is true");
        }else{
            System.out.println("m is false");
        }

    // XOR ^ Opeartor exmaple

        int a1 = 2;
        if (a1%2 == 0 ^ a1%4 == 0){
            System.out.println("^ operator");
        }else{
            System.out.println("no ^ operator");
         }

    // AND && Operator Example

        int a2 = 2;
        if (a2%2 == 0 && a2%4 == 0){
            System.out.println("&& operator");
        }else{
            System.out.println("no && operator");
        }

    // OR || Operator Example

        int a3 = 2;
        if (a3%2 == 0 || a3%4 == 0){
            System.out.println("|| operator");
        }else{
            System.out.println("no || operator");
        }
    }
}
