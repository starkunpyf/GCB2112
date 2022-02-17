package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("cang1111");
        list.add("xiao1");
        list.add("zhuan2");
        System.out.println(list);
        //Collections.sort(list,(o1,o2) -> o1.length() - o2.length());
        Collections.sort(list, Comparator.comparingInt(String::length));

        System.out.println(list);
    }
}
