package tln6;

public class GenericBoxDemo2 {
    public static void main(String[] args) {

        //Student student = new Student(" ", " ", 30, true)
        //GenericBox2<Student> studentGenericBox2 = new GenericBox2<>(student);

        Circle circle = new Circle(6);
        GenericBox2<Circle> circleGenericBox2 = new GenericBox2<>(circle);

        Rectangle rectangle = new Rectangle(6,40);
        GenericBox2<Rectangle> rectangleGenericBox2 = new GenericBox2<>(rectangle);

        Shape shape = new Rectangle(6,4);
        GenericBox2<Shape> shapeGenericBox2 = new GenericBox2<>(shape);

        GenericBox2<Shape> shapeCircleGenericBox2 = new GenericBox2<>(circle);

        //GenericBox2<Integer> shapeRactangleGenericBox2 = new GenericBox2<>(rectangle);
    }
}
