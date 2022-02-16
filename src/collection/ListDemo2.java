package collection;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        List<Integer> sublist = list.subList(2,4);
        for(Integer i : sublist) {
//            sublist.set(i,sublist.get(i)*10);
            System.out.println(i);
        }
//        for(int i = 0; i < sublist.size(); i++) {
//            sublist.set(i,sublist.get(i)*10);
//        }
        System.out.println(sublist);
    }
}
