package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map <Integer,String>m = new HashMap<Integer,String>();
        m.put(666,"abc");
        m.put(777,"xyz");
        System.out.println(m);
       m.put(897,"apple");
        System.out.println(m);

        System.out.println(m.get(666));
    }
}
