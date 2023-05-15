package graphiceditor.shapes;

public class Pentagon extends Shape{
    int side;

    public Pentagon(int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Pentagon";
    }

    @Override
    public int getArea() {
        double area = (0.25) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(side, 2);
        return (int) area;
    }
}
