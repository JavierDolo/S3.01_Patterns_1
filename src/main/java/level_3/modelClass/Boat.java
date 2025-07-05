package level_3.modelClass;

public class Boat implements Vehicle {
    @Override
    public void start() {
        System.out.println("Ahoy! Starting engines and dreaming of pirates.");
    }

    @Override
    public void accelerate() {
        System.out.println("Full steam ahead! Fish stay out of my way!");
    }

    @Override
    public void brake() {
        System.out.println("Throwing anchor like I mean it. Hope Poseidón approves.");
    }
}
