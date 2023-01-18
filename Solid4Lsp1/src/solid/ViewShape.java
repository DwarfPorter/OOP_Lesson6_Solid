package solid;

import solid.lsp.Rectangle;
import solid.lsp.Shape;

public class ViewShape {
    public Shape shape;

    public ViewShape(Shape shape) {
        this.shape = shape;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(shape.getArea());
    }
}
