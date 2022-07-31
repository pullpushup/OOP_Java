package Arrays;

public class MainArrays {
    public static void main(String[] args){
        int[] myVariable = new int[10];// {1,2,3,4,5,6,7,8,9,10};;
//        myVariable[0] = 45;
//        myVariable[1] = 476;
//        myVariable[5] = 50;

        for(int i=0; i<10; i++){
            myVariable[i] = i*10;
        }
        for(int i =0; i<10; i++) {
            System.out.println("Element " + i + ", value is" +myVariable[i] );
        }
    }
}
