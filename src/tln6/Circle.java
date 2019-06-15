package tln6;

public class Circle extends Shape {

    private int radius;
    private final double PI = 3.1416; // tak kak PI ne izmenjaemaja, to stavim FINAL

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public void printArea() {
        System.out.println("The area of this circle is "+calculateArea());
    }
}
