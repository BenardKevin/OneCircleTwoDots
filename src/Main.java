import Model.*;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point();
        point1.setX(10);
        point1.setY(15);

        Point point2 = new Point();
        point2.setX(20);
        point2.setY(20);

        Circle c = new Circle(point1, point2);
        c.calculateRadius();
        c.calculateCircumference();
        c.calculateSurface();

        System.out.printf("Radius : %f, Circumference : %f, Surface : %f.\n", c.getRadius(), c.getCircumference(), c.getSurface());

    }
}
