package Task2;

public class Car extends Vehicle{
    String myName="Car object !!!";

    @Override
    public String toString() {
        return "Car{" +
                "myName='" + myName + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
