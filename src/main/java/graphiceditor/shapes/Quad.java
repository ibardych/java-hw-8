package graphiceditor.shapes;

public class Quad extends Shape {
    int side;

    public Quad(int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Quad";
    }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
