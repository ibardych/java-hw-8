package graphiceditor.shapes;

public class Triangle extends Shape{
    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public int getArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2.0;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        return (int) area;
    }
}
