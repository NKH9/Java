package Shape;

public class Circle extends TwoDimensionalShape{
    String Name;
    double Area;
    double Radius;

    Circle(double x) {
        this.Radius = x;
    }

    @Override
    double getArea() {
        return Math.PI * Radius * Radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Name='" + Name + '\'' +
                ", Area=" + Area +
                ", Radius=" + Radius +
                '}';
    }
}
