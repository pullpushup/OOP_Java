package OOPPart2;
import java.util.function.Predicate;

interface Evaluate<T>{
    boolean isNegative(T t); //similar to predicate
}

public class lambdas {
    public static void main(String[] args){
        Evaluate<Integer> lambda = i-> i < 0;
        System.out.println("Evalute : " + lambda.isNegative(-1));
        System.out.println("Evalute : " + lambda.isNegative(+1) );

        Predicate<Integer> predicate = i-> i <0;
        System.out.println("Predicate: " + predicate.test(-1));
        System.out.println("Predicate: " + predicate.test(+1));

        int x = 4;
        System.out.println("Is "+x+" even? "+check(4, n -> n % 2 == 0));//true
        x=7;
        System.out.println("Is "+x+" even? "+check(7, y -> y % 2 == 0));//false

        String name="Mr. Joe Bloggs";
        System.out.println("Does "+name+" start with Mr. ? "+
                check("Mr. Joe Bloggs", s -> s.startsWith("Mr.")));//true
        name="Ms. Ann Bloggs";
        System.out.println("Does "+name+" start with Mr. ? "+
                check("Ms. Ann Bloggs", s -> s.startsWith("Mr.")));//false

    }
    public static <T> boolean check(T t, Predicate<T> lambda) {
        return lambda.test(t);
    }
}
