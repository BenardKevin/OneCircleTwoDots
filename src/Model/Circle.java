package Model;

public class Circle {
    protected Point point1;
    protected Point point2;
    private double radius;
    private double circumference;
    private double surface;


    public Circle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getRadius() {
        return radius;
    }
    public double getCircumference() {
        return circumference;
    }
    public double getSurface() {
        return surface;
    }

    public void calculateRadius() {
        radius = Math.sqrt(Math.pow(point1.getY() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getX(), 2));
    }

    public void calculateCircumference() {
        circumference = 2 * Math.PI * radius;
    }

    public void calculateSurface() {
        surface = Math.PI * Math.pow(radius, 2);
    }
}
