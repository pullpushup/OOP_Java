public class methods {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highscore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highscore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highscore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highscore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Sir", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Sam", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("West", highScorePosition);

        highScorePosition = calculateHighScorePosition(1090);
        displayHighScorePosition("Harry",highScorePosition);

        highScorePosition = calculateHighScorePosition(525);
        displayHighScorePosition("Loi",highScorePosition);

        highScorePosition = calculateHighScorePosition(105);
        displayHighScorePosition("Justin",highScorePosition);
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition +
                " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000){
//            return  1;
//        } else if (playerScore>=500) {
//            return 2;
//        } else if (playerScore>=100) {
//            return 3;
//        }
//            return 4;
//    }
        int position = 4; // assuming position 4 will be returned
        if(playerScore >= 1000){
            position = 1;
        }else if (playerScore>=500){
            position = 2;
        } else if (playerScore>=100) {
            position =3;
        }
        return position;
    }


    public static int calculateScore(boolean gameOver, int score,int levelCompleted, int bonus){

         if(gameOver) {
            int finalScore = score +(levelCompleted * bonus);
            finalScore += 1500;
            return finalScore;
        }
         return -1;
    }
}
