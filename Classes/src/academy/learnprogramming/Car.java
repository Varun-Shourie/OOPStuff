package academy.learnprogramming;

public class Car {
// public - unrestricted access to class
    // private - no other class can access this class
    // protected - classes in package can access this class.
    // for now, don't worry about it.
    // a class is a blueprint for a new object.

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
