package Model;

public class Triangle extends Shape {
    private double coteA;
    private double coteB;
    private double coteC;

    public Triangle(double coteA, double coteB, double coteC) {
        this.coteA = coteA;
        this.coteB = coteB;
        this.coteC = coteC;
    }

    public Triangle(double coteAB, double coteC) {
        this.coteA = coteAB;
        this.coteB = coteAB;
        this.coteC = coteC;
    }

    public Triangle(double cote) {
        this.coteA = cote;
        this.coteB = cote;
        this.coteC = cote;
    }


    @Override
    double calculateSurface() {

        double s = (coteA + coteB + coteC) / 2;
        return  Math.sqrt(s * (s - coteA) * (s - coteB) * (s - coteC));
    }

    @Override
    double calculateCircumference() {
        return (coteA + coteB + coteC);
    }
}
