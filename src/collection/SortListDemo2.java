package collection;

import java.util.*;
import java.util.stream.Collectors;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(97,88));
        list.add(new Point(7,6));
        list.add(new Point(9,9));
        list.add(new Point(5,4));
        list.add(new Point(2,3));



        Collections.sort(list,(o1, o2)->
                o1.getX() * o1.getX() + o1.getY() *o1.getY() - o2.getX() * o2.getX() - o2.getY() *o2.getY());
        System.out.println(list);
    }
}
