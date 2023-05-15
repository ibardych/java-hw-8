package graphiceditor.shapes;

public class Hexagon extends Shape{
    int side;

    public Hexagon(int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Hexagon";
    }
    @Override
    public int getArea() {
        double area = (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
        return (int) area;
    }

}
