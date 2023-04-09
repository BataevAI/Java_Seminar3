package Seminar5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lesson5 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("sd", 54);
        Collection<Integer> values1 = map.values();

        map.put("sda", 544);
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
//            System.out.println();
            String key = stringIntegerEntry.getKey();
            Integer value = stringIntegerEntry.getValue();
            System.out.println("Значения: " + value + ", " + "Ключи: " + key);


        }


        Integer dff = map.getOrDefault("dfff", 777);
        System.out.println(dff);

    }
}
