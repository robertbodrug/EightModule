import java.util.List;

public class PrettyPrinter {
    public static String print(List<Shape> shapes){
        StringBuilder result =new StringBuilder();
        for (Shape shape:shapes){
            if(shape instanceof Square&&shape instanceof Perimeter) {
                result.append("Type: ");
                result.append(shape.getType());
                result.append("\nName: ");
                result.append(shape.getName());
                result.append("\nColor: ");
                result.append(shape.getColor());
                result.append("\nPerimeter: ");
                result.append(((Perimeter) shape).getPerimeter());
                result.append("\nSquare: ");
                result.append(((Square) shape).getSquare());
                result.append("\n\n\n");

            }else
            if (shape instanceof Perimeter){
                result.append("Type: ");
                 result.append(shape.getType());
                result.append("\nName: ");
                result.append(shape.getName());
                result.append("\nColor: ");
                result.append(shape.getColor());
                result.append("\nPerimeter: ");
                result.append(((Perimeter) shape).getPerimeter());
                result.append("\n\n\n");

        }else {
                result.append("Type: ").append(shape.getType()).
                        append("\nName: ").append(shape.getName()).
                        append("\nColor: ").append(shape.getColor()).
                        append("\n\n\n");
            }

        }

    return result.toString();
    }

}
