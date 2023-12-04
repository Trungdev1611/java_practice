package Interface.ex1;

/**
 * Rectangle
 */
public class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(double d, double e) {
        this.length = d;
        this.width = e;
    }

    @Override
    public int getArea() {
        double s = length * width;
        System.out.println("S:::" + (int) s);
        return (int) s;
    }

}