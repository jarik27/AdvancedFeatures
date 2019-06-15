package tln6;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        Double[] scores = {10.0, 11.2, 12.3, 13.3, 14.4};
        List<Double> scoresList = java.util.Arrays.asList(scores);

        List nonGenericList = new ArrayList();
        nonGenericList.add("Hello");
        nonGenericList.add(45);
        nonGenericList.add(new Student("ok","yes",45,true));
        String msg = (String) nonGenericList.get(0); // type casting (String) convert to String


        String[] names = {"Anneli", "Pavel", "Bogdan", "Thomas"};
        List<String> namesList = java.util.Arrays.asList(names);


        //for (int i = 0; i < scores.length; i++) {
        //    System.out.println(scores[i]);
        //}
        //for (int i = 0; i < names.length; i++) {
         //   System.out.println(names[i]);
        //}
        //ArrayList scoresList = new ArrayList<>(scores);

    }
}

