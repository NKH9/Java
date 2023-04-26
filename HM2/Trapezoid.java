import static java.lang.Math.*;

public class Trapezoid extends Quadrilateral{
    private Point point_1;
    private Point point_2;
    private Point point_3;
    private Point point_4;
    private double baseUp;
    private double baseDown;
    private double height;
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.baseUp=x3-x2;
        this.baseDown=x4-x1;
        this.height=abs(y2-y1);
        point_1=new Point(x1,y1);
        point_2=new Point(x2,y2);
        point_3=new Point(x3,y3);
        point_4=new Point(x4,y4);
    }
    public double getBaseUp() {
        return baseUp;
    }
    public double getBaseDown() {
        return baseDown;
    }
    public double getHeight() {
        return height;
    }
    public double calc_S() {
        return height*(baseDown+baseUp)/2;
    }

    @Override
    public double calc_perimeter() {
        return super.calc_perimeter();
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "point_1=" + point_1 +
                ", point_2=" + point_2 +
                ", point_3=" + point_3 +
                ", point_4=" + point_4 +
                ", baseUp=" + baseUp +
                ", baseDown=" + baseDown +
                ", height=" + height +
                '}';
    }

    public static void main(String [] args) {
        Trapezoid tr=new Trapezoid(0,0,3,4,5,4,8,0);
        System.out.println(tr.calc_perimeter());
        System.out.println(tr.calc_S());
        System.out.println(tr.baseDown);
        System.out.println(tr.baseUp);
        System.out.println(tr.height);
        System.out.println(tr.toString());
    }
}
