package Classes;

public class Inheritance {
    public static void main(String[] args){
        Animal animal= new Animal("Animal",1,1,5,50);

        Dog dog= new Dog("Yuki",5,25,4,1,30,"Long");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
