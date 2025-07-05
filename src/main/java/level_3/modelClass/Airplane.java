package level_3.modelClass;

public class Airplane implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting turbines... Please fasten your seatbelts.");
    }

    @Override
    public void accelerate() {
        System.out.println("We're ready to take off! Say goodbye to gravity!");
    }

    @Override
    public void brake() {
        System.out.println("Reducing thrust... and pretending we're not in a metal tube at 800 km/h.");
    }
}
