import static java.lang.Math.*;
public class Square extends Rectangle{
    private double side;
    private Point point_1;
    private Point point_2;
    private Point point_3;
    private Point point_4;

    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.side =x4-x1;
        point_1=new Point(x1,y1);
        point_2=new Point(x2,y2);
        point_3=new Point(x3,y3);
        point_4=new Point(x4,y4);
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calc_S() {
        return pow(side,2);
    }

    @Override
    public double calc_perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", point_1=" + point_1 +
                ", point_2=" + point_2 +
                ", point_3=" + point_3 +
                ", point_4=" + point_4 +
                '}';
    }

    public static void main(String [] args) {
        Square sq=new Square(0,0,0,5,5,5,5,0);
        System.out.println(sq.toString());
        System.out.println(sq.calc_S());
    }
}
