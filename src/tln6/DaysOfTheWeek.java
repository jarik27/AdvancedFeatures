package tln6;

public enum DaysOfTheWeek {
    MONDAY("1 day"),
    TUESDAY("2 day"),
    WEDNESDAY("3 day"),
    THURSDAY("4 day"),
    FRIDAY("5 day"),
    SATURDAY("6 day"),
    SUNDAY("7 day"); // bez zapajtoi. esli hotim posle constructor, stavim ;

    String description;

    DaysOfTheWeek(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
