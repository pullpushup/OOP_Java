package Loop;

import java.util.Random;

public class RandomLoop {
    public static void main (String[] args)
    {
        Random omu = new Random();
        int somu = omu.nextInt(999);
        String ansh = omu.toString();

//        for(int i =1; i<somu; i++)
//        {
//                System.out.println(i);
//
//        }
        System.out.println("random String" + ansh);
    }
}
