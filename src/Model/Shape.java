package Model;

public abstract class Shape {

    abstract double calculateSurface();

    abstract double calculateCircumference();

    public void display(Shape shape) {

        System.out.printf("%s\n - Aire: %.2f\n - Périmètre: %.2f\n\n", shape.getClass().getSimpleName(), calculateSurface(), calculateCircumference());
    };

}
