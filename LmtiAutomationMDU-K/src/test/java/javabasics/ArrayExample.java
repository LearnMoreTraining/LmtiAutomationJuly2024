package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

        int [] a = {10,20,30,40} ; //0,1,2,3

        for(int l:a){
            System.out.println(l);
        }

      for(int k=0 ;k < a.length;k++){

          System.out.println(a[k]);
      }

        String [] name = {"learnmore","lmti"};

      for(String o:name){
          System.out.println(o);
      }

       for(int j=0 ; j<name.length;j++){

           System.out.println(name[j]);
       }

    }

}
