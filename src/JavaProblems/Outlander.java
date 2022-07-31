package JavaProblems;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander( int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 10, false, 5);
        this.roadServiceMonths = roadServiceMonths;
    }
}
