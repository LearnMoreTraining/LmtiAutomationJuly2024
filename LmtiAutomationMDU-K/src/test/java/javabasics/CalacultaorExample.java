package javabasics;

public class CalacultaorExample {

    public static void main(String[] args) {

        int a = 10 ;
        int b = 12 ;
        String operator = "aravinth";

        if(operator.equals("+")){
            System.out.println(a + b);
        }
        else if (operator.equals("-")){
            System.out.println(a -b);
        }
        else if (operator.equals("*")){
            System.out.println(a * b);
        }
        else if (operator.equals("/")){
            System.out.println(a / b);
        }
        else{
            System.out.println("enter valid operator");
        }

    }
}
