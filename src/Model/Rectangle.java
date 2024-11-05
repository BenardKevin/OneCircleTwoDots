package Model;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateSurface() {
        return width * length;
    }

    @Override
    double calculateCircumference() {
        return 2 * (width + length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
