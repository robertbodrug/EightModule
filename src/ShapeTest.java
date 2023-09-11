import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add((new Circle("Sun","Yellow",15)));
        shapes.add(new Rectangle("Wood","Browm",1000,50));
        shapes.add(new Trapeze("Block13","Pink"));
        shapes.add(new Triangle("Roof","White"));
        shapes.add(new Quad("by Malevich","Black",100));
        shapes.add(new Romb("Buba","Red",3));
        System.out.println(PrettyPrinter.print(shapes));
    }
    }



