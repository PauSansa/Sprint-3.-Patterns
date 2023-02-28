package n3exercise1.actions;

import n3exercise1.Vehicle;
import n3exercise1.actions.Action;

public class RevvVehicle implements Action {
    private Vehicle vehicle;

    public RevvVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute(){
        vehicle.rev();
    }
}
