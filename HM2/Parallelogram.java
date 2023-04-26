import org.w3c.dom.xpath.XPathResult;

public class Parallelogram extends Trapezoid {
    private Point point_1;
    private Point point_2;
    private Point point_3;
    private Point point_4;
    private double base;
    private double height;

    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        point_1=new Point(x1,y1);
        point_2=new Point(x2,y2);
        point_3=new Point(x3,y3);
        point_4=new Point(x4,y4);
        this.height=y2-y1;
        this.base=point_1.calc_Distance(point_4);

    }
    public double getBaseUp() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public double calc_S() {
        return base*height;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "point_1=" + point_1 +
                ", point_2=" + point_2 +
                ", point_3=" + point_3 +
                ", point_4=" + point_4 +
                ", base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    public double calc_perimeter() {
        return super.calc_perimeter();
    }
    public static void main(String[] args) {
        Parallelogram pr = new Parallelogram(0,0,2,2,6,2,0,4);
        System.out.println(pr.calc_S());
        System.out.println(pr.toString());
    }
}
