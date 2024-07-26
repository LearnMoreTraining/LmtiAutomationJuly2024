package javabasics;

import org.checkerframework.checker.units.qual.C;

public class ConstructorExample {

   static int h ;
   static String name;

    public ConstructorExample(int h){
       this.h = h;
    }

    public ConstructorExample(String name){
        this.name =name;
    }
    public static void main(String[] args) {

        ConstructorExample c = new ConstructorExample("lmti");
        System.out.println(h);
        System.out.println(name);
    }

}
