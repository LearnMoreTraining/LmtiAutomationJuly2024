package javabasics;

public class ReturnTypeExample {

   static int i = 100; //global variable
    int b= 1000;

    public static void main(String[] args) {
       ReturnTypeExample returnTypeExample = new ReturnTypeExample();
     int h=  returnTypeExample.m1();
        System.out.println(h);
      String u= returnTypeExample.m2();
        System.out.println(u);
    }

    public int m1(){
        int a = 1 ; //local variable
        int b = 2000;
        System.out.println(b);
        System.out.println(this.b);
        System.out.println(i);
        return a ;
    }

    public String m2(){
        String name = "lmti";
        System.out.println(i);
        return name;
    }

    public static void m3(){

        System.out.println(i);
    }
}
