package Java2;

/**
 * Created by micahdisney on 5/19/17.
 */

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(5.5, 3.0);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(3.0);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
