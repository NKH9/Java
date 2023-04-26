package Shape;

public class Squire extends TwoDimensionalShape{
    Double Area;
    String Name;
    Double Side;

    public Squire(double x) {
        this.Side = x;
    }

    @Override
    double getArea() {
        return Side*Side;
    }

    @Override
    public String toString() {
        return "Squire{" +
                "Area=" + Area +
                ", Name='" + Name + '\'' +
                ", Side=" + Side +
                '}';
    }
}
