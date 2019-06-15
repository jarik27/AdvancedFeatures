package tln6;

import java.util.Optional;

public class OptionalsDemo {
    public static void main(String[] args) {
        String name = "Hello";
        Student student = new Student("hi","loh",10,true);

        Optional<String> optionalString = Optional.ofNullable(name);
        Optional<Student> studentOptional = Optional.ofNullable(student);


        if (optionalString.isPresent()) {
            System.out.println("is present");
            System.out.println(optionalString.get());
        }
    }
}
