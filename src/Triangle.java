public class Triangle extends Shape {


    public Triangle(String name, String color) {
        super(name, color);
    }

    @Override
    public String getType() {
        return "Triangle";
    }
}
