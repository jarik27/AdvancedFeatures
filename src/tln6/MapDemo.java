package tln6;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> minDictionary = new HashMap<>();

        minDictionary.put("Student","A student is a person...");
        minDictionary.put("Market","A market is a place...");
        minDictionary.put("Class","A class is an a room...");

        System.out.println(minDictionary.get("Student"));

        Map<Integer,Student> studentMap = new HashMap<>();

        studentMap.put(1,new Student("Jarik","",12,true));
        studentMap.put(2,new Student("Olga","",13,false));

        System.out.println(studentMap.get(1));
        System.out.println(studentMap.get(2));
    }
}
