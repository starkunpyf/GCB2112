package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",97);
        map.put("科学",96);
        Set<String> keySet= map.keySet();
        for(String key : keySet){
            System.out.println(key);
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet);
        for(Map.Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Collection<Integer> values = map.values();
        for(Integer value : values){
            System.out.println(value);
        }

        map.forEach(
                (k,v)-> System.out.println(k+" : "+v)
        );
    }
}
