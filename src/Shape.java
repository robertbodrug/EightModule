public abstract class Shape {
    private String name;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getType();
    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
