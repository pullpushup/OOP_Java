package Arrays;

import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInt = getIntegers(5);
        int[] sorted = sortInt(myInt);
        printArray(sorted);
     }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i = 0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i =0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortInt(int[] array) {
        int[] sortArray = new int[array.length];
        for(int i =0; i<array.length; i++) {
            sortArray[i] =array[i];
        } boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            //element 0   50
            //element 1   160
            //element 2   40
            for(int i=0; i<sortArray.length-1; i++) {
                if(sortArray[i] < sortArray[i+1]) {
                    temp = sortArray[i];
                    sortArray[i] = sortArray[i+1];
                    sortArray[i+1] = temp;
                    flag = true;
                }
            }
        }return sortArray;
    }



}
