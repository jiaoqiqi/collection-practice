package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {

        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            String key = collection1.get(i);
            if (result.containsKey(key)) {
                Integer integer = result.get(key);
                result.put(key, ++integer);
//                result.compute(key, (K, V) -> ++V);
            } else {
                result.put(key, 1);
            }
        }

        return result;
    }
}
