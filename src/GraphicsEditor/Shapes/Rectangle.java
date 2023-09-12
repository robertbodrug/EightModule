package GraphicsEditor.Shapes;

import GraphicsEditor.Function.Perimeter;

public class Rectangle extends Shape implements Perimeter {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }


    public void setB(int b) {
        this.b = b;
    }
    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }



    public Rectangle(String name, String color, int a, int b) {
        super(name, color);
        this.a = a;
        this.b = b;
    }

    public long getPerimeter() {

        return (long)(a+b)*2;
    }

    @Override
    public String getType() {
        return "GraphicsEditor.Shapes.Rectangle";
    }
}
