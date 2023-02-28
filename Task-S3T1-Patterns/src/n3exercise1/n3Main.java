package n3exercise1;

import n3exercise1.actions.BrakeVehicle;
import n3exercise1.actions.RevvVehicle;
import n3exercise1.actions.StartVehicle;

import java.util.ArrayList;
import java.util.List;

public class n3Main {
    public static void main(String[] args) {
        List<Vehicle> parking = new ArrayList<Vehicle>();
        parking.add(new Vehicle("Car"));
        parking.add(new Vehicle("Ship"));
        parking.add(new Vehicle("Plane"));
        parking.add(new Vehicle("Bike"));


        ParkingMan parkingMan = new ParkingMan();

        Vehicle car = parking.get(0);
        Vehicle plane = parking.get(2);


        //Car Example
        System.out.println("Car:");
        parkingMan.takeAction(new RevvVehicle(car));
        parkingMan.doActions(); //it will not work bc the car is not started

        parkingMan.takeAction(new StartVehicle(car));
        parkingMan.takeAction(new RevvVehicle(car));
        parkingMan.doActions();
        System.out.println();

        //Plane example
        System.out.println("Plane");
        parkingMan.takeAction(new StartVehicle(plane));
        parkingMan.takeAction(new BrakeVehicle(plane));
        parkingMan.doActions();



    }
}
