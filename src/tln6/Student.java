package tln6;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;

    public Student(String firstName, String lastName, int age, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getFirstName() {
        return firstName; // this. eto mozno bez etogo.
    }

    @Override
    public String toString() {
        return "Hello " + firstName;
    }

    public void printDetail() {
        System.out.println("Student's first name: " + this.getFirstName());
        System.out.println("Student's last name: " + this.getLastName());
        System.out.println("Student's age: " + this.getAge());
        System.out.println("Student is Male? " + this.isMale());


    }
}
