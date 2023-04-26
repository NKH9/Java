package Task2;

public class ConcreteVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle creatVehicle(String str) {
        Vehicle vehicleItem;
        if (str == "car" ) {
            vehicleItem = new Car();
        } else {
            vehicleItem = new Motorcycle();
        }
        return vehicleItem;
    }
    static Vehicle createVehicleWithPrivateConstructor(String str) {
        Vehicle vehicleItem;
        if (str == "car" ) {
            vehicleItem = new Car();
        } else {
            vehicleItem = new Motorcycle();
        }
        return vehicleItem;

    }
}
