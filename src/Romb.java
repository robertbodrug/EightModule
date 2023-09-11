public class Romb extends Shape implements Perimeter{
    private int a;

    public Romb(String name, String color, int a) {
        super(name, color);
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }


    public long getPerimeter() {
        return (long)a*4;
    }

    @Override
    public String getType() {
        return "Romb";
    }
}
