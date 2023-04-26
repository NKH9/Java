public class Rectangle extends Parallelogram{
    private double height;
    private double width;
    private Point point_1;
    private Point point_2;
    private Point point_3;
    private Point point_4;

    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height =y2-y1;
        this.width =x4-x1;
        point_1=new Point(x1,y1);
        point_2=new Point(x2,y2);
        point_3=new Point(x3,y3);
        point_4=new Point(x4,y4);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", point_1=" + point_1 +
                ", point_2=" + point_2 +
                ", point_3=" + point_3 +
                ", point_4=" + point_4 +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calc_S() {
        return height*width;
    }

    @Override
    public double calc_perimeter() {
        return super.calc_perimeter();
    }
    public static void  main(String[] args) {
        Rectangle rc=new Rectangle(0,0,0,5,8,5,8,0);
        System.out.println(rc.calc_S());
        System.out.println(rc.toString());
    }
}
