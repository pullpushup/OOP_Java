package OOPPart2;

public class Encapsulation {
    public static void main(String[] args){
//        Player player = new Player();
//        player.name= "Sam";
//        player.health = 25;
//        player.weapon = "Guns";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Ayush",70,"Ar 15");
        System.out.println("Initial health " + player.getHitPoints());

    }

}
