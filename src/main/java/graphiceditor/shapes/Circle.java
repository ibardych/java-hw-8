package graphiceditor.shapes;

public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public int getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return (int) area;
    }
}
