import java.util.Scanner;
import java.util.Random;

public class HighorLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1; // Generates a random number between 1 and 10
        int userGuess = getValidGuess(scanner);

        System.out.println("The random number was: " + randomNumber);

        if (userGuess < randomNumber) {
            System.out.println("Your guess was too low!");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("You guessed it! On the money!");
        }
    }

    public static int getValidGuess(Scanner scanner) {
        int guess;
        do {
            System.out.print("Guess a number between 1 and 10: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer between 1 and 10.");
                scanner.next(); // Clear the invalid input
                System.out.print("Guess a number between 1 and 10: ");
            }
            guess = scanner.nextInt();
        } while (guess < 1 || guess > 10);
        return guess;
    }
}
