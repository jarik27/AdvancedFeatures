package tln6;

public class EnumDemo {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.MONDAY;

        System.out.println(day);
        System.out.println(DaysOfTheWeek.MONDAY.description);

        DaysOfTheWeek[] daysOfTheWeeks= DaysOfTheWeek.values();
        for (int i = 0; i < daysOfTheWeeks.length; i++) {
            System.out.println(daysOfTheWeeks[i]);
        }
    }
}
