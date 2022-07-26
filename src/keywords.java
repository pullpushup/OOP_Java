public class keywords {

    public static void main(String[] args){
        boolean gameOver = true;
        int score = 40000;
        int levelCompleted =8;
        int bonus = 1000;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
