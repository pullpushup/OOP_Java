package JavaProblems;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        System.out.println("Enter sum you wanna Add");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        //int c = a+b;

        System.out.println("Sum is : "+ (a+b));

    }
}