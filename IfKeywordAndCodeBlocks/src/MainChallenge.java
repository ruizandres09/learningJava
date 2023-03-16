public class MainChallenge {
    public static void main(String[] arg) {

        displayHighScorePosition("Andres",calculateHighScorePosition(1500));
        displayHighScorePosition("Nicole",calculateHighScorePosition(1000));
        displayHighScorePosition("Sofia",calculateHighScorePosition(500));
        displayHighScorePosition("Eva",calculateHighScorePosition(100));
        displayHighScorePosition("Bandit",calculateHighScorePosition(25));
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted,int bonus ){

            int finalScore = score;

            if (gameOver) {
                finalScore += (levelCompleted * bonus);
                finalScore +=1000;
                System.out.println("Your final score was "+finalScore);
            }
    }
    public static void displayHighScorePosition (String Name, int position){

        System.out.println( Name + " managed to get into position " + position + " on the high score list");
    };
    public static int calculateHighScorePosition(int playerScore){

        int position = 4;
        if (playerScore>=1000){
            position = 1;
        }
        else if (playerScore >= 500){
            position = 2;
        }
        else if (playerScore >= 100){
            position = 3;
        }
        return position;
    };
}
