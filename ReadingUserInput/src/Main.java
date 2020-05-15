import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    }

    private static void promptUserAge() {
        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key);

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            }
            else {
                System.out.println("Invalid year of birth");
            }
        }
        else {
            System.out.println("Unable to parse year of birth");
        }

        /*String yearOfBirth = scanner.nextLine();
        System.out.println("Your birth year is " + yearOfBirth);
        int yearAsNumber = Integer.parseInt(yearOfBirth);*/

        scanner.close();
    }


}
