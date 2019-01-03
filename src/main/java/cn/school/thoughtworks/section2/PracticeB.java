package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {

        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            String key = collection1.get(i);
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

        return result;
    }
}
