package level_3.controller;

import level_3.commandPattern.Command;

public class VehicleController {
    private final Command startCommand;
    private final Command accelerateCommand;
    private final Command brakeCommand;

    public VehicleController(Command start, Command accelerate, Command brake) {
        this.startCommand = start;
        this.accelerateCommand = accelerate;
        this.brakeCommand = brake;
    }

    public void startVehicle() {
        startCommand.execute();
    }

    public void accelerateVehicle() {
        accelerateCommand.execute();
    }

    public void brakeVehicle() {
        brakeCommand.execute();
    }
}
