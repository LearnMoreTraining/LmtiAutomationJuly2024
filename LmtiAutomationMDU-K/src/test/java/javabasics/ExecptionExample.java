package javabasics;

import io.cucumber.java.sl.In;

public class ExecptionExample {

    public static void main(String[] args) {

        String a = "123" ;

        String y = "aravinth  ";
        System.out.println(y.substring(1,5));
        System.out.println(y.toUpperCase());
        System.out.println(y.trim());
        System.out.println(y.charAt(1));
        int b = 1 ;

        try{
           int d = Integer.parseInt(a);
            System.out.println(b+d);
        }
        catch (NumberFormatException e){
            String n = a.substring(1);
            int d = Integer.parseInt(n);
            System.out.println(d+b);

        }

    }
}
