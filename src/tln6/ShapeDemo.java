package tln6;

public class ShapeDemo {
    public static void main(String[] args) {

        // Cannot create an object of an abstract class
        //Shape shape = new Shape();
        //shape.printArea();

        Circle circle = new Circle(3);
        circle.printArea();

        Rectangle rectangle = new Rectangle(2,3);
        rectangle.printArea();

        Shape shapeRef = new Rectangle(3,3);
        System.out.println(shapeRef.calculateArea());

        shapeRef = new Circle(3);
        shapeRef.printArea();

    }
}
