package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
//        dog.eat(); // even if from animal class, we can use in dog class since it has inherited.
        dog.walk();
//        dog.run();
    }
}
