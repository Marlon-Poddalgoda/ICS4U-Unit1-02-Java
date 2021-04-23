import java.util.Scanner;
/**
 * This program calculates how many logs can fit on a truck.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-04-22
 */

public final class LogCarry {
    private LogCarry() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }
    /**
    * This method calculates how many logs can go on a truck.
    * @param args
    */
    public static void main(final String[] args) {

        // Create new Scanner-type variable
        Scanner input = new Scanner(System.in);

        // Constants
        final float carryCapacity = 1100f;
        final float weightPerMeter = 20f;
        final float shortLog = 0.25f;
        final float mediumLog = 0.5f;
        final float longLog = 1f;

        // Variables
        float logLength = 0;
        float numOfLogs = 0;
        int intOfLogs = 0;

        System.out.println("This program calculates the number of logs a"
            + " truck can carry.");
        System.out.println("Please enter the length of the logs in meters.");
        System.out.println();

        // Asks user to enter one of several choices
        System.out.print("Valid choices -> 0.25, 0.5, 1: ");

        while (true) {
            // input
            while (!input.hasNextFloat()) {
                System.out.println("That's not a number!");
                System.out.print("Valid choices -> 0.25, 0.5, 1: ");
                input.next(); // advances scanner until it gets correct value
            }
            logLength = input.nextFloat();

            if (logLength == shortLog || logLength == mediumLog
                || logLength == longLog) {
                // process
                numOfLogs = carryCapacity / (logLength * weightPerMeter);
                intOfLogs = (int) numOfLogs;

                // output
                System.out.println();
                System.out.println("The truck can carry " + intOfLogs
                    + " logs that are "  + logLength + " meter(s) long.");

                // End of program
                break;

            } else {
                System.out.println("That's not an option!");
                System.out.print("Valid choices -> 0.25, 0.5, 1: ");
            }
        }
    }
}
