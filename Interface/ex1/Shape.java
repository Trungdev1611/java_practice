package Interface.ex1;

public interface Shape {
    int getArea();

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 3);
        rectangle.getArea();

        Shape rectangle2 = new Rectangle(4.5, 3.5);
        rectangle2.getArea();
        rectangle2.getArea();

    }
}
