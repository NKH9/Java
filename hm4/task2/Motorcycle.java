package Task2;

public class Motorcycle extends Vehicle{

    String myName="Motorcycle object !!!";

    @Override
    public String toString() {
        return "Motorcycle{" +
                "myName='" + myName + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Riding a motorcycle");
    }
}
