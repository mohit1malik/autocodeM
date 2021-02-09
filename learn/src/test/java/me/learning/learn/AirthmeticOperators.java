package me.learning.learn;

public class AirthmeticOperators {

public static void main(String[] args) {
    
    System.out.println("-------- Airthmetic Operators Examples  ----------");

    int a =4;
    int b = 5;

    b +=a; //b = b+a , b 5+4 =  9, b=9, a=4
    int c = a++; // c = a  , a = a+1, c=4, a =5 
    int d = ++a; // a = a+1; d = a, d = 6 a =6;
    int e = --a; // a = a-1 , e =a , e = 5 , a = 5
    int f = a--; // f = a , a = a-1 ,  f =5 , a = 4 
    int g = a++ -b; // a = 4 , g = a - b , g = -5, a = 5  

    System.out.println("value of a " +a);
    System.out.println("value of b " +b);
    System.out.println("value of c " +c);
    System.out.println("value of d " +d);
    System.out.println("value of e " +e);
    System.out.println("value of f " +f);
    System.out.println("value of g " +g);






}
}
