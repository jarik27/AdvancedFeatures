package tln6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateList {
    public static void main(String[] args) {
        String[] names = {"Anneli", "Anna", "Boris", "Maksim", "Michael"};
        List<String> namesList = Arrays.asList(names);
        List<String> sepList = new ArrayList<>();

        for (int i = 0; i < namesList.size(); i++) {
            String name = namesList.get(i);
            if (name.startsWith("A")) {
                sepList.add(name);
            }
        }
        System.out.println(sepList);
        String nameWithOddLength = "";
        for (String name : names) {
            if (name.length() % 2 == 1) {
                nameWithOddLength = name;
                break;
            }

        }
        System.out.println("First name with odd number: " + nameWithOddLength);//

    }


}
