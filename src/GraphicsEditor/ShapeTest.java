package GraphicsEditor;

import GraphicsEditor.Shapes.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add((new Circle("Sun","Yellow",15000)));
        shapes.add(new Rectangle("Wood","Browm",1000,50));
        shapes.add(new Trapeze("Block13","Pink"));
        shapes.add(new Triangle("Roof","White"));
        shapes.add(new Quad("by Malevich","Black",190));
        shapes.add(new Rhombus("Buba","Red",3));


        System.out.println(PrettyPrinter.print(shapes));
    }
    }



