package solid;

import solid.lsp.Rectangle;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.setSide(4);
        System.out.printf("side in square is  %d \n" , square.getSide());
        ViewShape view = new ViewShape(square);
        view.showArea();
    }
}
