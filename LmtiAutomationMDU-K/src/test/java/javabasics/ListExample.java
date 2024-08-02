package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(56);
        l.add(100);
        System.out.println(l);
        l.add(120);
        System.out.println(l);
        l.add(560);
        l.add(120);
        System.out.println(l);
        System.out.println(l.get(1));

        List <String> l2 = new ArrayList<>();
        l2.add("lmti");
        l2.add("learnmore");
        l2.add("lmti");
        System.out.println(l2);
    }
}
