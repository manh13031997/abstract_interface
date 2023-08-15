public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color){
        this.color=color;
    }
    public Circle(boolean filled){
        this.filled=filled;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean getFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
}
