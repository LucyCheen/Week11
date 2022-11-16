
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.computeArea());
        Circle c2 = new Circle(5);
        System.out.println(c2.computeArea());
        Circle c3 = new Circle(10);
        System.out.println(c3.computeArea());
        System.out.println(Circle.PI);

    }
}
