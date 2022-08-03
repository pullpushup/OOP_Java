package JavaProblems;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args){


        System.out.println("EnterRow");
        Scanner input = new Scanner(System.in);
     int rows = input.nextInt();
       // int row1 = 5;

        for(int i =1; i<=rows; i++)
        {
            for(int j= 1; j<=i; ++j)
            {
                System.out.print("* ");
            }System.out.println();
        }


    }
}
