package Task2;

public class Main {
    public static void main(String[] args) {
        ConcreteVehicleFactory Item = new ConcreteVehicleFactory();
        System.out.println(Item.creatVehicle("car"));
        System.out.println(Item.createVehicleWithPrivateConstructor("motorcycle"));
        Item.creatVehicle("car").drive();
        Item.createVehicleWithPrivateConstructor("motorcycle").drive();


    }

}
