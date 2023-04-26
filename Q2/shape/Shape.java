package Shape;

import com.sun.source.tree.ArrayAccessTree;

public abstract class Shape {
    String Name;
    Double x;
    Double y;

    public Shape() {}
    public Shape(String name, Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public static void  Shape() {}

    @Override
    public String toString() {
        return "Shape{" +
                "Name='" + Name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
