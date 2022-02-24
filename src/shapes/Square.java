package shapes;

public class Square extends Rectangle{
    public int side;

    public Square (int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getArea() {
        System.out.println("Overridden Area method");
        return side * side;
    }

    @Override
    public int getPerimeter() {
        System.out.println("Overridden Perimeter method");
        return 4 * side;
    }
}
