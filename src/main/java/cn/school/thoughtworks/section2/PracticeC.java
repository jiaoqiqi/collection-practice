package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            String key = collection1.get(i);
            if(key.length() > 3){
                int num = Integer.parseInt(key.substring(2,key.length()-1));
                String newKey = key.substring(0,1);
                if (result.containsKey(newKey)){
                    Integer integer = result.get(newKey);
                    result.put(newKey, integer+num);
                }else{
                    result.put(newKey,num);
                }
            }
            else if(key.length() > 1){
                String[] splitKey = key.split("");
                key = splitKey[0];
                int val = Integer.parseInt(splitKey[2]);
                Integer integer = result.get(key);
                if (result.containsKey(key)){

                    result.put(key,val+integer);
                }else{
                    result.put(key,val);
                }
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
