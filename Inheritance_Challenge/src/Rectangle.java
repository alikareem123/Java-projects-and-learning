public class Rectangle {
    private double width, length;

    public Rectangle(double width, double length) {
        width = width < 0 ? 0 : width;
        length = length < 0 ? 0 : length;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
