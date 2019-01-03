package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < collection1.size(); i++) {
            if (collection2.contains(collection1.get(i))){
                result.add(collection1.get(i));
            }

        }

        return result;
    }
}
