package n3exercise1.actions;

import n3exercise1.Vehicle;

public class StartVehicle implements Action{
    Vehicle vehicle;

    public StartVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    @Override
    public void execute() {
        vehicle.start();
    }
}
