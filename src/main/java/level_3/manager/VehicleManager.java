package level_3.manager;

import level_3.commandPattern.AccelerateCommand;
import level_3.commandPattern.BrakeCommand;
import level_3.commandPattern.StartCommand;
import level_3.controller.VehicleController;
import level_3.modelClass.*;

public class VehicleManager {
    public void setupVehicles() {
        Vehicle[] vehicles = {
                new Car(), new Bicycle(), new Airplane(), new Boat()
        };

        for (Vehicle v : vehicles) {
            System.out.println("---- " + v.getClass().getSimpleName() + " ----");
            VehicleController controller = new VehicleController(
                    new StartCommand(v),
                    new AccelerateCommand(v),
                    new BrakeCommand(v)
            );

            controller.startVehicle();
            controller.accelerateVehicle();
            controller.brakeVehicle();
            System.out.println();
        }
    }
}
