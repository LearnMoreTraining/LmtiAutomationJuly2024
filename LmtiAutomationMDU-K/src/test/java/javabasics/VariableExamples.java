package javabasics;

public class VariableExamples {

    int b = 34; //global variable
    String name ;
    public static void main(String[] args) {

    }

    public void m1(){
        int a = 1 ; //local variable
        System.out.println(a);
        System.out.println(b);
        name = "lmti";
    }

    public void m2(){
        System.out.println(b);
        System.out.println(name);
    }
}
