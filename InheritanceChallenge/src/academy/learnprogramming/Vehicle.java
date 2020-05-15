package academy.learnprogramming;

public class Vehicle { // by vehicle, I construe vehicles present after 1920s as vehicles.

    private String model;
    private int seats;
    private int engine;
    private int horsePower;
    private int steeringWheel;

    public Vehicle(String model, int seats, int engine, int horsePower, int steeringWheel) {
        this.model = model;
        this.seats = seats;
        this.engine = engine;
        this.horsePower = horsePower;
        this.steeringWheel = steeringWheel;
    }

    public void steer() {
        System.out.println("Vehicle.steer called: " + model + " has changed direction.");
    }

    public void changeGears() {
        System.out.println("Vehicle.changeGears called: " + model + " has changed gears");
    }

    public void move(int speed) {
        System.out.println("Vehicle.move called: " + model + " is moving at " + speed  + " miles per hour");
    }

    public String getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

    public int getEngine() {
        return engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }
}
