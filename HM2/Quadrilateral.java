public class Quadrilateral {
    private Point point_1;
    private Point point_2;
    private Point point_3;
    private Point point_4;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        point_1=new Point(x1,y1);
        point_2=new Point(x2,y2);
        point_3=new Point(x3,y3);
        point_4=new Point(x4,y4);
    }
    public double calc_perimeter() {
        double p12=point_1.calc_Distance(point_2);
        double p23=point_2.calc_Distance(point_3);
        double p34=point_3.calc_Distance(point_4);
        double p41=point_4.calc_Distance(point_1);
        return p12+p23+p34+p41;

    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "point_1=" + point_1 +
                ", point_2=" + point_2 +
                ", point_3=" + point_3 +
                ", point_4=" + point_4 +
                '}';
    }

    public static void main(String[] args){
        Quadrilateral q1=new Quadrilateral(0,0,0,2,2,2,2,0);
        System.out.println(q1.calc_perimeter());
        System.out.println(q1.toString());
    }

}
