package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numberCount = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while(numberCount <= 10) {
            System.out.println("Enter number #" + numberCount + ": ");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();

                numberCount++;
                sum += number;
            }
            else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // handles end of the line (enter key)
        }
        
        System.out.println("Sum of 10 inputted numbers: " + sum);
        scanner.close();

    }

}
