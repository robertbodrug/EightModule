package GraphicsEditor.Shapes;

import GraphicsEditor.Function.Perimeter;
import GraphicsEditor.Function.Square;

public class Circle extends Shape implements Perimeter, Square {


    private int r ;

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public Circle(String name, String color, int r) {
        super(name, color);
        this.r=r;
    }

    @Override
    public String getType() {
        return "Circle";
    }


    @Override
    public long getPerimeter() {
        return (long) Math.PI*2*r;
    }

    @Override
    public long getSquare() {
        return (long) Math.PI*r*r;
    }
}
