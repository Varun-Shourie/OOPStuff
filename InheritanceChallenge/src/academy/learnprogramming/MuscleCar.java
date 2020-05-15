package academy.learnprogramming;

public class MuscleCar extends Car {

    private int bodyWeight;
    private int brand;
    private int gasTankStorage;
    private int engineNoise;

    public MuscleCar(String model, int seats, int horsePower, int engineCylinders,
                     String seatFinishing, String transmission, int bodyWeight,
                     int brand, int gasTankStorage, int engineNoise) {
        super(model, seats, horsePower, engineCylinders, seatFinishing, transmission);
        this.bodyWeight = bodyWeight;
        this.brand = brand;
        this.gasTankStorage = gasTankStorage;
        this.engineNoise = engineNoise;
    }

    public void guzzleGas(int currentSpeed) {
        move(currentSpeed);
        System.out.println("MuscleCar.guzzleGas() called: " + getModel() + " is guzzling hella gas rn @ "
        + currentSpeed);
    }

    public void revEngine(int currentSpeed) {
        changeGears();
        accelerate(currentSpeed);
        System.out.println("MuscleCar.revEngineMax() called: " + getModel() + " is revving its engine "
        + "@ " + currentSpeed);
    }

    public int getBodyWeight() {
        return bodyWeight;
    }

    public int getBrand() {
        return brand;
    }

    public int getGasTankStorage() {
        return gasTankStorage;
    }

    public int getEngineNoise() {
        return engineNoise;
    }

}
