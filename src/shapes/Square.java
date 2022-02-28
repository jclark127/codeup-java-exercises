package shapes;

public class Square extends Quadrilateral{

    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
//    public int side;
//
//    public Square (int side) {
//
//        this.side = side;
//    }
//
//    @Override
//    public int getArea() {
//        System.out.println("Overridden Area method");
//        return super.getArea();
//    }
//
//    @Override
//    public int getPerimeter() {
//        System.out.println("Overridden Perimeter method");
//        return super.getPerimeter;
//    }
}
