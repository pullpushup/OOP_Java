
package JavaProblems;
import java.util.HashMap;


public class Hash_map {
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String,Integer> happy = new HashMap();
        happy.put("a",10);
        happy.put("b",3);
        happy.put("c",88);

        System.out.println(happy.get("c"));
    }
}
