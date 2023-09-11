public class Quad extends Shape implements Perimeter{
    private int a;


    public Quad(String name, String color,int a) {
        super(name, color);
        this.a=a;

    }
    public long getPerimeter() {

        return (long)a*4;
    }

    @Override
    public String getType() {
        return "Quad";
    }

}
