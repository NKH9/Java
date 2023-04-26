package Shape;

public class Cube extends ThreeDimensionalShape{
    double Area;
    double Side;
    String Name;
    double Volume;

    public Cube( double x) {
        this.Side=x;
    }

    @Override
    double getVolume() {
        return Side*Side*Side;
    }


    @Override
    public String toString() {
        return "Cube{" +
                "Area=" + Area +
                ", Side=" + Side +
                ", Name='" + Name + '\'' +
                ", Volume=" + Volume +
                '}';
    }
}
