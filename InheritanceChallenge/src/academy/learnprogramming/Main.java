package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("Ford Mustang",720, 2,1,"Leather","Auto");
        car.brake();
        car.accelerate(200);
        MuscleCar chevelle = new MuscleCar("Chevelle", 5,1790,
                8,"Leather","Manual", 5000, 0, 20,
                100);
        chevelle.guzzleGas(100);
        chevelle.revEngine(155);
    }
    /*
    Challenge:
    Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
    Finally, create another class, a specific type of Car that inherits from the Car class.
    You should be able to handle steering, changing gears, and moving (speed in other words).
    You will want to decide where to put the appropriate state and behaviors (fields and methods).
    As mentioned above, changing gears, increasing/decreasing speed should be included.
    For your specific type of behicle you will want to add something specific for that type of car.
     */
}
