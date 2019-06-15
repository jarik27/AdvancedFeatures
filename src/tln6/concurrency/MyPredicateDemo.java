package tln6.concurrency;

import java.util.function.Predicate;

public class MyPredicateDemo {
    public static void main(String[] args) {
        String name = "Ayomide";
        Predicate<String> myLambdaPredicate = s -> s.length() > 10;

        System.out.println("Does name have length > 10? ");
        System.out.println(myLambdaPredicate.test(name));
    }
}
