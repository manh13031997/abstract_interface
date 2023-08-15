public class Main {
    public static void main(String[] args) {
   CircleComparator comparable = new CircleComparator();
   Circle circle = new Circle(10);
        Circle circle1 = new Circle(20);
        System.out.println(comparable.compare(circle1,circle));
    }

}
