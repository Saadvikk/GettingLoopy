import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        boolean done = true;

        do {
            System.out.print("Enter a temperature in Celsius: ");
            done = scanner.hasNextDouble();

            if (done) {
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Degrees celsius " + celsius + " is equal to degrees fahrenheit " + fahrenheit);
            } else {
                System.out.println("Please enter a valid input.");
                scanner.nextLine();  // Consume the invalid input
            }
        } while (done = false);

        scanner.close();

    }
}
