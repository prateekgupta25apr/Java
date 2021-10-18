package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class IntroToMaps {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("first name","Prateek");
        hashMap.put("last name","Gupta");
        System.out.println(hashMap);

        LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap<>(hashMap);
        System.out.println(linkedHashMap);

        TreeMap<String,String> treeMap=new TreeMap<>(linkedHashMap);
        System.out.println(treeMap);
    }
}
