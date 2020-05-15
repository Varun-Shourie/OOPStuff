package academy.learnprogramming;

public class Car extends Vehicle {

    private int engineCylinders;
    private String seatFinishing;
    private String transmission;

    public Car(String model, int seats, int horsePower, int engineCylinders,
               String seatFinishing, String transmission) {
        super(model, seats, 1, horsePower, 1);
        this.engineCylinders = engineCylinders;
        this.seatFinishing = seatFinishing;
        this.transmission = transmission;
    }

    public void brake() {
        System.out.println("Car.brake called: " + getModel() + " has reduced speed or stopped moving");
        changeGears();
        move(0);
    }

    public void accelerate(int speed) {
        System.out.println("Car.accelerate called: " + getModel() + " has increased speed significantly");
        move(speed);
    }

    public int getEngineCylinders() {
        return engineCylinders;
    }

    public String getSeatFinishing() {
        return seatFinishing;
    }

    public String getTransmission() {
        return transmission;
    }
}
