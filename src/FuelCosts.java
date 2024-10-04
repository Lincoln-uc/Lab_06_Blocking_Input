import java.util.Scanner;
public class FuelCosts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallonsInTank = getValidInput(scanner, "Enter the number of gallons of gas in the tank: ");
        double fuelEfficiency = getValidInput(scanner, "Enter the fuel efficiency in miles per gallon: ");
        double pricePerGallon = getValidInput(scanner, "Enter the price of gas per gallon: ");

        double costToDrive100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double distanceWithFullTank = gallonsInTank * fuelEfficiency;

        System.out.printf("The cost to drive 100 miles is: $%.2f\n", costToDrive100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.\n", distanceWithFullTank);
    }

    public static double getValidInput(Scanner scanner, String prompt) {
        double value;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
                System.out.print(prompt);
            }
            value = scanner.nextDouble();
        } while (value <= 0);
        return value;
    }
}
