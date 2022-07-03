package Ex_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ManagementVehicle   {
    ArrayList<Vehicle> vehicleArrayList;

    public ManagementVehicle() {
        vehicleArrayList = new ArrayList<Vehicle>();
    }

    public void showInfo(){
        for (Vehicle v : this.vehicleArrayList){
            System.out.println(v.toString());
        }
    }
    public void sort(){
        Collections.sort(this.vehicleArrayList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.getManufactor().getNameCompany().compareTo(o2.getManufactor().getNameCompany());
            }
        });
    }
    public void sort2(){
        Collections.sort(this.vehicleArrayList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                if (o1.getMadeYear() > o2.getMadeYear())
                    return 1;
//                if (o1.getMadeYear() == o2.getMadeYear())
//                    return 0;
                else
                    return -1;
            }
        });
    }
}
