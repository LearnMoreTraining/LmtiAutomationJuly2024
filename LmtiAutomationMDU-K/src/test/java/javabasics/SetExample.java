package javabasics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> s = new HashSet<Integer>();
        s.add(12);
        s.add(24);
        s.add(12);
        s.add(24);
        System.out.println(s);

    }
}