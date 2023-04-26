package Shape;

public abstract class TwoDimensionalShape extends Shape {
    double Area;
    double Dimension1;
    double Dimension2;

    public TwoDimensionalShape() {}
    public TwoDimensionalShape(double x, double y){
        this.Dimension1 = x;
        this.Dimension2 = y;
    }
    abstract double getArea();

}
