import java.util.Scanner;
public class Main {
    public static void main(String args []) {


        //setting up variables
        Scanner scnr = new Scanner(System.in);
        int milesPerGallon;
        double tankCapacity;
        double percentFilled;
        int rawRange;

        //Asking User's input
        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        milesPerGallon = scnr.nextInt();
        //Ensuring that input is in range
        if(milesPerGallon <= 0){
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        }

        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        tankCapacity = scnr.nextDouble();
        if(tankCapacity <= 0){
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            return;
        }

        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        percentFilled = scnr.nextDouble();
        if(percentFilled < 0 || percentFilled > 100){
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            return;
        }

        //Calculating raw range and casting to give lower rounded number
        rawRange = ((int)(milesPerGallon * tankCapacity * (percentFilled * 0.01)));

        //Determining which message to give user based off of raw range
        if(rawRange <= 25){
            System.out.print("Attention! Your current estimated range is running low: " + rawRange + " miles left!!!");
        }
        if(rawRange > 25){
            System.out.print("Keep driving! Your current estimated range is: " + rawRange + " miles!");
        }

    }
}

