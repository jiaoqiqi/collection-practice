package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {

        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < collectionA.size(); i++) {
            String key = collectionA.get(i);
            if(key.length() > 1){
                String[] splitKey = key.split("-");
                key = splitKey[0];
                int val = Integer.parseInt(splitKey[1]);
                result.put(key,val);
            }else{
                if (result.containsKey(key)) {
                    Integer integer = result.get(key);
                    result.put(key, ++integer);
//                result.compute(key, (K, V) -> ++V);
                } else {
                    result.put(key, 1);
                }
            }

        }
        List<String> coll = object.get("value");
        for (int i = 0; i < coll.size(); i++) {
            String key = coll.get(i);
            Integer integer = result.get(key);
            int count = integer/3;
            result.put(key,integer-count);
        }
        return result;

    }
}
