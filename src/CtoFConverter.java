import java.util.Scanner;
public class CtoFConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = getValidTemperature(scanner);
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("The equivalent temperature in Fahrenheit is: %.2f\n", fahrenheit);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double getValidTemperature(Scanner scanner) {
        while (true) {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
