package JavaProblems;

public class ReverseString {

    public static void main(String[] args){
        String name = "Ayushman";
       int ieng = name.length();
        String rev = "  ";

        for(int i = ieng-1; i>=0; i--)
        {
            rev += name.charAt(i);

        } System.out.println(rev);




    }

}
