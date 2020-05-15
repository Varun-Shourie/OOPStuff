package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car(); // you can treat Car as a data type.
        // it's actually a class, but we can treat it as one.
        // new data type called Porsche (object) of type car.

        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
