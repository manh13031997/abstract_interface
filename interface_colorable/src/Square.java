public class Square implements ColorAble{
private String color;
private double radius;

    public Square(double radius, String color) {
        this.radius =radius;
        this.color=color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public void howToColor() {

    }
}
