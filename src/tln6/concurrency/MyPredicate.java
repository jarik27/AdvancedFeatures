package tln6.concurrency;

import java.util.function.Predicate;

public class MyPredicate implements Predicate {

    @Override
    public boolean test(Object o) {
        return false;
    }
}
