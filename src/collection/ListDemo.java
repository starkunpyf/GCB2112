package collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
//        System.out.println(list);
//        System.out.println(list.get(2));
//        for(String s : list){
//            System.out.println(s);
//        }

        System.out.println(list.set(1,"7"));
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);


    }
}
