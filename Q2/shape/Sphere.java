package Shape;

public class Sphere extends ThreeDimensionalShape{
    double Area;
    String Name;
    double Radius;
    double Volume;

    public  Sphere(double x) {
        this.Radius=x;
    }
    @Override
    double getVolume() {
        return Radius*4*3.14;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "Area=" + Area +
                ", Name='" + Name + '\'' +
                ", Radius=" + Radius +
                ", Volume=" + Volume +
                '}';
    }
}
