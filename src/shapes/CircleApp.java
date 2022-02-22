package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        boolean keepGoing = true;
        int count = 0;
        while(keepGoing) {
            Input sc = new Input();
            double radius = sc.getDouble("Enter the radius of a circle.");
            Circle cr = new Circle(radius);
            System.out.println();
            System.out.println("The area of your circle is " + String.format("%.2f",cr.getArea()));
            System.out.println("The circumference of your circle is " + String.format("%.2f",cr.getCircumference()));
            System.out.println();
            count ++;
            Circle.setCount(count);
            System.out.println("Circles created: " + Circle.getCount());
            System.out.println();
            keepGoing = sc.yesNo("Create another circle y/n?");
            System.out.println();
        }
        System.out.println("Total circles created: " + count);
    }
}
