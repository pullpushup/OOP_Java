package JavaProblems;

import java.util.Scanner;

public class KilometerToMiles {

        public static void main(String[] args)
        {
            double kiloMeters, miles;
            double conversionFactor = 1.609344;

            System.out.println("Enter distance value in Km : ");
            Scanner input = new Scanner(System.in);
            kiloMeters = input.nextDouble();

            miles = kiloMeters/conversionFactor;

            System.out.println("This distance in Miles : " + miles);
        }


}
