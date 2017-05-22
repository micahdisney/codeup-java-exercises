package Java2;

/**
 * Created by micahdisney on 5/19/17.
 */

public class Rectangle extends Quadralateral implements Measurable {

    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}
