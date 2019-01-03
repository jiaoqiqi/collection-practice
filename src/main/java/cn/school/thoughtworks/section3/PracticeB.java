package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> coll = object.get("value");
        for (int i = 0; i < coll.size(); i++) {
            String key = coll.get(i);
            Integer integer = collectionA.get(key);
            int count = integer/3;
            collectionA.put(key,integer-count);
        }
        return collectionA;

    }
}
