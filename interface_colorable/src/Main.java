public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[1];
        circles[0] = new Circle(5.0, "red");
        for (Circle circle : circles) {
            System.out.println("area: " + circle.getArea());
            if (circle instanceof ColorAble) {
                ((ColorAble) circle).howToColor();
            }
        }
    }
}