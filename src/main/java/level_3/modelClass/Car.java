package level_3.modelClass;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Let's roll! Nothing's stopping us now!");
    }

    @Override
    public void accelerate() {
        System.out.println("Vrooooom! Speed limit? Never heard of it.");
    }

    @Override
    public void brake() {
        System.out.println("Screeeeech! My tires have confidence issues now");
    }
}
