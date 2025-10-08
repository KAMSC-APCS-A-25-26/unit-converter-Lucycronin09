
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        /*
        Enter your choice (1, 2, or 3): 1
Enter distance in miles: 5.0

Conversion Results:
Miles: 5.0
Kilometers: 8.04675

Choose conversion direction:
1. Convert Miles to Kilometers
2. Convert Kilometers to Miles
3. Exit

Enter your choice (1, 2, or 3): 2
Enter distance in kilometers: 10.0

Conversion Results:
Kilometers: 10.0
Miles: 6.21371

Choose conversion direction:
1. Convert Miles to Kilometers
2. Convert Kilometers to Miles
3. Exit

Enter your choice (1, 2, or 3
         */
        boolean status = true;
        while(status)
        {
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.println("\nEnter your choice (1, 2, or 3): ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case(1):
                {
                    System.out.println("Enter distance in Miles: ");
                    double distanceMiles = sc.nextDouble();
                    System.out.println("\nConversion Results: ");
                    double kilometersConverted = distanceMiles * 1.60935;
                    System.out.println("Miles: " + distanceMiles);
                    System.out.println("Kilometers: " + kilometersConverted);
                    System.out.println();
                    break;
                }
                case(2):
                {
                    System.out.println("Enter distance in Kilometers: ");
                    double distanceKilometers = sc.nextDouble();
                    System.out.println("\nConversion Results: ");
                    double milesConverted = distanceKilometers / 1.60935;
                    System.out.println("Kilometers: " + distanceKilometers);
                    System.out.println("Miles: " + milesConverted);
                    System.out.println();
                    break;
                }
                case(3):
                {
                    System.out.println("Goodbye!");
                    status = false;
                    break;
                }

            }
        }
        /*


         */
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
    }
}