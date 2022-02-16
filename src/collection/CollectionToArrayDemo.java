package collection;

import java.util.*;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        c.add("6");
        String[] array = c.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

    }
}
