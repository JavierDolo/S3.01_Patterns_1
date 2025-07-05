package level_3.modelClass;

public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Pedal to the metal, literally!");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle accelerating, I'm basically a rocket on two wheels.");
    }

    @Override
    public void brake() {
        System.out.println("Braking... and hoping gravity is kind.");
    }
}
