import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit

        /*
        Convert time to total seconds

Enter hours: 1
Enter minutes: 28
Enter seconds: 42

Time Conversion:
Input: 1 hour, 28 minute, and 42 second
Total seconds: 5322 seconds

Calculation:
1 hours × 3600 = 3600 seconds
28 minutes × 60 = 1680 seconds
42 seconds = 42 seconds
Total: 5322 seconds

Do you want to convert another time? (y/n): y

Convert time to total seconds

Enter hours: 2
Enter minutes: 15
Enter seconds: 30

Time Conversion:
Input: 2 hour, 15 minute, and 30 second
Total seconds: 8130 seconds

Calculation:
2 hours × 3600 = 7200 seconds
15 minutes × 60 = 900 seconds
30 seconds = 30 seconds
Total: 8130 seconds

Do you want to convert another time? (y/n): n
Goodbye!
         */
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        while (status)
        {
            System.out.println("Convert time to total seconds");
            System.out.println();
            System.out.print("Enter hours: ");
            int timeHours = sc.nextInt();
            System.out.print("Enter minutes: ");
            int timeMinutes = sc.nextInt();
            System.out.print("Enter seconds: ");
            int timeSeconds = sc.nextInt();
            System.out.println();
            System.out.println();
            System.out.println("Time Conversion: ");
            System.out.println("Input: " + timeHours + " hour, " + timeMinutes + " minute, and " + timeSeconds + " second.");


        }
    }
}