package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public abstract void setLength(int length);

    public int getWidth() {
        return width;
    }

    public abstract void setWidth(int width);

}
