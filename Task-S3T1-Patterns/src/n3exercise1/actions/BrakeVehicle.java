package n3exercise1.actions;

import n3exercise1.Vehicle;

public class BrakeVehicle implements Action {
    private Vehicle vehicle;

    public BrakeVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }
}
