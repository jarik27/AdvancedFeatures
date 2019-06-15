package tln6;

public class GenericBoxDemo {
    public static void main(String[] args) {

        Student student = new Student(" ", " ", 30, true);
        GenericBox<Student> studentGenericBox = new GenericBox<>(student);

        Circle circle = new Circle(6);
        GenericBox<Circle> circleGenericBox = new GenericBox<>(circle);

        Rectangle rectangle = new Rectangle(6,40);
        GenericBox<Rectangle> rectangleGenericBox = new GenericBox<>(rectangle);

        Shape shape = new Rectangle(6,4);
        GenericBox<Shape> shapeGenericBox = new GenericBox<>(shape);

        GenericBox<Shape> shapeCircleGenericBox = new GenericBox<>(circle);

        GenericBox<Shape> shapeRactangleGenericBox = new GenericBox<>(rectangle);


        GenericBox<Object> objectGenericBox = new GenericBox<>(circle);


        printGenericObjectItem(studentGenericBox);
        printGenericObjectItem(shapeRactangleGenericBox);
    }

    public static void printGenericObjectItem(GenericBox<?> genericBox){
        System.out.println(genericBox.getItem());
    }
}
