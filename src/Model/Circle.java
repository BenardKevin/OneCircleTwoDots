package Model;

public class Circle extends Shape {
    private Point point1;
    private Point point2;
    private double radius;

    public Circle(double x1, double y1, double x2, double y2) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        calculateRadius();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateRadius() {
        radius = Math.sqrt(Math.pow(point1.getY() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getX(), 2));
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI * Math.pow(radius, 2);
    }
}
