package Shape;

public class ShapeTest {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(10),
                new Squire(5),
                new Cube(15),
                new Sphere(20),
        };
        for (Shape shape: shapes ) {
            if(shape instanceof TwoDimensionalShape) {
                System.out.println(((TwoDimensionalShape) shape).getArea());
            }
            else if(shape instanceof ThreeDimensionalShape ) {
                System.out.println(((ThreeDimensionalShape) shape).getVolume());
            }
        }

    }
}
