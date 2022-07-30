package Classes;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,int legs, int tail, int teeth, String coat) {
        super(name,1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chew the chicken");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating again but it's biscuit");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("A Dog walk");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog is Running");
        move(20);
    }
    public void moveLegs(int speed){
        System.out.println("Dog");
    }
    public void move(int speed){
        System.out.println(" its move with speed");
        moveLegs(speed);
        super.move(speed);
    }
}
