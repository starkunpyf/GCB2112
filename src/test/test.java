package test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

class Test {
    static void print(List al) {
        al.add(2);
        al = new ArrayList();
        al.add(3);
        al.add(4);

    }

    public static void main(String[] args) {
        List al = new ArrayList();
        al.add(1);
        print(al);
        System.out.println(al.get(1));
    }

}