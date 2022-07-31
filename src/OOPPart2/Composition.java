package OOPPart2;

public class Composition {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20,25,5);
        Case theCase = new Case("55A0","HP","550",dimensions);

        Monitor theMonitor = new Monitor("31 inch","Huawei",31,new Resolution(1920,1080));

        Motherboard theMotherboard= new Motherboard("AB-5000","Intel",2,4,"v2.44");

        PC thePc = new PC(theCase,theMonitor,theMotherboard);
        thePc.powerUp();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,550);

        Bed bed = new Bed("Classic",2,3,2);

        Lamp lamp = new Lamp("Modern",false,75);

        Bedroom bedroom = new Bedroom("Sleeping",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }

}
