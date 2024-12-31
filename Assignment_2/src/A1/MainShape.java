package A1;

import A1.RectangleShape.Square;

public class MainShape {
    public static void main(String[] args) {
        RectangleShape RS = new RectangleShape();
        Square SQ = RS.new Square();

        SQ.SquareIsRectangle();

    }
}
