package tln6;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Jaroslav", "Jermolovitsh", 39, true);
        student1.printDetail();

        Student student2 = new Student("Anelija", "Jermolovitsh", 7, false);
        student2.printDetail();
    }
}
