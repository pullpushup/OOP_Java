package OOPPart2;

public class Composition {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20,25,5);
        Case theCase = new Case("55A0","HP","550",dimensions);

        Monitor theMoniter = new Monitor("31 inch","Huawei",31,new Resolution(1920,1080));

        Motherboard theMotherboard= new Motherboard("AB-5000","Intel",2,4,"v2.44");

        PC thePc = new PC(theCase,theMoniter,theMotherboard);
        thePc.getMonitor().drawPixelAt(1280,720,"red");
        thePc.getMotherboard().loadProgram("Windows 1.0");
        thePc.getTheCase().pressPowerButton();
    }

}
