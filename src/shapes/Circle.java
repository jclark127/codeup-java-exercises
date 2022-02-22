package shapes;

public class Circle {
    private double radius;
    private static int count;


    public Circle (double radius){
        this.radius = radius;
        count = 0;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static int getCount (){
        return count;
    }

    public static void setCount (int cnt){
        count = cnt;
    }

}
