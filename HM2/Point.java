import static java.lang.Math.*;
public class Point {
    private double xCord;
    private double yCord;
    public Point(double x, double   y) {
        this.xCord=x;
        this.yCord=y;
    }
    public double getxCord(){
        return xCord;
    }
    public double getyCord() {
        return yCord;
    }
    public double calc_Distance(Point p){
        double px=p.getxCord();
        double py=p.getyCord();
        double distance=sqrt(pow((px-xCord),2)+pow((py-yCord),2));
        return distance;
    }
    @Override
    public String toString() {
        return "Point{" +
                "xCord=" + xCord +
                ", yCord=" + yCord +
                '}';
    }
}
