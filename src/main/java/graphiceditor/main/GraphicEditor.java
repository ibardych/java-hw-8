package graphiceditor.main;

import graphiceditor.helpers.AreaPrinter;
import graphiceditor.helpers.ShapePrinter;
import graphiceditor.shapes.*;

public class GraphicEditor {

    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();
        AreaPrinter areaPrinter = new AreaPrinter();

        Shape circle = new Circle(3);
        shapePrinter.printShapeName(circle);
        areaPrinter.printShapeArea(circle);

        Shape triangle = new Triangle(6, 7, 8);
        shapePrinter.printShapeName(triangle);
        areaPrinter.printShapeArea(triangle);

        Shape quad = new Quad(4);
        shapePrinter.printShapeName(circle);
        areaPrinter.printShapeArea(circle);

        Shape pentagon = new Pentagon(5);
        shapePrinter.printShapeName(pentagon);
        areaPrinter.printShapeArea(pentagon);

        Shape hexagon = new Hexagon(6);
        shapePrinter.printShapeName(hexagon);
        areaPrinter.printShapeArea(hexagon);
    }
}
