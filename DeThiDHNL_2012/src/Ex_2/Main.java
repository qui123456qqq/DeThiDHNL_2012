package Ex_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ManagementVehicle managementVehicle = new ManagementVehicle();
        ArrayList<Vehicle> list = managementVehicle.vehicleArrayList;
        Manufactor m1 = new Manufactor("AHonda", "Japan");
        Manufactor m2 = new Manufactor("Toyota", "Japan");
        Manufactor m3 = new Manufactor("Huyndai", "Korea");
        Vehicle car = new Car("Civic", 2010, 28000, m1, 4, 200, 13);
        list.add(car);
        Vehicle bus = new Bus("Hiace", 2011, 35000, m2, 12);
        list.add(bus);
        Vehicle truck = new Truck("MIGHTY", 2006, 18000, m3, 2.5);
        list.add(truck);
        Vehicle truck1 = new Truck("MIGHTY", 2010, 18000, m3, 2.5);
        list.add(truck1);

        managementVehicle.showInfo();
        System.out.println(truck.discount());
        managementVehicle.sort();
        managementVehicle.showInfo();
        managementVehicle.sort2();
        managementVehicle.showInfo();
    }
}
