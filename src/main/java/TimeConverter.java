import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
  
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
            System.out.println("Time Conversion: ");
            System.out.println("Input: " + timeHours + " hour, " + timeMinutes + " minute, and " + timeSeconds + " second.");
            int totalTime = timeSeconds + (timeHours * 3600) + (timeMinutes * 60);
            System.out.println("Total seconds: " + totalTime + " seconds");
            System.out.println();
            System.out.println("Calculation:");
            System.out.println(timeHours + " hours × 3600 = " + (timeHours * 3600) + " seconds");
            System.out.println(timeMinutes + " minutes × 60 = " + (timeMinutes * 60) + " seconds");
            System.out.println(timeSeconds + " seconds = " + timeSeconds + " seconds");
            System.out.println("Total: " + totalTime + " seconds");
            System.out.println("");
            System.out.println("Do you want to convert another time? (y/n): ");
            String answer = sc.next();
            if(answer.equals("n"))
            {
                status = false; 
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        


        }
    }
}