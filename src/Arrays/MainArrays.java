package Arrays;

public class MainArrays {
    public static void main(String[] args){
        int[] myVariable = new int[25];// {1,2,3,4,5,6,7,8,9,10};;
//        myVariable[0] = 45;
//        myVariable[1] = 476;
//        myVariable[5] = 50;

        for(int i=0; i<myVariable.length; i++){
            myVariable[i] = i*10;
        }
        printArray(myVariable);
    }
    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
