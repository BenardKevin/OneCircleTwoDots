import Model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Circle(10, 15, 20, 20));
        list.add(new TriangleEquilateral(14));
        list.add(new Circle(10));
        list.add(new RectangularTriangle(5,9));
        list.add(new Rectangle(10, 10));
        list.add(new Triangle(5, 4, 8));

        for (Shape shape : list) shape.display(shape);

    }
}
