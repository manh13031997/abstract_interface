public class Circle extends Square {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        super(radius, color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius;
    }

    @Override
    public String getColor() {
        return "color all four sides";
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
