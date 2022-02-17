package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("语文",99);
        Integer value = map.put("数学",98);
        map.put("数学",98);
        map.put("英语",97);
        map.put("科学",96);
        System.out.println(map);
        value = map.put("数学",77);
        System.out.println(value);
        System.out.println(map);
        value = map.get("语文");
        System.out.println(value);
        value = map.get("体育");
        System.out.println(value);

        int size = map.size();
        System.out.println(size);

        value = map.remove("数学");
        System.out.println(map);
        System.out.println("value:" + value);

        boolean ck = map.containsKey("语文");
        System.out.println(ck);
    }
}
