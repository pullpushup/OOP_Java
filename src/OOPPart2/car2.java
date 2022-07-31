package OOPPart2;

public class car2 extends Veh2{
    private int door;
    private int engineCapacity;

    public car2(String name, int doors, int engineCapacity) {
        super(name);
        this.door = doors;
        this.engineCapacity = engineCapacity;
    }
}
