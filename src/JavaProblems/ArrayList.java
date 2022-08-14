package JavaProblems;

import java.util.Scanner;

public class ArrayList {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayMobile mobilePhone = new ArrayMobile("97 50 20 45 50");
    public static void main(String[] args)
    {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextInt();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
            }
        }
    }


    private static void startPhone(){
        System.out.println("Starting phone....");
    }

    private static void printActions()  {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to printContacts\n" +
                           "2 - to add a new contact\n"+
                           "3 - to update existing an existing contact\n"+
                           "4 - to remove an existing contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print a list of available actions.\n");
        System.out.println("Chose your action: ");
    }

}
