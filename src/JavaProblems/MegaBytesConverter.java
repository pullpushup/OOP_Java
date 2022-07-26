package JavaProblems;

import java.util.Scanner;

public class MegaBytesConverter {
    public static void main(String[] args)
    {
        double kiloBytes, megaBytes;
        double conversionFactor = 1024;

        System.out.println("Enter kiloBytes : ");
        Scanner input = new Scanner(System.in);
        megaBytes = input.nextDouble();

        kiloBytes = megaBytes * conversionFactor;

        System.out.println("Mega Bytes : " + kiloBytes);
    }
}
