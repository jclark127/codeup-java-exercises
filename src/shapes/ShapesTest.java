package shapes;

import java.sql.SQLOutput;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle boxOne = new Rectangle(4,5);
        System.out.println("Rectangle");
        System.out.println("Area: " + boxOne.getArea());
        System.out.println("Perimeter: " + boxOne.getPerimeter());
        System.out.println();
        Rectangle box2 = new Square(5);
        System.out.println("Square");
        System.out.println("Area: " + box2.getArea());
        System.out.println("Perimeter: " + box2.getPerimeter());
    }

}
