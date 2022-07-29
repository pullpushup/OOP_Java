import java.util.Locale;

public class SwitchStatement {
    public static void main(String[] args)
    {
        int value = 3;

        if(value == 1){
            System.out.println("Value was 1");
        } else if (value ==2) {
            System.out.println("Value was 2");
        }else{
            System.out.println("Was not found");
        }

        int switchValue =4;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }
        // a little challenge
        //Switch statement using char not int
        char charValue = 'A';
        switch(charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case'E':
                System.out.println(charValue + "was found");
            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }
        String month = "January";
        switch (month.toLowerCase(Locale.ROOT)){
            case "January":
                System.out.println("Jan");
                break;
            case "February":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not Correct!");

        }
    }
}
